package org.abstractica.openbuildsystem.library.parts.sourced.alurods;

import org.abstractica.openbuildsystem.oldstuff.Core;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Group3D;

public class AluRods
{
	public static Geometry3D AluRod10(Core c, int length)
	{
		if(length < 2 || length > 40)
		{
			throw new RuntimeException("Alu rod length must be between 2 and 40. Was " + length);
		}
		return AluRod(c, length, 10.0, 3.0, 1.0);
	}

	private static Geometry3D AluRod(Core c, int length, double unitLength, double holeDiameter, double materialThickness)
	{
		Geometry3D outerBody = c.box3D(unitLength, unitLength, length*unitLength);
		Geometry3D innerBody = c.box3D(unitLength-2*materialThickness, unitLength-2*materialThickness, length*unitLength+2);
		Group3D innerTranslate = c.translate3D(materialThickness, materialThickness, -1);
		innerTranslate.add(innerBody);
		Group3D body = c.difference3D();
		body.add(outerBody);
		body.add(innerTranslate);
		Group3D bodyTranslate = c.translate3D(-0.5*unitLength, -0.5*unitLength, -0.5*unitLength);
		bodyTranslate.add(body);

		Group3D rod = c.difference3D();
		rod.add(bodyTranslate);

		for(int i = 0; i < length; ++i)
		{
			Geometry3D hole = c.cylinder3D(holeDiameter, unitLength + 2, 32);
			Group3D holeTranslate = c.translate3D(0,0,-1-0.5*unitLength);
			holeTranslate.add(hole);
			Group3D xHole = c.rotate3D(0,90,0);
			xHole.add(holeTranslate);
			Group3D yHole = c.rotate3D(90,0,0);
			yHole.add(holeTranslate);
			Group3D holes = c.translate3D(0,0,i*unitLength);
			holes.add(xHole);
			holes.add(yHole);
			rod.add(holes);
		}
		return c.color("silver").add(rod);
	}
}
