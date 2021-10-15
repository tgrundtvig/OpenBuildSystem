package org.abstractica.openbuildsystem.library.parts.sourced.fasteners.bolts.hexbolts;

import org.abstractica.openbuildsystem.core.Core;
import org.abstractica.openbuildsystem.core.Geometry3D;
import org.abstractica.openbuildsystem.core.Node3D;
import org.abstractica.openbuildsystem.library.util.math.HexMath;

public class HexBolts
{
	public static Geometry3D M3x4()
	{
		return hexBolt("M3x4", 3.0, 4.0, 4.0, 5.5, 3.0);
	}

	public static Geometry3D M3x5()
	{
		return hexBolt("M3x5", 3.0, 5.0, 5.0, 5.5, 3.0);
	}

	public static Geometry3D M3x6()
	{
		return hexBolt("M3x6", 3.0, 6.0, 6.0, 5.5, 3.0);
	}

	public static Geometry3D M3x8()
	{
		return hexBolt("M3x8", 3.0, 8.0, 8.0, 5.5, 3.0);
	}

	public static Geometry3D M3x10()
	{
		return hexBolt("M3x10", 3.0, 10.0, 10.0, 5.5, 3.0);
	}

	public static Geometry3D M3x12()
	{
		return hexBolt("M3x12", 3.0, 12.0, 12.0, 5.5, 3.0);
	}

	public static Geometry3D M3x14()
	{
		return hexBolt("M3x14", 3.0, 14.0, 14.0, 5.5, 3.0);
	}

	public static Geometry3D M3x16()
	{
		return hexBolt("M3x16", 3.0, 16.0, 16.0, 5.5, 3.0);
	}

	public static Geometry3D M3x18()
	{
		return hexBolt("M3x18", 3.0, 18.0, 18.0, 5.5, 3.0);
	}

	public static Geometry3D M3x20()
	{
		return hexBolt("M3x20", 3.0, 20.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x22()
	{
		return hexBolt("M3x22", 3.0, 22.0, 22.0, 5.5, 3.0);
	}

	public static Geometry3D M3x25()
	{
		return hexBolt("M3x25", 3.0, 25.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x30()
	{
		return hexBolt("M3x30", 3.0, 30.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x35()
	{
		return hexBolt("M3x35", 3.0, 35.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x40()
	{
		return hexBolt("M3x40", 3.0, 40.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x45()
	{
		return hexBolt("M3x45", 3.0, 45.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x50()
	{
		return hexBolt("M3x50", 3.0, 50.0, 20.0, 5.5, 3.0);
	}

	public static Geometry3D M3x4_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x4", 3.0, 4.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x5_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x5", 3.0, 5.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x6_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x6", 3.0, 6.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x8_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x8", 3.0, 8.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x10_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x10", 3.0, 10.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x12_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x12", 3.0, 12.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x14_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x14", 3.0, 14.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x16_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x16", 3.0, 16.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x18_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x18", 3.0, 18.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x20_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x20", 3.0, 20.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x22_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x22", 3.0, 22.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x25_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x25", 3.0, 25.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x30_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x30", 3.0, 30.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x35_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x35", 3.0, 35.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x40_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x40", 3.0, 40.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x45_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x45", 3.0, 45.0, 5.5, 3.0, fitting, fixOverhang);
	}

	public static Geometry3D M3x50_Cutout(double fitting, boolean fixOverhang)
	{
		return hexBoltCutout("M3x50", 3.0, 50.0, 5.5, 3.0, fitting, fixOverhang);
	}

	private static Geometry3D hexBolt(String sizeName,
	                                  double diameter,
	                                  double length,
	                                  double threadLength,
	                                  double headWidth,
	                                  double headHeight)
	{
		Node3D res = Core.union3D();
		//Head
		Node3D headColor = Core.color("silver");
		Node3D headTranslate = Core.translate3D(0, 0, -headHeight);
		Geometry3D head = Core.cylinder3D(HexMath.hexagon_Diameter(headWidth), headHeight, 6);
		headColor.add(head);
		headTranslate.add(headColor);
		res.add(headTranslate);

		//Non threaded part
		if (length > threadLength)
		{
			Geometry3D nonThreaded = Core.cylinder3D(diameter, length - threadLength, 32);
			Node3D nonThreadedColor = Core.color("silver");
			nonThreadedColor.add(nonThreaded);
			res.add(nonThreadedColor);
		}
		//Threaded part
		Node3D threadedTranslate = Core.translate3D(0, 0, length - threadLength);
		Geometry3D threaded = Core.cylinder3D(diameter, threadLength, 32);
		Node3D threadedColor = Core.color("grey");
		threadedColor.add(threaded);
		threadedTranslate.add(threadedColor);
		res.add(threadedTranslate);
		return Core.module3D("HexBolt_" + sizeName, res);
	}

	private static Geometry3D hexBoltCutout(String sizeName,
	                                        double diameter,
	                                        double length,
	                                        double headWidth,
	                                        double headHeight,
	                                        double fitting,
	                                        boolean fixOverhang)
	{
		Node3D res = Core.union3D();
		//Head
		Node3D headTranslate = Core.translate3D(0, 0, -headHeight - fitting);
		Geometry3D head = Core.cylinder3D(HexMath.hexagon_Diameter(headWidth + 2 * fitting), headHeight + 2 * fitting, 6);
		headTranslate.add(head);

		//Body
		Geometry3D body = Core.cylinder3D(diameter + 2 * fitting, length + fitting, 64);
		res.add(body);

		//fix overhang
		if (fixOverhang)
		{
			Node3D hull = Core.hull3D();
			hull.add(headTranslate);
			double height = 0.5 * (HexMath.hexagon_Diameter(headWidth + 2 * fitting) - (diameter + 2 * fitting));
			Geometry3D cyl = Core.cylinder3D(diameter + 2 * fitting, height, 64);
			hull.add(cyl);
			res.add(hull);
		} else
		{
			res.add(headTranslate);
		}
		return Core.module3D("HexBolt_" + sizeName + "_Cutout", res);
	}
}
