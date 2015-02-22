package com.duke0200.weapons.fists;

import com.duke0200.weapons.Weapon;

/**
 * BrassKnuckles Class. Being rather limited on range, brass knuckles provide no defense and less attack than 
 * a sword, but make up for it with their fast attack. 
 * 
 * @author The Duke
 * @since 0.2
 *
 */

public class BrassKnuckles extends Weapon {

	/**
	 * Custom BrassKnuckles Constructor. Details the minimum of the required values. 
	 * <br>Defaults minimum strength to 5 and hands to 1. 
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public BrassKnuckles(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.minimumStrength = 5;
		this.hands = 1; 
	}

	/**
	 * Custom BrassKnuckles Constructor. Details the minimum of the required values and the number of hands required to use these knuckles at
	 * their best.
	 * <br>Defaults minimum strength to 5.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public BrassKnuckles(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 5;
	}

	/**
	 * Custom BrassKnuckles Constructor. Details the minimum of the required values and the number of hands and minimum amount of strength required to use
	 * these knuckles at their greatest capability.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public BrassKnuckles(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
	}

	/**
	 * Default BrassKnuckles Constructor. Makes some ordinary brass knuckles. 
	 */
	public BrassKnuckles() {
		super("Brass Knuckles", 3, 0, 1, 1.7, 1, 5);
	}
}
