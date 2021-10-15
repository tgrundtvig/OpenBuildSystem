package org.abstractica.openbuildsystem.library.util.gears;

public class GearData
{
	public final int numberOfTeeth;
	public final double gearDist;
	public final int totalTeeth;
	public final double pressureAngle;
	public final double helixAngle;
	public final double pitch;
	public final double module;
	public final double pitchRadius;
	public final double pitchAngle;
	public final double baseRadius;
	public final double baseToothAngle;

	public final double tipRadius;

	public GearData(int numberOfTeeth, double gearDist, int totalTeeth, double pressureAngle, double helixAngle)
	{
		this.numberOfTeeth = numberOfTeeth;
		this.gearDist = gearDist;
		this.totalTeeth = totalTeeth;
		this.pressureAngle = pressureAngle;
		this.helixAngle = helixAngle;
		this.pitch = gearDist * Math.PI * 2.0 / totalTeeth;
		this.pitchAngle = (Math.PI*2.0) / numberOfTeeth;
		this.module = (2.0 * gearDist) / totalTeeth;
		this.pitchRadius = (gearDist * numberOfTeeth) / totalTeeth;
		double alphaStern = Math.atan(Math.tan(pressureAngle)/Math.cos(helixAngle));
		this.baseRadius = pitchRadius * Math.cos(alphaStern);
		double rho = Math.acos(baseRadius/pitchRadius);
		this.baseToothAngle = pitchAngle*0.5 + 2.0*(Math.tan(rho) - rho);
		this.tipRadius = pitchRadius+module;
	}
}
