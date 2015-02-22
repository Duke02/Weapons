package com.duke0200.weapons.ranged;

import com.duke0200.weapons.Weapon;

/**
 * Bow Class. The bow is a ranged weapon that is the basis for most high ranged weapons.
 *  Slower than a sword, the bow makes up for it with its high range. 
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class Bow extends Weapon {

	/**
	 * Custom Bow Constructor. Details all required values.
	 * <br>Defaults hands to 2 and minimum strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Bow(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 25;
	}

	/**
	 * Custom Bow Constructor. Details all required values and number of hands.
	 * <br>Defaults minimum strength to 25. 
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Bow(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 25;
	}

	/**
	 * Custom Bow Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Bow(String name, int att, int def, int rng, double spd, int hands,
			int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Bow Constructor. Makes a normal bow.
	 */
	public Bow() {
		super("Bow", 4, 1, 12, 2.5, 2, 25);
	}

}
