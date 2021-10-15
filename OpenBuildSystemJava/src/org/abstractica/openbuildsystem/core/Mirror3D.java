package org.abstractica.openbuildsystem.core;

public class Mirror3D extends ANode3D
{
	private final Vector3 normal;

	Mirror3D(Vector3 normal)
	{
		this.normal = normal;
	}

	public Vector3 getNormal()
	{
		return normal;
	}
}
