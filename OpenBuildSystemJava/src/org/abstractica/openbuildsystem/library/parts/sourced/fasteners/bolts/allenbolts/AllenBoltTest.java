package org.abstractica.openbuildsystem.library.parts.sourced.fasteners.bolts.allenbolts;

import org.abstractica.openbuildsystem.oldstuff.Core;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCAD;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCADCore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AllenBoltTest
{
	public static void main(String[] args) throws IOException
	{
		Core c = OpenSCADCore.instance;

		//Geometry3D bolt = AllenBolts.M3x4_Cutout(c, 0.2, true);
		Geometry3D bolt = AllenBolts.M3x4(c);
		CodeBuilder cb = new CodeBuilder();
		((OpenSCAD) bolt).getCode(cb);

		Path path = Paths.get("output.scad");
		Files.writeString(path, cb.toString());
	}
}
