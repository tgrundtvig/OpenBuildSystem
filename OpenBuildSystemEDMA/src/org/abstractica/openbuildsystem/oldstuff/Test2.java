package org.abstractica.openbuildsystem.oldstuff;

import org.abstractica.openbuildsystem.openscad.CodeBuilder;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCAD;
import org.abstractica.openbuildsystem.oldstuff.openscadold.OpenSCADCore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2
{
	public static void main(String[] args) throws IOException
	{
		Core c = OpenSCADCore.instance;

		Geometry2D circle = c.circle2D(10, 32);
		Group2D t = c.translate2D(20,10);
		t.add(circle);
		Geometry3D geo3D = c.linearExtrude(t, 50, 360, 3, 64, 10);
		CodeBuilder cb = new CodeBuilder();
		((OpenSCAD) geo3D).getCode(cb);

		Path path = Paths.get("output.scad");
		Files.writeString(path, cb.toString());
	}


}
