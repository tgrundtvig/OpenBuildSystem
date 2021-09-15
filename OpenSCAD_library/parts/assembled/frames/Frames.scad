include <core/Core.scad>
use <parts/assembled/frames/xyz_frames/XYZ_Frames.scad>
use <generators/assembled/frames/xyz_frame/XYZ_Frame.scad>


function Frame_Parts() = Flatten
(
    [
        Extend_Type("Frame", XYZ_Frame_Parts())
    ] 
    
);

  
module Part_Frame(type, values)
{
    if(type == "XYZ_Frame")
    {
        XYZ_Frame(values);
    }
}
