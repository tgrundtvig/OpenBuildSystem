XYZFrame_20x10x6();


module XYZFrame_20x10x6()
{
    union()
    {
        translate([10.0000, 10.0000, 0.0000])
        {
            AluRod_U10_L6();
        }
        translate([180.0000, 10.0000, 0.0000])
        {
            AluRod_U10_L6();
        }
        translate([10.0000, 80.0000, 0.0000])
        {
            AluRod_U10_L6();
        }
        translate([180.0000, 80.0000, 0.0000])
        {
            AluRod_U10_L6();
        }
        translate([0.0000, 0.0000, 10.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                AluRod_U10_L20();
            }
        }
        translate([0.0000, 0.0000, 40.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                AluRod_U10_L20();
            }
        }
        translate([0.0000, 90.0000, 10.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                AluRod_U10_L20();
            }
        }
        translate([0.0000, 90.0000, 40.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                AluRod_U10_L20();
            }
        }
        translate([0.0000, 0.0000, 0.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                AluRod_U10_L10();
            }
        }
        translate([0.0000, 0.0000, 50.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                AluRod_U10_L10();
            }
        }
        translate([190.0000, 0.0000, 0.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                AluRod_U10_L10();
            }
        }
        translate([190.0000, 0.0000, 50.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                AluRod_U10_L10();
            }
        }
        translate([-10.0000, 10.0000, 0.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([-10.0000, 80.0000, 0.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([-10.0000, 10.0000, 50.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([-10.0000, 80.0000, 50.0000])
        {
            rotate([0.0000, 90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([200.0000, 10.0000, 0.0000])
        {
            rotate([0.0000, -90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([200.0000, 80.0000, 0.0000])
        {
            rotate([0.0000, -90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([200.0000, 10.0000, 50.0000])
        {
            rotate([0.0000, -90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([200.0000, 80.0000, 50.0000])
        {
            rotate([0.0000, -90.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([10.0000, 100.0000, 10.0000])
        {
            rotate([90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([180.0000, 100.0000, 10.0000])
        {
            rotate([90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([10.0000, 100.0000, 40.0000])
        {
            rotate([90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([180.0000, 100.0000, 40.0000])
        {
            rotate([90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([10.0000, -10.0000, 10.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([180.0000, -10.0000, 10.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([10.0000, -10.0000, 40.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([180.0000, -10.0000, 40.0000])
        {
            rotate([-90.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([0.0000, 0.0000, -10.0000])
        {
            translate([0.0000, 0.0000, 5.0000])
            {
                AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
            }
        }
        translate([190.0000, 0.0000, -10.0000])
        {
            translate([0.0000, 0.0000, 5.0000])
            {
                AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
            }
        }
        translate([0.0000, 90.0000, -10.0000])
        {
            translate([0.0000, 0.0000, 5.0000])
            {
                AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
            }
        }
        translate([190.0000, 90.0000, -10.0000])
        {
            translate([0.0000, 0.0000, 5.0000])
            {
                AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
            }
        }
        translate([0.0000, 0.0000, 60.0000])
        {
            rotate([180.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([190.0000, 0.0000, 60.0000])
        {
            rotate([180.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([0.0000, 90.0000, 60.0000])
        {
            rotate([180.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
        translate([190.0000, 90.0000, 60.0000])
        {
            rotate([180.0000, 0.0000, 0.0000])
            {
                translate([0.0000, 0.0000, 5.0000])
                {
                    AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big();
                }
            }
        }
    }
}

module AluRod_U10_L10()
{
    color("silver")
    {
        difference()
        {
            translate([-5.0000, -5.0000, -5.0000])
            {
                difference()
                {
                    cube([10.0000, 10.0000, 100.0000]);
                    translate([1.0000, 1.0000, -1.0000])
                    {
                        cube([8.0000, 8.0000, 102.0000]);
                    }
                }
            }
            translate([0.0000, 0.0000, 0.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 10.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 20.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 30.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 40.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 50.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 60.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 70.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 80.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 90.0000])
            {
                AluRod_10_HoleCutout();
            }
        }
    }
}

module AluRod_U10_L20()
{
    color("silver")
    {
        difference()
        {
            translate([-5.0000, -5.0000, -5.0000])
            {
                difference()
                {
                    cube([10.0000, 10.0000, 200.0000]);
                    translate([1.0000, 1.0000, -1.0000])
                    {
                        cube([8.0000, 8.0000, 202.0000]);
                    }
                }
            }
            translate([0.0000, 0.0000, 0.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 10.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 20.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 30.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 40.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 50.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 60.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 70.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 80.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 90.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 100.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 110.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 120.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 130.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 140.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 150.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 160.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 170.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 180.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 190.0000])
            {
                AluRod_10_HoleCutout();
            }
        }
    }
}

module AluRod_U10_L6()
{
    color("silver")
    {
        difference()
        {
            translate([-5.0000, -5.0000, -5.0000])
            {
                difference()
                {
                    cube([10.0000, 10.0000, 60.0000]);
                    translate([1.0000, 1.0000, -1.0000])
                    {
                        cube([8.0000, 8.0000, 62.0000]);
                    }
                }
            }
            translate([0.0000, 0.0000, 0.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 10.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 20.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 30.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 40.0000])
            {
                AluRod_10_HoleCutout();
            }
            translate([0.0000, 0.0000, 50.0000])
            {
                AluRod_10_HoleCutout();
            }
        }
    }
}

module AllenBolt_M3x25_With_HexNut_M3_And_Flat_Washer_M3_Big()
{
    union()
    {
        translate([0.0000, 0.0000, -0.5000])
        {
            AllenBolt_M3x25();
            Flat_Washer_M3_Big();
        }
        translate([0.0000, 0.0000, 20.0000])
        {
            Flat_Washer_M3_Big();
        }
        translate([0.0000, 0.0000, 20.5000])
        {
            HexNut_M3();
        }
    }
}

module HexNut_M3()
{
    color("silver")
    {
        difference()
        {
            cylinder(d = 6.3509, h = 2.0000, $fn = 6);
            translate([0.0000, 0.0000, -1.0000])
            {
                cylinder(d = 3.0000, h = 4.0000, $fn = 32);
            }
        }
    }
}

module AluRod_10_HoleCutout()
{
    union()
    {
        rotate([0.0000, 90.0000, 0.0000])
        {
            translate([0.0000, 0.0000, -6.0000])
            {
                cylinder(d = 3.0000, h = 12.0000, $fn = 32);
            }
        }
        rotate([90.0000, 0.0000, 0.0000])
        {
            translate([0.0000, 0.0000, -6.0000])
            {
                cylinder(d = 3.0000, h = 12.0000, $fn = 32);
            }
        }
    }
}

module AllenBolt_M3x25()
{
    union()
    {
        translate([0.0000, 0.0000, -3.0000])
        {
            color("silver")
            {
                difference()
                {
                    cylinder(d = 5.4000, h = 3.0000, $fn = 32);
                    translate([0.0000, 0.0000, -1.0000])
                    {
                        cylinder(d = 2.8868, h = 2.5000, $fn = 6);
                    }
                }
            }
        }
        color("silver")
        {
            cylinder(d = 3.0000, h = 5.0000, $fn = 32);
        }
        translate([0.0000, 0.0000, 5.0000])
        {
            color("grey")
            {
                cylinder(d = 3.0000, h = 20.0000, $fn = 32);
            }
        }
    }
}

module Flat_Washer_M3_Big()
{
    color("silver")
    {
        difference()
        {
            cylinder(d = 8.0000, h = 0.5000, $fn = 32);
            translate([0.0000, 0.0000, -1.0000])
            {
                cylinder(d = 3.2000, h = 2.5000, $fn = 32);
            }
        }
    }
}

