use <parts/sourced/fasteners/Fasteners.scad>

function Sourced_Parts() = Flatten
(
    [
        Extend_Type("Sourced", Fastener_Parts()),
        //Extend_Type("Fastener", Nuts()),
        //Extend_Type("Fastener", Inserts())
    ] 
    
);

  
module Part_Sourced(type, values)
{
    if(type[0] == "Fastener")
    {
        Part_Fastener(type[1], values);
    }
}

//Part_Fastener(["Bolt", "Allen_Bolt"],[   3,  12, 12, 5.4,    3,  2.5,    2,  32  ]); 
//Part_Fastener(["Bolt", "Hex_Bolt"],[   3,  25, 15, 5.4,    3,  32  ]); 

