package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class RotateExtrudeImpl implements Geometry3D, OpenSCAD
{
	private final Geometry2D geometry2D;
	private final double angle;
	private final int convexity;

	public RotateExtrudeImpl(Geometry2D geometry2D, double angle, int convexity)
	{
		this.geometry2D = geometry2D;
		this.angle = angle;
		this.convexity = convexity;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		StringBuilder line = new StringBuilder();
		line.append("rotate_extrude(angle = ");
		line.append(angle);
		line.append(", convexity = ");
		line.append(convexity);
		line.append(")");
		cb.addLine(line.toString());
		cb.addLine("{");
		cb.indent();
		((OpenSCAD) geometry2D).getCode(cb);
		cb.undent();
		cb.addLine("}");
	}
}
