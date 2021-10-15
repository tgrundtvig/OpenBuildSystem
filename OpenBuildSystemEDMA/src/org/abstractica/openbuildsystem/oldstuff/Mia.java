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

public class Mia
{
	public static void main(String[] args) throws IOException
	{
		Core c = OpenSCADCore.instance;
		GearData gearData = new GearData(8, 20, 16, Math.toRadians(20),  Math.toRadians(0));
		//Gear
		Geometry3D gear = InvoluteGears.involuteGear3D(c, gearData, 10,0.1);
		CodeBuilder cb = new CodeBuilder();
		((OpenSCAD) gear).getCode(cb);
		Path filePath = Paths.get("output.scad");
		Files.writeString(filePath, cb.toString());
	}

	private static double degreesToRadians(double deg)
	{
		return deg*Math.PI / 180.0;
	}

}
