package org.abstractica.openbuildsystem.core;

public class Mirror2D extends ANode2D
{
	private final Vector2 normal;

	Mirror2D(Vector2 normal)
	{
		this.normal = normal;
	}

	public Vector2 getNormal()
	{
		return normal;
	}
}
