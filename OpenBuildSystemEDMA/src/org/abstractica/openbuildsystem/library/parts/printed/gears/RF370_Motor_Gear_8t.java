package org.abstractica.openbuildsystem.library.parts.printed.gears;

import org.abstractica.openbuildsystem.oldstuff.Core;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Group3D;
import org.abstractica.openbuildsystem.oldstuff.gearsold.GearData;
import org.abstractica.openbuildsystem.oldstuff.gearsold.InvoluteGears;

public class RF370_Motor_Gear_8t
{
	private final Geometry3D geometry3D;

	public RF370_Motor_Gear_8t(Core c)
	{
		GearData gearData = new GearData(8, 20, 16, Math.toRadians(20),  Math.toRadians(0));
		//GearAndHubUnion
		Group3D gearAndHub = c.union3D();

		//Gear
		Geometry3D gear = InvoluteGears.involuteGear3D(c, gearData, 4,0.1);
		gearAndHub.add(gear);

		//Hub
		Group3D hubTranslate = c.translate3D(0,0,4);
		Geometry3D hub = c.cylinder3D(7, 10, 64);
		hubTranslate.add(hub);
		gearAndHub.add(hubTranslate);

		//AxelHole
		Group3D holeTranslate = c.translate3D(0,0,4);
		Geometry3D axelHole = c.cylinder3D(2.2, 11, 32);
		holeTranslate.add(axelHole);

		//Result
		Group3D res = c.difference3D();
		res.add(gearAndHub);
		res.add(holeTranslate);

		geometry3D = res;
	}

	public Geometry3D getGeometry3D()
	{
		return geometry3D;
	}
}
