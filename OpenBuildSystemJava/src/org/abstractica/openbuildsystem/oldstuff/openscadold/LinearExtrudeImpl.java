package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

public class LinearExtrudeImpl implements Geometry3D, OpenSCAD
{
	private final Geometry2D geometry2D;
	private final double height;
	private final double twist;
	private final double scale;
	private final int slices;
	private final int convexity;

	public LinearExtrudeImpl(Geometry2D geometry2D, double height, double twist, double scale, int slices, int convexity)
	{
		this.geometry2D = geometry2D;
		this.height = height;
		this.twist = twist;
		this.scale = scale;
		this.slices = slices;
		this.convexity = convexity;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		StringBuilder line = new StringBuilder();
		line.append("linear_extrude(height = ");
		line.append(height);
		line.append(", twist = ");
		line.append(twist);
		line.append(", scale = ");
		line.append(scale);
		line.append(", slices = ");
		line.append(slices);
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
