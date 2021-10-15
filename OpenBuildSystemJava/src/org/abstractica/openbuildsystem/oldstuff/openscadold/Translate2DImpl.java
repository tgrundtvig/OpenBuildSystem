package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.core.Vector2;
import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.oldstuff.Group2D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Translate2DImpl implements Group2D, OpenSCAD
{
	private final Vector2 v;
	private final List<Geometry2D> children;

	Translate2DImpl(Vector2 v)
	{
		this.v = v;
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
		cb.addLine("translate([" + v.x + ", " + v.y + "])");
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
