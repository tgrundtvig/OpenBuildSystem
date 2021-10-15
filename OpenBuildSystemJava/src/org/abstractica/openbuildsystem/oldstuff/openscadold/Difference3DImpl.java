package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Group3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Difference3DImpl implements Group3D, OpenSCAD
{
	private final List<Geometry3D> children;

	Difference3DImpl()
	{
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
		cb.addLine("difference()");
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
