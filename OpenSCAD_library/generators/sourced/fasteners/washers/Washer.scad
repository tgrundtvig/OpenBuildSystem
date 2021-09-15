include <core/Core.scad>
 
//Washer([3, 6, 0.5, 32]);

module Washer(values)
{
    inner_diameter = values[0];
    outer_diameter = values[1];
    height = values[2];
    ang_res = values[3];
    color("silver")
    Flat_Ring(  inner_diameter=inner_diameter,
                outer_diameter=outer_diameter,
                height=height,
                t_z="pos",
                angular_resolution=ang_res);
}