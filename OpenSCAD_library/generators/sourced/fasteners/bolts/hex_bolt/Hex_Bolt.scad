include <core/Core.scad>

translate([-5,0,0])
Hex_Bolt( [3,12,10,5.5,3,32]);
          
translate([5,0,0])     
Hex_Bolt_Cutout([3,12,10,5.5,3,32],
                fitting = 0.2,
                fix_overhang = true);

module Hex_Bolt(values)
{
    diameter = values[0];
    length = values[1];
    thread_length = values[2];
    head_width  = values[3];
    head_height  = values[4];
    angular_resolution = values[5];
    
    union()
    {
        //Non-threaded part
        if(thread_length < length)
        {
            color("silver")
            Cylinder(   diameter=diameter,
                        height=length-thread_length,
                        t_z="neg",
                        angular_resolution=angular_resolution);
        }
        //Threaded part
        translate([0,0,-(length-thread_length)])
        color("grey")
        Cylinder(   diameter=diameter,
                    height=thread_length,
                    t_z="neg",
                    angular_resolution=angular_resolution);
        
        //Head
        color("silver")
        Cylinder(   diameter=Hexagon_Diameter(head_width),
                    height=head_height,
                    t_z="pos",
                    angular_resolution=6);
    }   
}

module Hex_Bolt_Cutout( values,
                        fitting = 0.2,
                        fix_overhang = false)
{
    diameter = values[0];
    length = values[1];
    head_width  = values[3];
    head_height  = values[4];
    angular_resolution = values[5];
    color("green")
    union()
    {
        if(fix_overhang)
        {
            hull()
            {
                //Head
                Cylinder(   diameter=Hexagon_Diameter(head_width+2*fitting),
                            height=head_height,
                            t_z="pos",
                            angular_resolution=6);
                Cylinder(   diameter=diameter+2*fitting,
                            height=0.5*(Hexagon_Diameter(head_width+2*fitting) - diameter),
                            t_z="neg",
                            angular_resolution=angular_resolution);
            } 
        }
        else
        {
            //Head
            Cylinder(   diameter=Hexagon_Diameter(head_width+2*fitting),
                        height=head_height,
                        t_z="pos",
                        angular_resolution=6);         
        }
        Cylinder(   diameter=diameter+2*fitting,
                    height=length,
                    t_z="neg",
                    angular_resolution=angular_resolution);
    }
}