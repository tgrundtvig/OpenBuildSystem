package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Group3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class ColorRGBAImpl implements Group3D, OpenSCAD
{
	private final double r,g,b,a;
	private final List<Geometry3D> children;

	ColorRGBAImpl(double r, double g, double b, double a)
	{
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;

		children = new ArrayList<>();
	}

	@Override
	public Group3D add(Geometry3D geometry3D)
	{
		children.add(geometry3D);
		return this;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("color([" + r + ", " + g + ", " + b + "], " + a + ")");
		cb.addLine("{");
		cb.indent();
		for(Geometry3D geo3D : children)
		{
			((OpenSCAD) geo3D).getCode(cb);
		}
		cb.undent();
		cb.addLine("}");
	}
}
