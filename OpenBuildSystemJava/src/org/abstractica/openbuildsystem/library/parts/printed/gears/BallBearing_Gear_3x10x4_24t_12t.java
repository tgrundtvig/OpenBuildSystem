package org.abstractica.openbuildsystem.library.parts.printed.gears;

import org.abstractica.openbuildsystem.oldstuff.Core;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Group3D;
import org.abstractica.openbuildsystem.oldstuff.gearsold.GearData;
import org.abstractica.openbuildsystem.oldstuff.gearsold.InvoluteGears;

public class BallBearing_Gear_3x10x4_24t_12t
{
	private final Geometry3D geometry3D;

	public BallBearing_Gear_3x10x4_24t_12t(Core c)
	{
		GearData gearData12 = new GearData(8, 20, 16, Math.toRadians(20),  Math.toRadians(0));
		GearData gearData24 = new GearData(24, 20, 16, Math.toRadians(20),  Math.toRadians(0));

		//Gear24
		Group3D gear12Translate = c.translate3D(0,0,4);
		Geometry3D gear12 = InvoluteGears.involuteGear3D(c, gearData12, 4,0.1);
		gear12Translate.add(gear12);

		//Gear24
		Geometry3D gear24 = InvoluteGears.involuteGear3D(c, gearData24, 4,0.1);

		//Gears
		Group3D gears = c.union3D();
		gears.add(gear12Translate);
		gears.add(gear24);

		//AxelHole
		Group3D holeTranslate = c.translate3D(0,0,-1);
		Geometry3D axelHole = c.cylinder3D(10.2, 10, 64);
		holeTranslate.add(axelHole);

		//Result
		Group3D res = c.difference3D();
		res.add(gears);
		res.add(holeTranslate);

		geometry3D = res;
	}

	public Geometry3D getGeometry3D()
	{
		return geometry3D;
	}
}
