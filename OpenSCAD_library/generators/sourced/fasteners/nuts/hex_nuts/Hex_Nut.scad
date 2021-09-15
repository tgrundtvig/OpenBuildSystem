include <core/Core.scad>

Hex_Nut([3,5.5,2, 16]);

                

module Hex_Nut(values)
{
    bolt_diameter = values[0];
    nut_width = values[1];
    nut_height = values[2];
    angular_resolution = values[3];
    color("silver")
    translate([0,0,0.5*nut_height])
    difference()
    {
        //Nut
        Cylinder(   diameter=Hexagon_Diameter(nut_width),
                    height=nut_height,
                    angular_resolution=6);
        Cylinder(   diameter=bolt_diameter,
                    height=nut_height+2,
                    angular_resolution=angular_resolution);
        
    }   
}

module Hex_Nut_Cutout(  bolt_diameter,
                        bolt_length,
                        nut_width,
                        nut_height,
                        fitting = 0.2,
                        fix_overhang = false,
                        angular_resolution=32)
{
    color("green")
    hull()
    {
        //Nut
        Cylinder(   diameter=Hexagon_Diameter(nut_width),
                    height=nut_height,
                    angular_resolution=6);
        //Overhang
        Cylinder(   diameter=bolt_diameter,
                    height=Hexagon_Diameter(nut_width)-bolt_diameter+nut_height,
                    angular_resolution=angular_resolution);
    }
}