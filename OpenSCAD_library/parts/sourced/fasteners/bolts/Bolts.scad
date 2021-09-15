include <core/Core.scad>
use <parts/sourced/fasteners/bolts/allen_bolts/Allen_Bolts.scad>
use <generators/sourced/fasteners/bolts/allen_bolt/Allen_Bolt.scad>
use <parts/sourced/fasteners/bolts/hex_bolts/Hex_Bolts.scad>
use <generators/sourced/fasteners/bolts/hex_bolt/Hex_Bolt.scad>

function Bolt_Parts() = Flatten
(
    [
        Extend_Type("Bolt", Allen_Bolt_Parts()),
        Extend_Type("Bolt", Hex_Bolt_Parts())
    ] 
    
);

  
module Part_Bolt(type, values)
{
    if(type == "Allen_Bolt")
    {
        Allen_Bolt(values);
    }
    else if(type == "Hex_Bolt")
    {
        Hex_Bolt(values);
    }
}

//Part_Bolt("Allen_Bolt",[   3,  12, 12, 5.4,    3,  2.5,    2,  32  ]); 

