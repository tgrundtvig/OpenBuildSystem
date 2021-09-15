function Add_Type(type, list) =
[
    for(part = list)
        let(name = part[0])
        let(values = part[1])
        [name, values, type]
];

function Extend_Type(new_type, list) =
[
    for(part = list)
        let(name = part[0])
        let(values = part[1])
        let(type = part[2])
        [name, values, [new_type, type]]
];
    
function Find_Part(part_list, part_id) = rec_find(len(part_list)-1, part_id, part_list);

function rec_find(i, part_id, part_list) =
    i < 0 ? 0 :
    part_id == part_list[i][0] ? part_list[i] :
    rec_find(i - 1, part_id, part_list);

