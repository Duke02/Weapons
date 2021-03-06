package com.duke0200.weapons.whips;

import com.duke0200.weapons.Weapon;

/**
 * Whip Class. With a higher attack and range than a sword, the whip is balanced with its inferior 
 * defense and slower attack speed.
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class Whip extends Weapon {

	/**
	 * Custom Whip Constructor. User details all mandatory values.
	 * <br>Defaults number of hands to 1 and minimum defense to 10.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Whip(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd, 1, 10);
		
	}

	/**
	 * Custom Whip Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 10.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Whip(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands, 10);
		
	}

	/**
	 * Custom Whip Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Whip(String name, int att, int def, int rng, double spd, int hands,
			int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Whip Constructor. Makes an ordinary whip. 
	 */
	public Whip() {
		super("Whip", 5, 1, 5, 2.5, 1, 10);
	}

}
