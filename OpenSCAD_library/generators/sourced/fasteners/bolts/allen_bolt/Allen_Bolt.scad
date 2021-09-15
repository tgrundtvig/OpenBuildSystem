include <core/Core.scad>

test_M3x35 = [3, 35, 25, 5.5, 3, 2.5, 2, 32]; 

translate([-5,0,0])
Allen_Bolt(test_M3x35);
translate([5,0,0])
Allen_Bolt_Cutout(test_M3x35);

module Allen_Bolt(values)
{
    diameter = values[0];
    length = values[1];
    thread_length = values[2];
    head_diameter = values[3];
    head_height = values[4];
    hex_width = values[5];
    hex_depth = values[6];
    angular_resolution = values[7];
    
    difference()
    {
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
            Cylinder(   diameter=head_diameter,
                        height=head_height,
                        t_z="pos",
                        angular_resolution=angular_resolution);
        }
        //Hex hole
        translate([0,0,head_height-hex_depth])
        color("silver")
        Cylinder(   diameter=Hexagon_Diameter(hex_width),
                    height=hex_depth+1,
                    t_z="pos",
                    angular_resolution=6 );
    }
}

module Allen_Bolt_Cutout(values, insert_length = 0, fitting = 0.2, fix_overhang = false)
{
    diameter = values[0];
    length = values[1];
    head_diameter = values[3];
    head_height = values[4];
    angular_resolution = values[7];

    color("green")

    union()
    {
        if(fix_overhang)
        {
            hull()
            {
                //Heads
                Cylinder(   diameter=head_diameter+2*fitting,
                            height=head_height+insert_length,
                            t_z="pos",
                            angular_resolution=angular_resolution);
                Cylinder(   diameter=diameter+2*fitting,
                            height=0.5*(head_diameter - diameter),
                            t_z="neg",
                            angular_resolution=angular_resolution);
            } 
        }
        else
        {
            //Head
            Cylinder(   diameter=head_diameter+2*fitting,
                        height=head_height+insert_length,
                        t_z="pos",
                        angular_resolution=angular_resolution);       
        }
        Cylinder(   diameter=diameter+2*fitting,
                    height=length,
                    t_z="neg",
                    angular_resolution=angular_resolution);
    }
}