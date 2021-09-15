include <core/Core.scad>

module Alu_Rect_Rod(values)
{
    size_x = values[0];
    size_y = values[1];
    length = values[2];
    mat = values[3];
    unit = values[4];
    hole = values[5];
    ang_res = values[6];
    color("silver")
    difference()
    {
        Box([unit*size_x, unit*size_y, unit*length], t_z = "pos");
        translate([0,0,-1])
        Box([unit*size_x-2*mat, unit*size_y-2*mat, unit*length+2], t_z="pos");
        for(x = [0 : size_x-1])
                for(z = [0 : length-1])
                    translate([unit*(-0.5*size_x+0.5+x),0,unit*(0.5+z)])
                    rotate([90,0,0])
                    Cylinder(diameter=hole, height=unit*size_y+2, angular_resolution=ang_res);
        for(y = [0 : size_y-1])
                for(z = [0 : length-1])
                    translate([0, unit*(-0.5*size_y+0.5+y),unit*(0.5+z)])
                    rotate([0,90,0])
                    Cylinder(diameter=hole, height=unit*size_x+2, angular_resolution=ang_res);
                
    }
}