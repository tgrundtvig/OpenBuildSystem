include<parts/Parts.scad>

XYZ_Frame(
[
    10,                     //unit
    "Alu10_Rect_Rod_1x1x20",  // rod_x
    20,                     // size_x
    "Alu10_Rect_Rod_1x1x12",  // rod_y
    12,                     // size_y
    "Alu10_Rect_Rod_1x1x6",   // rod_z
    6,                      // size_z
    "Allen_Bolt_M3x25",     // bolt (must be able to span 2 * unit)
    "M3_Small_Washer",      // Washer
    0.5,                    // Washer height
    "M3_Hex_Nut"            // Nut
]);

module XYZ_Frame(values)
{
    unit = values[0];
    rod_x = values[1];
    size_x = values[2];
    rod_y = values[3];
    size_y = values[4];
    rod_z = values[5];
    size_z = values[6];
    bolt = values[7];
    washer = values[8];
    washer_height = values[9];
    nut = values[10];
  
    union()
    {
        translate([0,unit,0])
        make_frame( size_x = size_x,
                    size_y = size_y,
                    size_z = size_z,
                    unit = unit)
        {
            translate([0,0,-0.5*unit])
            Part(rod_x);
            translate([0,0,-0.5*unit])
            Part(rod_y);
            translate([0,0,-0.5*unit])
            Part(rod_z);
            
            translate([0,0,0.5*unit])
            {
                //Bolt
                translate([0,0,washer_height])
                Part(bolt);
                
                //Top washer
                Part(washer);
                
                //Bottom washer
                translate([0,0,-2*unit])
                rotate([180,0,0])
                Part(washer);
                
                //Nut
                translate([0,0,-2*unit-washer_height])
                rotate([180,0,0])
                Part(nut);
            }
        }
    }
}


module make_frame(size_x, size_y, size_z, unit)
{
    rotate([0,90,0])
    children(0);
    
    translate([0,unit*(size_y-3),0])
    rotate([0,90,0])
    children(0);
    
    translate([0,0,unit*(size_z-1)])
    rotate([0,90,0])
    children(0);
    
    translate([0,unit*(size_y-3),unit*(size_z-1)])
    rotate([0,90,0])
    children(0);
    
    translate([unit,-unit,unit])
    rotate([-90,0,0])
    children(1);
    
    translate([unit*(size_x-2),-unit,unit])
    rotate([-90,0,0])
    children(1);
    
    translate([unit,-unit,unit*(size_z-2)])
    rotate([-90,0,0])
    children(1);
    
    translate([unit*(size_x-2),-unit,unit*(size_z-2)])
    rotate([-90,0,0])
    children(1);
    
    translate([0,-unit,0])
    children(2);
    
    translate([unit*(size_x-1),-unit,0])
    children(2);
    
    translate([0,unit*(size_y-2),0])
    children(2);
    
    translate([unit*(size_x-1),unit*(size_y-2),0])
    children(2);
    
    ////////////////////////////////////////
    translate([unit,0,0])
    rotate([180,0,0])
    children(3);
    
    translate([unit*(size_x-2),0,0])
    rotate([180,0,0])
    children(3);
    
    translate([unit,unit*(size_y-3),0])
    rotate([180,0,0])
    children(3);
    
    translate([unit*(size_x-2),unit*(size_y-3),0])
    rotate([180,0,0])
    children(3);
    
    ///////////////////////////////////////////7
    translate([unit,0,unit*(size_z-1)])
    children(3);
    
    translate([unit*(size_x-2),0,unit*(size_z-1)])
    children(3);
    
    translate([unit,unit*(size_y-3),unit*(size_z-1)])
    children(3);
    
    translate([unit*(size_x-2),unit*(size_y-3),unit*(size_z-1)])
    children(3);
    
    ////////////////////////////////////////
    translate([0,-unit,0])
    rotate([90,0,0])
    children(3);
    
    translate([unit*(size_x-1),-unit,0])
    rotate([90,0,0])
    children(3);
    
    translate([0,-unit,unit*(size_z-1)])
    rotate([90,0,0])
    children(3);
    
    translate([unit*(size_x-1),-unit,unit*(size_z-1)])
    rotate([90,0,0])
    children(3);
    
    //////////////////////////////////////
    
    translate([0,unit*(size_y-2),0])
    rotate([-90,0,0])
    children(3);
    
    translate([unit*(size_x-1),unit*(size_y-2),0])
    rotate([-90,0,0])
    children(3);
    
    translate([0,unit*(size_y-2),unit*(size_z-1)])
    rotate([-90,0,0])
    children(3);
    
    translate([unit*(size_x-1),unit*(size_y-2),unit*(size_z-1)])
    rotate([-90,0,0])
    children(3);
    
    //////////////////////////////////////
    
    translate([0,-unit,unit])
    rotate([0,-90,0])
    children(3);
    
    translate([0,unit*(size_y-2),unit])
    rotate([0,-90,0])
    children(3);
    
    translate([0,-unit,unit*(size_z-2)])
    rotate([0,-90,0])
    children(3);
    
    translate([0,unit*(size_y-2),unit*(size_z-2)])
    rotate([0,-90,0])
    children(3);
    
    //////////////////////////////////////
    
    translate([unit*(size_x-1),-unit,unit])
    rotate([0,90,0])
    children(3);
    
    translate([unit*(size_x-1),unit*(size_y-2),unit])
    rotate([0,90,0])
    children(3);
    
    translate([unit*(size_x-1),-unit,unit*(size_z-2)])
    rotate([0,90,0])
    children(3);
    
    translate([unit*(size_x-1),unit*(size_y-2),unit*(size_z-2)])
    rotate([0,90,0])
    children(3);
}