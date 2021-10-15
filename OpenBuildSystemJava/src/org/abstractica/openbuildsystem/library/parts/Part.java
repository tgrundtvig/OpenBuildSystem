package org.abstractica.openbuildsystem.library.parts;

import org.abstractica.openbuildsystem.oldstuff.Geometry3D;
import org.abstractica.openbuildsystem.library.assemblies.Assembly;

public interface Part extends Assembly
{
	public String getPartName();
	public Geometry3D getPartGeometry();
}
