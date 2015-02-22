package com.duke0200.weapons.blades.shortswords;

import com.duke0200.weapons.blades.Sword;

/**
 * ShortSword Class. Basically a sword only with less strength required to use it and is always a one handed 
 * weapon.
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class ShortSword extends Sword {

	/**
	 * Custom ShortSword Constructor. Details all minimum required values. 
	 * <br>Defaults number of hands to 1 and minimum strength to 15
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public ShortSword(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 15;
	}

	/**
	 * Custom ShortSword Constructor. Details all minimum required values and number of hands.
	 * <br>Defaults minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public ShortSword(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 15;
	}

	/**
	 * Custom ShortSword Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public ShortSword(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default ShortSword Constructor. Makes an ordinary Short Sword.
	 */
	public ShortSword() {
		super("Short Sword", 4, 2, 2, 2.1, 1, 15);
	}

}
