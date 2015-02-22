package com.duke0200.weapons.blades.shortswords;

/**
 * Gladius Class. Compared to a short sword, the gladius is nearly a perfect copy; the one flaw in the "copy" 
 * is a speed faster by a fractional amount, which likely isn't that bad of a flaw!
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class Gladius extends ShortSword {

	/**
	 * Custom Gladius Constructor. Details all mandatory values.
	 * <br>Defaults number of hands to 1 and minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Gladius(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 15;
	}

	/**
	 * Custom Gladius Constructor. Details all mandatory values and number of required hands.
	 * <br>Defaults minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Gladius(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 15;
	}

	/**
	 * Custom Gladius Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Gladius(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Gladius Constructor. Makes just a normal old Gladius used in Ancient Roman battles.
	 */
	public Gladius() {
		super("Gladius", 4, 2, 2, 2.0, 1, 15);
	}

}
