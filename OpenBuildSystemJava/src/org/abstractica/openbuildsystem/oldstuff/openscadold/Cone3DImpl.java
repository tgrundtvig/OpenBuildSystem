package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class Cone3DImpl implements Geometry3D, OpenSCAD
{
	private final double bottom_diameter;
	private final double top_diameter;
	private final double height;
	private final int angular_resolution;

	Cone3DImpl(double bottom_diameter, double top_diameter, double height, int angular_resolution)
	{
		this.bottom_diameter = bottom_diameter;
		this.top_diameter = top_diameter;
		this.height = height;
		this.angular_resolution = angular_resolution;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("cylinder(d1 = " + bottom_diameter + ", d2 = " + top_diameter + ", h = " + height + ", $fn = " + angular_resolution + ");");
	}
}
