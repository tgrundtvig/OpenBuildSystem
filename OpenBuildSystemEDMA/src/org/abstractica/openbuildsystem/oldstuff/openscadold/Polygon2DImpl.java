package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.oldstuff.Geometry2D;
import org.abstractica.openbuildsystem.oldstuff.Path2D;
import org.abstractica.openbuildsystem.core.Vector2;
import org.abstractica.openbuildsystem.openscad.CodeBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Polygon2DImpl implements Geometry2D, OpenSCAD
{
	private final List<Vector2> points;
	private final List<Path2D> paths;


	public Polygon2DImpl(Iterable<Vector2> points, Iterable<Path2D> paths)
	{
		ArrayList<Vector2> newPoints = new ArrayList<>();
		ArrayList<Path2D> newPaths = new ArrayList<>();
		for(Vector2 v : points)
		{
			newPoints.add(v);
		}
		this.points = Collections.unmodifiableList(newPoints);
		for(Path2D path : paths)
		{
			newPaths.add(path);
		}
		this.paths = Collections.unmodifiableList(newPaths);
	}

	public Polygon2DImpl(Iterable<Vector2> points)
	{
		ArrayList<Vector2> newPoints = new ArrayList<>();
		for(Vector2 v : points)
		{
			newPoints.add(v);
		}
		this.points = Collections.unmodifiableList(newPoints);
		this.paths = null;
	}

	@Override
	public void getCode(CodeBuilder cb)
	{
		StringBuilder line = new StringBuilder();
		line.append("polygon(points = [");
		boolean first = true;
		for(Vector2 v : points)
		{
			if(first)
			{
				first = false;
			}
			else
			{
				line.append(", ");
			}
			line.append("[").append(v.x).append(", ").append(v.y).append("]");
		}
		line.append("]");
		if(paths != null && paths.size() > 0)
		{
			line.append(", paths = [");
			boolean first2 = true;
			for(Path2D path : paths)
			{
				if(first2)
				{
					first2 = false;
				}
				else
				{
					line.append(", ");
				}
				line.append("[");
				boolean first3 = true;
				for(Integer i : path)
				{
					if(first3)
					{
						first3 = false;
					}
					else
					{
						line.append(", ");
					}
					line.append(i);
				}
				line.append("[");
			}
			line.append("]");
		}
		line.append(");");
		cb.addLine(line.toString());
	}
}
