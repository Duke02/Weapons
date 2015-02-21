package com.duke0200.weapons.axes;

/**
 * 
 * @author The Duke
 * @since 0.2
 *
 */

public class ThrowingAxes extends Axe {

	/**
	 * Custom ThrowingAxes Constructor. Details minimum required values.
	 * <br>Defaults hands to 1 and minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public ThrowingAxes(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 15;
	}

	/**
	 * Custom ThrowingAxes Constructor. Details minimum required values and number of hands required to be fully operable.
	 * <br>Defaults minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public ThrowingAxes(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 15;
	}

	/**
	 * Custom ThrowingAxes Constructor. Details minimum values and number of hands and minimum strength required to be fully operable.
	 * 
	 * @param name
	 * @param att
	 * @param def
	 * @param rng
	 * @param spd
	 * @param hands
	 * @param min
	 */
	public ThrowingAxes(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default ThrowingAxes Constructor. Makes an ordinary ThrowingAxe
	 */
	public ThrowingAxes() {
		super("Throwing Axe", 4, 1, 7, 2.5, 1);
	}

}
