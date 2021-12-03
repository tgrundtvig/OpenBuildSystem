package org.abstractica.openbuildsystem.library.parts.sourced.fasteners.bolts.allenbolts;

import org.abstractica.openbuildsystem.core.Core;
import org.abstractica.openbuildsystem.core.Node3D;
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
		AllenBolt bolt = AllenBolts.M3x40;
		Node3D res = Core.union3D();
		Node3D t1 = Core.translate3D(-10, 0, 0);
		Node3D t2 = Core.translate3D(10, 0, 0);
		t1.add(bolt.generateGeometry());
		t2.add(bolt.getCutout(0.2, 0.1, true));
		res.add(t1).add(t2);


		CodeBuilder cb = new CodeBuilder();
		OpenSCADGenerator.generate(cb, res);

		Path path = Paths.get("output.scad");
		Files.writeString(path, cb.toString());
	}
}
