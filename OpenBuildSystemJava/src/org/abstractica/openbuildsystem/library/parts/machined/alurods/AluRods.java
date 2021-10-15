package org.abstractica.openbuildsystem.library.parts.machined.alurods;

import org.abstractica.openbuildsystem.core.Core;
import org.abstractica.openbuildsystem.core.Geometry3D;
import org.abstractica.openbuildsystem.core.Node3D;

public class AluRods
{
	public static Geometry3D AluRod10(int length)
	{
		if (length < 2 || length > 40)
		{
			throw new RuntimeException("Alu rod length must be between 2 and 40. Was " + length);
		}
		return AluRod(length, 10.0, 3.0, 1.0);
	}

	private static Geometry3D AluRod(int length, double unitLength, double holeDiameter, double materialThickness)
	{
		Geometry3D outerBody = Core.box3D(unitLength, unitLength, length * unitLength);
		Geometry3D innerBody = Core.box3D(unitLength - 2 * materialThickness, unitLength - 2 * materialThickness, length * unitLength + 2);
		Node3D innerTranslate = Core.translate3D(materialThickness, materialThickness, -1);
		innerTranslate.add(innerBody);
		Node3D body = Core.difference3D();
		body.add(outerBody);
		body.add(innerTranslate);
		Node3D bodyTranslate = Core.translate3D(-0.5 * unitLength, -0.5 * unitLength, -0.5 * unitLength);
		bodyTranslate.add(body);

		Node3D rod = Core.difference3D();
		rod.add(bodyTranslate);

		Geometry3D hole = Core.cylinder3D(holeDiameter, unitLength + 2, 32);
		Node3D holeTranslate = Core.translate3D(0, 0, -1 - 0.5 * unitLength);
		holeTranslate.add(hole);
		Node3D xHole = Core.rotate3D(0, 90, 0);
		xHole.add(holeTranslate);
		Node3D yHole = Core.rotate3D(90, 0, 0);
		yHole.add(holeTranslate);
		Node3D holeCutoutGeometry = Core.union3D();
		holeCutoutGeometry.add(xHole);
		holeCutoutGeometry.add(yHole);
		Geometry3D holeCutout = Core.module3D("AluRod" + ((int) unitLength) + "_HoleCutout", holeCutoutGeometry);

		for (int i = 0; i < length; ++i)
		{
			Node3D holes = Core.translate3D(0, 0, i * unitLength);
			holes.add(holeCutout);
			rod.add(holes);
		}
		return Core.module3D("AluRod" + ((int) unitLength) + "_" + length,
				Core.color("silver").add(rod));
	}
}
