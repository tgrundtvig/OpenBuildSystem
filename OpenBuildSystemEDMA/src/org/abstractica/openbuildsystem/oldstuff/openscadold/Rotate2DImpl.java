package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.oldstuff.Group2D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Rotate2DImpl implements Group2D, OpenSCAD
{
	private final double x;
	private final double y;
	private final double z;
	private final List<Geometry2D> children;

	Rotate2DImpl(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		children = new ArrayList<>();
	}

	@Override
	public Group2D add(Geometry2D geometry2D)
	{
		children.add(geometry2D);
		return this;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("rotate([" + x + ", " + y + ", " + z + "])");
		cb.addLine("{");
		cb.indent();
		for(Geometry2D geo2D : children)
		{
			((OpenSCAD) geo2D).getCode(cb);
		}
		cb.undent();
		cb.addLine("}");
	}
}
