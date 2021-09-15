include <core/Core.scad>
include <parts/assembled/Assembled.scad>
include <parts/laser_cut/Laser_Cut.scad>
include <parts/machined/Machined.scad>
include <parts/printed/Printed.scad>
include <parts/sourced/Sourced.scad>



function All_Parts() = 
    Flatten
    (
        [
            Assembled_Parts(),
            //Laser_Cut_Parts(),
            Machined_Parts(),
            //Printed_Parts(),
            Sourced_Parts()
        ] 
    );

module Part(part_id)
{
    all_parts = All_Parts();
    part = Find_Part(all_parts, part_id);
    if(part == 0)
    {
        echo("Could not find part: ", part_id);
    }
    else
    {
        values = part[1];
        type = part[2];
        if(type[0] == "Assembled")
        {
           echo("Starting assembly of: ", part[0]); 
           Part_Assembled(type[1], values);
        }
        else if(type[0] == "Laser_Cut")
        {
           echo("Used laser cut part: ", part[0]);
           Part_Laser_Cut(type[1], values);
        }
    
        else if(type[0] == "Machined")
        {
           echo("Used machined part: ", part[0]); 
           Part_Machined(type[1], values);
        }
        
        else if(type[0] == "Printed")
        {
           echo("Used 3D printed part: ", part[0]); 
           Part_Printed(type[1], values);
        }
            
        else if(type[0] == "Sourced")
        {
           echo("Used sourced part: ", part[0]); 
           Part_Sourced(type[1], values);
        }
        else
        {
            echo("Could not regconize part type: ", type);
        }
    }
}