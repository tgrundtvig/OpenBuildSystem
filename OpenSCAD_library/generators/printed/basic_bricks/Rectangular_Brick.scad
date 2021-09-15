include <core/Core.scad>

Rectangular_Brick([5, 2, 1, 10, 3, 32]);

module Rectangular_Brick(values)
{
    size_x = values[0];
    size_y = values[1];
    size_z = values[2];
    unit = values[3];
    hole = values[4];
    ang_res = values[5];
    difference()
    {
        Box([unit*size_x, unit*size_y, unit*size_z], t_z = "pos");
        for(x = [0 : size_x-1])
                for(z = [0 : size_z-1])
                    translate(  [unit*(-0.5*size_x+0.5+x),
                                0,
                                unit*(0.5+z)])
                    rotate([90,0,0])
                    Cylinder(   diameter=hole,
                                height=unit*size_y+2,
                                angular_resolution=ang_res);
        for(y = [0 : size_y-1])
                for(z = [0 : size_z-1])
                    translate([ 0,
                                unit*(-0.5*size_y+0.5+y),
                                unit*(0.5+z)])
                    rotate([0,90,0])
                    Cylinder(   diameter=hole,
                                height=unit*size_x+2,
                                angular_resolution=ang_res);
        for(x = [0 : size_x-1])
                for(y = [0 : size_y-1])
                    translate([ unit*(-0.5*size_x+0.5+x),
                                unit*(-0.5*size_y+0.5+y),
                                -1])
                    Cylinder(   diameter=hole,
                                height=unit*size_z+2,
                                t_z="pos",
                                angular_resolution=ang_res);
                
    }
}