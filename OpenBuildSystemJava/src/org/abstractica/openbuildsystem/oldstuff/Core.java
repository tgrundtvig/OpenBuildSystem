package org.abstractica.openbuildsystem.oldstuff;

import org.abstractica.openbuildsystem.core.Vector2;
import org.abstractica.openbuildsystem.core.Vector3;

public interface Core
{
	// 2D
	Path2D path2D(Iterable<Integer> path);
	Geometry2D polygon2D(Iterable<Vector2> points);
	Geometry2D polygon2DMultiPaths(Iterable<Vector2> points, Iterable<Path2D> paths);
	Geometry2D polygon2D(Iterable<Vector2> points, Iterable<Integer> path);
	Geometry2D circle2D(double diameter, int angular_resolution);
	Geometry2D rect2D(Vector2 dimension2D);
	Geometry2D rect2D(double x, double y);

	// 2D groups
	Group2D translate2D(Vector2 vector);
	Group2D translate2D(double x, double y);
	Group2D rotate2D(double angle);
	Group2D rotate2D(double x, double y, double z); //Rotates in 3D an projects on xy plane
	Group2D scale2D(Vector2 vector);
	Group2D scale2D(double x, double y);
	Group2D mirror2D(Vector2 vector);
	Group2D mirror2D(double x, double y);
	Group2D union2D();
	Group2D intersection2D();
	Group2D difference2D();
	Group2D hull2D();

	// 3D Shapes
	Geometry3D sphere3D(double diameter, int angular_resolution);
	Geometry3D cylinder3D(double diameter, double height, int angular_resolution);
	Geometry3D cone3D(double bottom_diameter, double top_diameter, double height, int angular_resolution);
	Geometry3D box3D(Vector3 dimension);
	Geometry3D box3D(double size_x, double size_y, double size_z);

	// 3D Groups
	Group3D translate3D(Vector3 vector);
	Group3D translate3D(double x, double y, double z);
	Group3D rotate3D(Vector3 vector);
	Group3D rotate3D(double x, double y, double z);
	Group3D scale3D(Vector3 vector);
	Group3D scale3D(double x, double y, double z);
	Group3D mirror3D(Vector3 vector);
	Group3D mirror3D(double x, double y, double z);
	Group3D union3D();
	Group3D intersection3D();
	Group3D difference3D();
	Group3D hull3D();
	Group3D color(String name);
	Group3D color(int r, int g, int b);
	Group3D color(int r, int g, int b, int a);

	//2D to 3D
	Geometry3D linearExtrude(Geometry2D geometry2D, double height, double twist, double scale, int slices, int convexity);
	Geometry3D rotateExtrude(Geometry2D geometry2D, double angle, int convexity);


	//3D to 2D
	Geometry2D project(Geometry3D geometry3D, boolean cut);

}
