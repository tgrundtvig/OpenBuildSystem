package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.core.Vector2;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class Rect2DImpl implements Geometry2D, OpenSCAD
{
	private final Vector2 dimension;

	Rect2DImpl(Vector2 dimension)
	{
		this.dimension = dimension;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("square([" + dimension.x + ", " + dimension.y + "]);");
	}
}
