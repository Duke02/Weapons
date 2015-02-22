package com.duke0200.weapons.ranged;

import com.duke0200.weapons.Weapon;

/**
 * Crossbow Class. Crossbows are slow and bulky but have great range and attack.
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class Crossbow extends Weapon {

	/**
	 * Custom Crossbow Constructor. Details all required values.
	 * <br>Defaults hands to 2 and minimum strength to 30.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Crossbow(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 30;
	}

	/**
	 * Custom Crossbow Constructor. Details all required values and number of hands.
	 * <br>Defaults minimum strength to 30.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Crossbow(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 30;
	}

	/**
	 * Custom Crossbow Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Crossbow(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Crossbow Constructor. Makes an ordinary crossbow.
	 */
	public Crossbow() {
		super("Crossbow", 6, 1, 14, 3.3, 2, 30);
	}

}
