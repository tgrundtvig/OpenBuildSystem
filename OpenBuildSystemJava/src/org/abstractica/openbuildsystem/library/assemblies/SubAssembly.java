package org.abstractica.openbuildsystem.library.assemblies;

import org.abstractica.openbuildsystem.core.Vector3;

public interface SubAssembly extends Assembly
{
	public Vector3 getRotate();
	public Vector3 getTranslate();
}
