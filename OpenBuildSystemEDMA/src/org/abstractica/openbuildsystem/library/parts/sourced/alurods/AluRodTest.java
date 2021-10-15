package org.abstractica.openbuildsystem.library.parts.sourced.alurods;

import org.abstractica.openbuildsystem.oldstuff.Core;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCAD;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCADCore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AluRodTest
{
	public static void main(String[] args) throws IOException
	{
		Core c = OpenSCADCore.instance;

		Geometry3D rod = AluRods.AluRod10(c,10);
		CodeBuilder cb = new CodeBuilder();
		((OpenSCAD) rod).getCode(cb);

		Path path = Paths.get("output.scad");
		Files.writeString(path, cb.toString());
	}
}
