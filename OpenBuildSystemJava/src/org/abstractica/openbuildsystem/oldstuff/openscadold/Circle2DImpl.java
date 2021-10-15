package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class Circle2DImpl implements Geometry2D, OpenSCAD
{
	private final double diameter;
	private final int angular_resolution;

	Circle2DImpl(double diameter, int angular_resolution)
	{
		this.diameter = diameter;
		this.angular_resolution = angular_resolution;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("circle(d = " + diameter + ", $fn = " + angular_resolution + ");");
	}
}
