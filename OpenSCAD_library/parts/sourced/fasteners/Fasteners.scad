include <core/Core.scad>
use <parts/sourced/fasteners/bolts/Bolts.scad>
use <parts/sourced/fasteners/Nuts/Nuts.scad>
use <parts/sourced/fasteners/washers/Washers.scad>
use <generators/sourced/fasteners/washers/Washer.scad>

function Fastener_Parts() = Flatten
(
    [
        Extend_Type("Fastener", Bolt_Parts()),
        Extend_Type("Fastener", Washer_Parts()),
        Extend_Type("Fastener", Nut_Parts()),
        //Extend_Type("Fastener", Inserts())
    ] 
    
);

  
module Part_Fastener(type, values)
{
    if(type[0] == "Bolt")
    {
        Part_Bolt(type[1], values);
    }
    else if(type == "Washer")
    {
        Washer(values);
    }
    else if(type[0] == "Nut")
    {
        Part_Nut(type[1], values);
    }
}

//Part_Fastener(["Bolt", "Allen_Bolt"],[   3,  12, 12, 5.4,    3,  2.5,    2,  32  ]); 
//Part_Fastener(["Bolt", "Hex_Bolt"],[   3,  25, 15, 5.4,    3,  32  ]); 

