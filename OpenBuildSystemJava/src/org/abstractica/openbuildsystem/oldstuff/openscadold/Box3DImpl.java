package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.core.Vector3;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class Box3DImpl implements Geometry3D, OpenSCAD
{
	private final Vector3 dimension;

	Box3DImpl(Vector3 dimension)
	{
		this.dimension = dimension;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		cb.addLine("cube([" + dimension.x + ", " + dimension.y + ", " + dimension.z + "]);");
	}
}
