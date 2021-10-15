package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class Sphere3DImpl implements Geometry3D, OpenSCAD
{
	private final double diameter;
	private final int angular_resolution;

	Sphere3DImpl(double diameter, int angular_resolution)
	{
		this.diameter = diameter;
		this.angular_resolution = angular_resolution;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("sphere(d = " + diameter + ", $fn = " + angular_resolution + ");");
	}
}
