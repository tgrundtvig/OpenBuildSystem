include <core/Core.scad>

// Data values
//[diameter, length, thread_length, head_diameter, head_height, hex_width, hex_depthm, angular_resolution]

function XYZ_Frame_Parts() = 
Add_Type("XYZ_Frame",
[
    [   "XYZ_Frame_Alu10_20x20x20",
        [
            10,                         // unit
            "Alu10_Rect_Rod_1x1x20",    // rod_x
            20,                         // size_x
            "Alu10_Rect_Rod_1x1x20",    // rod_y
            20,                         // size_y
            "Alu10_Rect_Rod_1x1x20",    // rod_z
            20,                         // size_z
            "Hex_Bolt_M3x25",           // bolt (must be able to span 2 * unit)
            "M3_Small_Washer",          // Washer
            0.5,                        // Washer height
            "M3_Hex_Nut"                // Nut
        ]
    ],
    [   "XYZ_Frame_Alu10_20x12x6",
        [
            10,                         // unit
            "Alu10_Rect_Rod_1x1x20",    // rod_x
            20,                         // size_x
            "Alu10_Rect_Rod_1x1x12",    // rod_y
            12,                         // size_y
            "Alu10_Rect_Rod_1x1x6",     // rod_z
            6,                          // size_z
            "Allen_Bolt_M3x25",         // bolt (must be able to span 2 * unit)
            "M3_Small_Washer",          // Washer
            0.5,                        // Washer height
            "M3_Hex_Nut"                // Nut
        ]
    ]
]);  