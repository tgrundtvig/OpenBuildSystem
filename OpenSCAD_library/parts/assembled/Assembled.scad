use <parts/assembled/frames/Frames.scad>

function Assembled_Parts() = Flatten
(
    [
        Extend_Type("Assembled", Frame_Parts())
    ] 
    
);
 
module Part_Assembled(type, values)
{
    if(type[0] == "Frame")
    {
        Part_Frame(type[1], values);
    }
}