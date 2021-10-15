package org.abstractica.openbuildsystem.library.parts.sourced.fasteners.bolts.allenbolts;

import org.abstractica.openbuildsystem.core.Core;
import org.abstractica.openbuildsystem.core.Geometry3D;
import org.abstractica.openbuildsystem.core.Node3D;
import org.abstractica.openbuildsystem.library.util.math.HexMath;

public class AllenBolts
{
	public static Geometry3D M3x4()
	{
		return allenBolt("M3x4", 3.0, 4.0, 4.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x5()
	{
		return allenBolt("M3x5", 3.0, 5.0, 5.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x6()
	{
		return allenBolt("M3x6", 3.0, 6.0, 6.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x8()
	{
		return allenBolt("M3x8", 3.0, 8.0, 8.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x10()
	{
		return allenBolt("M3x10", 3.0, 10.0, 10.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x12()
	{
		return allenBolt("M3x12", 3.0, 12.0, 12.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x14()
	{
		return allenBolt("M3x14", 3.0, 14.0, 14.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x16()
	{
		return allenBolt("M3x16", 3.0, 16.0, 16.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x18()
	{
		return allenBolt("M3x18", 3.0, 18.0, 18.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x20()
	{
		return allenBolt("M3x20", 3.0, 20.0, 20.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x22()
	{
		return allenBolt("M3x22", 3.0, 22.0, 22.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x25()
	{
		return allenBolt("M3x25", 3.0, 25.0, 20.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x30()
	{
		return allenBolt("M3x30", 3.0, 30.0, 30.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x35()
	{
		return allenBolt("M3x35", 3.0, 35.0, 20.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x40()
	{
		return allenBolt("M3x40", 3.0, 40.0, 20.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x45()
	{
		return allenBolt("M3x45", 3.0, 45.0, 20.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x50()
	{
		return allenBolt("M3x50", 3.0, 50.0, 20.0, 5.4, 3.0, 2.5, 1.5);
	}

	public static Geometry3D M3x4_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x4", 3.0, 4.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x5_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x5", 3.0, 5.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x6_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x6", 3.0, 6.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x8_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x8", 3.0, 8.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x10_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x10", 3.0, 10.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x12_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x12", 3.0, 12.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x14_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x14", 3.0, 14.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x16_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x16", 3.0, 16.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x18_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x18", 3.0, 18.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x20_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x20", 3.0, 20.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x22_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x22", 3.0, 22.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x25_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x25", 3.0, 25.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x30_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x30", 3.0, 30.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x35_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x35", 3.0, 35.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x40_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x40", 3.0, 40.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x45_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x45", 3.0, 45.0, 5.4, 3, fitting, fixOverhang);
	}

	public static Geometry3D M3x50_Cutout(double fitting, boolean fixOverhang)
	{
		return allenBoltCutout("M3x50", 3.0, 50.0, 5.4, 3, fitting, fixOverhang);

	}


	private static Geometry3D allenBolt(String sizeName, double diameter, double length, double threadLength, double headDiameter, double headHeight, double holeWidth, double holeDepth)
	{
		Node3D res = Core.union3D();
		//Head
		Node3D headColor = Core.color("silver");
		Node3D headTranslate = Core.translate3D(0, 0, -headHeight);
		Node3D head = Core.difference3D();
		Geometry3D headCyl = Core.cylinder3D(headDiameter, headHeight, 32);
		Geometry3D hole = Core.cylinder3D(HexMath.hexagon_Diameter(holeWidth), holeDepth + 1, 6);
		Node3D holeTranslate = Core.translate3D(0, 0, -1);
		holeTranslate.add(hole);
		head.add(headCyl);
		head.add(holeTranslate);
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
		return Core.module3D("AllenBolt_" + sizeName, res);
	}

	private static Geometry3D allenBoltCutout(String sizeName,
	                                          double diameter,
	                                          double length,
	                                          double headDiameter,
	                                          double headHeight,
	                                          double fitting,
	                                          boolean fixOverhang)
	{
		Node3D res = Core.union3D();
		//Head
		Node3D headTranslate = Core.translate3D(0, 0, -headHeight - fitting);
		Geometry3D head = Core.cylinder3D(headDiameter + 2 * fitting, headHeight + 2 * fitting, 64);
		headTranslate.add(head);

		//Body
		Geometry3D body = Core.cylinder3D(diameter + 2 * fitting, length + fitting, 64);
		res.add(body);

		//fix overhang
		if (fixOverhang)
		{
			Node3D hull = Core.hull3D();
			hull.add(headTranslate);
			double height = 0.5 * (headDiameter - diameter);
			Geometry3D cyl = Core.cylinder3D(diameter + 2 * fitting, height, 64);
			hull.add(cyl);
			res.add(hull);
		} else
		{
			res.add(headTranslate);
		}
		return Core.module3D("AllenBolt_" + sizeName + "_Cutout", res);
	}
}
