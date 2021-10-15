package org.abstractica.openbuildsystem.oldstuff.openscadold;

import org.abstractica.openbuildsystem.core.Vector2;
import org.abstractica.openbuildsystem.core.Vector3;
import org.abstractica.openbuildsystem.oldstuff.*;

import java.util.ArrayList;

public class OpenSCADCore implements Core
{
	public static final Core instance = new OpenSCADCore();

	@Override
	public Path2DImpl path2D(Iterable<Integer> path)
	{
		return new Path2DImpl(path);
	}

	@Override
	public Geometry2D polygon2D(Iterable<Vector2> points)
	{
		return new Polygon2DImpl(points);
	}

	@Override
	public Geometry2D polygon2DMultiPaths(Iterable<Vector2> points, Iterable<Path2D> paths)
	{
		return new Polygon2DImpl(points, paths);
	}

	@Override
	public Geometry2D polygon2D(Iterable<Vector2> points, Iterable<Integer> path)
	{
		ArrayList<Path2D> paths = new ArrayList<>();
		paths.add(path2D(path));
		return polygon2DMultiPaths(points, paths);
	}

	@Override
	public Geometry2D circle2D(double diameter, int angular_resolution)
	{
		return new Circle2DImpl(diameter, angular_resolution);
	}

	@Override
	public Geometry2D rect2D(Vector2 dimension2D)
	{
		return new Rect2DImpl(dimension2D);
	}

	@Override
	public Geometry2D rect2D(double x, double y)
	{
		Vector2 dimension = new Vector2(x,y);
		return rect2D(dimension);
	}

	@Override
	public Group2D translate2D(Vector2 vector)
	{
		return new Translate2DImpl(vector);
	}

	@Override
	public Group2D translate2D(double x, double y)
	{
		Vector2 v = new Vector2(x,y);
		return translate2D(v);
	}

	@Override
	public Group2D rotate2D(double x, double y, double z)
	{
		return new Rotate2DImpl(x,y,z);
	}

	@Override
	public Group2D rotate2D(double angle)
	{
		return new Rotate2DImpl(0,0,angle);
	}

	@Override
	public Group2D scale2D(Vector2 vector)
	{
		return new Scale2DImpl(vector);
	}

	@Override
	public Group2D scale2D(double x, double y)
	{
		return scale2D(new Vector2(x,y));
	}

	@Override
	public Group2D mirror2D(Vector2 vector)
	{
		return new Mirror2DImpl(vector);
	}

	@Override
	public Group2D mirror2D(double x, double y)
	{
		return new Mirror2DImpl(new Vector2(x,y));
	}

	@Override
	public Group2D union2D()
	{
		return new Union2DImpl();
	}

	@Override
	public Group2D intersection2D()
	{
		return new Intersection2DImpl();
	}

	@Override
	public Group2D difference2D()
	{
		return new Difference2DImpl();
	}

	@Override
	public Group2D hull2D()
	{
		return new Hull2DImpl();
	}

	@Override
	public Geometry3D sphere3D(double diameter, int angular_resolution)
	{
		return new Sphere3DImpl(diameter, angular_resolution);
	}

	@Override
	public Geometry3D cylinder3D(double diameter, double height, int angular_resolution)
	{
		return new Cylinder3DImpl(diameter, height, angular_resolution);
	}

	@Override
	public Geometry3D cone3D(double bottom_diameter, double top_diameter, double height, int angular_resolution)
	{
		return new Cone3DImpl(bottom_diameter, top_diameter, height, angular_resolution);
	}

	@Override
	public Geometry3D box3D(Vector3 dimension)
	{
		return new Box3DImpl(dimension);
	}

	@Override
	public Geometry3D box3D(double size_x, double size_y, double size_z)
	{
		Vector3 dim = new Vector3(size_x, size_y, size_z);
		return box3D(dim);
	}

	@Override
	public Group3D translate3D(Vector3 vector)
	{
		return new Translate3DImpl(vector);
	}

	@Override
	public Group3D translate3D(double x, double y, double z)
	{
		Vector3 vec = new Vector3(x,y,z);
		return translate3D(vec);
	}

	@Override
	public Group3D rotate3D(Vector3 vector)
	{
		return new Rotate3DImpl(vector);
	}

	@Override
	public Group3D rotate3D(double x, double y, double z)
	{
		Vector3 vec = new Vector3(x,y,z);
		return rotate3D(vec);
	}

	@Override
	public Group3D scale3D(Vector3 vector)
	{
		return new Scale3DImpl(vector);
	}

	@Override
	public Group3D scale3D(double x, double y, double z)
	{
		Vector3 vec = new Vector3(x,y,z);
		return scale3D(vec);
	}

	@Override
	public Group3D mirror3D(Vector3 vector)
	{
		return new Mirror3DImpl(vector);
	}

	@Override
	public Group3D mirror3D(double x, double y, double z)
	{
		Vector3 vec = new Vector3(x,y,z);
		return mirror3D(vec);
	}

	@Override
	public Group3D union3D()
	{
		return new Union3DImpl();
	}

	@Override
	public Group3D intersection3D()
	{
		return new Intersection3DImpl();
	}

	@Override
	public Group3D difference3D()
	{
		return new Difference3DImpl();
	}

	@Override
	public Group3D hull3D()
	{
		return new Hull3DImpl();
	}

	@Override
	public Group3D color(String name)
	{
		return new ColorNameImpl(name);
	}

	@Override
	public Group3D color(int r, int g, int b)
	{
		double dr = r / 255.0;
		double dg = g / 255.0;
		double db = b / 255.0;
		return new ColorRGBAImpl(r,g,b,1.0);
	}

	@Override
	public Group3D color(int r, int g, int b, int a)
	{
		double dr = r / 255.0;
		double dg = g / 255.0;
		double db = b / 255.0;
		double da = a / 255.0;
		return new ColorRGBAImpl(r,g,b,a);
	}

	@Override
	public Geometry3D linearExtrude(Geometry2D geometry2D, double height, double twist, double scale, int slices, int convexity)
	{
		return new LinearExtrudeImpl(geometry2D, height, twist, scale, slices, convexity);
	}

	@Override
	public Geometry3D rotateExtrude(Geometry2D geometry2D, double angle, int convexity)
	{
		return new RotateExtrudeImpl(geometry2D, angle, convexity);
	}

	@Override
	public Geometry2D project(Geometry3D geometry3D, boolean cut)
	{
		return new ProjectedGeometry2DImpl(geometry3D, cut);
	}
}
