package org.abstractica.openbuildsystem.oldstuff;

public class Util
{
	private static final double sqrt3 = Math.sqrt(3.0);
	public static double HexWidth(double diameter)
	{
		return diameter * sqrt3 / 2.0;
	}

	public static double HexDiameter(double width)
	{
		return 2.0 * width / sqrt3;
	}
}
