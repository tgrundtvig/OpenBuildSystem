package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class Cylinder3DImpl implements Geometry3D, OpenSCAD
{
	private final double diameter;
	private final double height;
	private final int angular_resolution;

	Cylinder3DImpl(double diameter, double height, int angular_resolution)
	{
		this.diameter = diameter;
		this.height = height;
		this.angular_resolution = angular_resolution;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("cylinder(d = " + diameter + ", h = " + height + ", $fn = " + angular_resolution + ");");
	}
}
