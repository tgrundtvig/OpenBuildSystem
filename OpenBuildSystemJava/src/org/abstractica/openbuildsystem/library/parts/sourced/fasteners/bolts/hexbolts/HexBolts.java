package org.abstractica.openbuildsystem.library.parts.sourced.fasteners.bolts.hexbolts;

import org.abstractica.openbuildsystem.oldstuff.Core;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Group3D;
import org.abstractica.openbuildsystem.library.util.math.HexMath;

public class HexBolts
{
	public static Geometry3D M3x4(Core c)
	{
		return hexBolt(c, 3.0, 4.0, 4.0, 5.5, 3.0);
	}

	public static Geometry3D M3x5(Core c)
	{
		return hexBolt(c, 3.0, 5.0, 5.0, 5.5, 3.0);
	}

	public static Geometry3D M3x6(Core c)
	{
		return hexBolt(c, 3.0, 6.0, 6.0, 5.5, 3.0);
	}

	public static Geometry3D M3x8(Core c)
	{
		return hexBolt(c, 3.0, 8.0, 8.0, 5.5, 3.0);
	}

	public static Geometry3D M3x10(Core c)
	{
		return hexBolt(c, 3.0, 10.0, 10.0, 5.5, 3.0);
	}

	public static Geometry3D M3x12(Core c)
	{
		return hexBolt(c, 3.0, 12.0, 12.0, 5.5, 3.0);
	}

	public static Geometry3D M3x14(Core c)
	{
		return hexBolt(c, 3.0, 14.0, 14.0, 5.5, 3.0);
	}

	public static Geometry3D M3x16(Core c)
	{
		return hexBolt(c, 3.0, 16.0, 16.0, 5.5, 3.0);
	}

	public static Geometry3D M3x18(Core c)
	{
		return hexBolt(c, 3.0, 18.0, 18.0, 5.5, 3.0);
	}

	public static Geometry3D M3x20(Core c)
	{
		return hexBolt(c, 3.0, 20.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x22(Core c)
	{
		return hexBolt(c, 3.0, 22.0, 22.0, 5.5, 3.0);
	}

	public static Geometry3D M3x25(Core c)
	{
		return hexBolt(c, 3.0, 25.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x30(Core c)
	{
		return hexBolt(c, 3.0, 30.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x35(Core c)
	{
		return hexBolt(c, 3.0, 35.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x40(Core c)
	{
		return hexBolt(c, 3.0, 40.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x45(Core c)
	{
		return hexBolt(c, 3.0, 45.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x50(Core c)
	{
		return hexBolt(c, 3.0, 50.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x4_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 4.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x5_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 5.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x6_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 6.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x8_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 8.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x10_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 10.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x12_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 12.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x14_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 14.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x16_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 16.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x18_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 18.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x20_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 20.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x22_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 22.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x25_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 25.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x30_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 30.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x35_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 35.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x40_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 40.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x45_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 45.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x50_Cutout(Core c, double fitting, boolean fixOverhang)
	{
		return hexBoltCutout(c, 3.0, 50.0, 5.5, 3.0, fitting, fixOverhang);
	}

	private static Geometry3D hexBolt(Core c, double diameter, double length, double threadLength, double headWidth, double headHeight)
	{
		Group3D res = c.union3D();
		//Head
		Group3D headColor = c.color("silver");
		Group3D headTranslate = c.translate3D(0,0,-headHeight);
		Geometry3D head = c.cylinder3D(HexMath.hexagon_Diameter(headWidth), headHeight, 6);
		headColor.add(head);
		headTranslate.add(headColor);
		res.add(headTranslate);

		//Non threaded part
		if(length > threadLength)
		{
			Geometry3D nonThreaded = c.cylinder3D(diameter, length - threadLength, 32);
			Group3D nonThreadedColor = c.color("silver");
			nonThreadedColor.add(nonThreaded);
			res.add(nonThreadedColor);
		}
		//Threaded part
		Group3D threadedTranslate = c.translate3D(0,0, length-threadLength);
		Geometry3D threaded = c.cylinder3D(diameter, threadLength, 32);
		Group3D threadedColor = c.color("grey");
		threadedColor.add(threaded);
		threadedTranslate.add(threadedColor);
		res.add(threadedTranslate);
		return res;
	}

	private static Geometry3D hexBoltCutout(Core c,
	                                        double diameter,
	                                        double length,
	                                        double headWidth,
	                                        double headHeight,
	                                        double fitting,
	                                        boolean fixOverhang)
	{
		Group3D res = c.union3D();
		//Head
		Group3D headTranslate = c.translate3D(0,0,-headHeight-fitting);
		Geometry3D head = c.cylinder3D(HexMath.hexagon_Diameter(headWidth+2*fitting), headHeight+2*fitting, 6);
		headTranslate.add(head);

		//Body
		Geometry3D body = c.cylinder3D(diameter+2*fitting, length + fitting, 64);
		res.add(body);

		//fix overhang
		if(fixOverhang)
		{
			Group3D hull = c.hull3D();
			hull.add(headTranslate);
			double height = 0.5 * (HexMath.hexagon_Diameter(headWidth+2*fitting)-(diameter+2*fitting));
			Geometry3D cyl = c.cylinder3D(diameter+2*fitting,height,64);
			hull.add(cyl);
			res.add(hull);
		}
		else
		{
			res.add(headTranslate);
		}
		return res;
	}
}
