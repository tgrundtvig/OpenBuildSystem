package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class ProjectedGeometry2DImpl implements Geometry2D, OpenSCAD
{
	private final Geometry3D geometry;
	private final boolean cut;

	public ProjectedGeometry2DImpl(Geometry3D geometry, boolean cut)
	{
		this.geometry = geometry;
		this.cut = cut;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		if(cut)
		{
			cb.addLine("projection(cut = true)");
		}
		else
		{
			cb.addLine("projection(cut = false)");
		}
		cb.addLine("{");
		cb.indent();
		((OpenSCAD) geometry).getCode(cb);
		cb.undent();
		cb.addLine("}");
	}
}
