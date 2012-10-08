package com.ideallyapps.UnitConverter;

/**
 * UnitConverter is a convenience class used to do simple conversions. No promise of loss of
 * precision.
 * 
 * <p>
 * Has the following conversions:
 * </p>
 * <ul>
 * <li>Feet <-> Miles</li>
 * <li>Feet <-> Meters</li>
 * <li>Feet <-> KiloMeters</li>
 * <li>Miles <-> Meters</li>
 * <li>Miles <-> Kilometers</li>
 * <li>Meters <-> Kilometers</li>
 * </ul>
 * 
 * @author davidwparker
 * @version 0.1
 */
public class UnitConverter {

	/**
	 * Use both directions so we can avoid division by 0 errors
	 */
	public static final double MILE_IN_FEET = 0.000189393939;
	public static final double FEET_IN_MILE = 5280;
	public static final double METERS_IN_FEET = 0.3408;
	public static final double FEET_IN_METERS = 3.2808399;
	public static final double KILOMETERS_IN_FEET = 0.0003048;
	public static final double FEET_IN_KILOMETERS = 3280.8399;
	public static final double METERS_IN_MILE = 1609.344;
	public static final double MILE_IN_METERS = 0.000621371192;
	public static final double KILOMETERS_IN_MILE = 1.609344;
	public static final double MILE_IN_KILOMETERS = 0.621371192;
	public static final double KILOMETERS_IN_METERS = 0.001;
	public static final double METERS_IN_KILOMETERS = 1000;

	public static double feetToMile(double feet) {
		return MILE_IN_FEET * feet;
	}

	public static double milesToFeet(double mile) {
		return FEET_IN_MILE * mile;
	}

	public static double feetToMeters(double feet) {
		return METERS_IN_FEET * feet;
	}

	public static double metersToFeet(double meters) {
		return FEET_IN_METERS * meters;
	}

	public static double feetToKilometers(double feet) {
		return KILOMETERS_IN_FEET * feet;
	}

	public static double kilometersToFeet(double feet) {
		return FEET_IN_KILOMETERS * feet;
	}

	public static double milesToMeters(double miles) {
		return METERS_IN_MILE * miles;
	}

	public static double metersToMiles(double meters) {
		return MILE_IN_METERS * meters;
	}

	public static double milesToKilometers(double miles) {
		return KILOMETERS_IN_MILE * miles;
	}

	public static double kilometersToMiles(double kilometers) {
		return MILE_IN_KILOMETERS * kilometers;
	}

	public static double metersToKilometers(double meters) {
		return KILOMETERS_IN_METERS * meters;
	}

	public static double kilometersToMeters(double kilometers) {
		return METERS_IN_KILOMETERS * kilometers;
	}
}
