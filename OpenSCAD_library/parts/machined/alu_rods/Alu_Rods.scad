include <core/Core.scad>
use <parts/machined/alu_rods/alu_rect_rods/Alu_Rect_Rods.scad>
use <generators/machined/alu_rods/alu_rect_rods/Alu_Rect_Rod.scad>

function Alu_Rod_Parts() = Flatten
(
    [
        Extend_Type("Alu_Rod", Alu_Rect_Rod_Parts()),
    ] 
    
);

  
module Part_Alu_Rod(type, values)
{
    if(type == "Alu_Rect_Rod")
    {
        Alu_Rect_Rod(values);
    }
    else
    {
        echo("Counld not find type: ", type);
    }
}

