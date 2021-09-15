include <core/Core.scad>
use <parts/machined/alu_rods/Alu_Rods.scad>

function Machined_Parts() = Flatten
(
    [
        Extend_Type("Machined", Alu_Rod_Parts()),
    ] 
    
);

  
module Part_Machined(type, values)
{
    if(type[0] == "Alu_Rod")
    {
        Part_Alu_Rod(type[1], values);
    }
    else
    {
        echo("Counld not find type: ", type);
    }
}

