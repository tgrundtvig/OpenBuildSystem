use <TestTmp.scad>

function Flatten(list) = [ for (i = list, v = i) v ];
    
__all_parts_list = All_Parts();
    
echo(__all_parts_list);