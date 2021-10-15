package org.abstractica.openbuildsystem.library.parts.printed.gears;

import org.abstractica.openbuildsystem.oldstuff.Core;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Group3D;
import org.abstractica.openbuildsystem.oldstuff.gearsold.GearData;
import org.abstractica.openbuildsystem.oldstuff.gearsold.InvoluteGears;

public class BallBearing_Gear_3x10x4_8t
{
	private final Geometry3D geometry3D;

	public BallBearing_Gear_3x10x4_8t(Core c)
	{
		GearData gearData8 = new GearData(8, 20, 16, Math.toRadians(20),  Math.toRadians(0));


		//Gear24
		Geometry3D gear8 = InvoluteGears.involuteGear3D(c, gearData8, 8,0.1);

		//AxelHole
		Group3D holeTranslate = c.translate3D(0,0,-1);
		Geometry3D axelHole = c.cylinder3D(10.2, 10, 64);
		holeTranslate.add(axelHole);

		//Result
		Group3D res = c.difference3D();
		res.add(gear8);
		res.add(holeTranslate);

		geometry3D = res;
	}

	public Geometry3D getGeometry3D()
	{
		return geometry3D;
	}
}
