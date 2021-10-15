package org.abstractica.openbuildsystem.oldstuff;

import org.abstractica.openbuildsystem.library.parts.printed.gears.RF370_Motor_Gear_8t;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCAD;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCADCore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestGear4
{
	public static void main(String[] args) throws IOException
	{
		Core c = OpenSCADCore.instance;
		RF370_Motor_Gear_8t gear = new RF370_Motor_Gear_8t(c);

		CodeBuilder cb = new CodeBuilder();
		((OpenSCAD) gear.getGeometry3D()).getCode(cb);
		Path filePath = Paths.get("output.scad");
		Files.writeString(filePath, cb.toString());
	}

	private static double degreesToRadians(double deg)
	{
		return deg*Math.PI / 180.0;
	}

}
