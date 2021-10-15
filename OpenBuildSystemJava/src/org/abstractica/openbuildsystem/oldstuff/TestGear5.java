package org.abstractica.openbuildsystem.oldstuff;

import org.abstractica.openbuildsystem.oldstuff.gearsold.GearData;
import org.abstractica.openbuildsystem.oldstuff.gearsold.InvoluteGears;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCAD;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCADCore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestGear5
{
	public static void main(String[] args) throws IOException
	{
		Core c = OpenSCADCore.instance;

		//Generate geometry
		GearData g = new GearData(8, 20, 8, Math.toRadians(20),  Math.toRadians(0));


		Geometry2D rack = InvoluteGears.rack2D(c, g, 10, 0);

		Geometry2D gear = InvoluteGears.involuteGear2D(c, g, 0);
		int half = g.numberOfTeeth / 2;
		double x = (0.5-half)*g.pitch;
		double y = -g.pitchRadius;
		//Output file
		CodeBuilder cb = new CodeBuilder();
		cb.addLine("translate([" + x + " + $t * " + g.pitch + ", " + y + ", 0])");
		((OpenSCAD) rack).getCode(cb);
		cb.addLine("rotate([0, 0, $t * " + Math.toDegrees(g.pitchAngle) + "])");
		Group2D rot = c.rotate2D(-90).add(gear);
		((OpenSCAD) rot).getCode(cb);
		Path path = Paths.get("output.scad");
		Files.writeString(path, cb.toString());
	}

	private static double degreesToRadians(double deg)
	{
		return deg*Math.PI / 180.0;
	}

}
