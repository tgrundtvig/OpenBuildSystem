package org.abstractica.openbuildsystem.library.parts.sourced.fasteners.bolts.allenbolts;

import org.abstractica.openbuildsystem.core.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;
import org.abstractica.openbuildsystem.openscad.OpenSCADGenerator;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AllenBoltTest
{
	public static void main(String[] args) throws IOException
	{
		Geometry3D bolt = AllenBolts.M3x30_Cutout(0.2, true);
		//Geometry3D bolt = AllenBolts.M3x40();
		CodeBuilder cb = new CodeBuilder();
		OpenSCADGenerator.generate(cb, bolt);

		Path path = Paths.get("output.scad");
		Files.writeString(path, cb.toString());
	}
}
