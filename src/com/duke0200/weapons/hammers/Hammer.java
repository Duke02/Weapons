package com.duke0200.weapons.hammers;

import com.duke0200.weapons.Weapon;

/**
 * Hammer Class. A big weapon, the hammer has a vastly larger attack bonus than the sword but takes 
 * more strength and hands to properly use it, plus it has a slower attack speed. 
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class Hammer extends Weapon {

	/**
	 * Custom Hammer Constructor. User details all mandatory values.
	 * <br>Defaults number of hands to 2 and minimum strength to 30
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Hammer(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd, 2, 30);
		
	}

	/**
	 * Custom Hammer Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 30
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Hammer(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands, 30);
		
	}

	/**
	 * Custom Hammer Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Hammer(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Hammer Constructor. Makes a normal hammer. BANG BANG!
	 */
	public Hammer() {
		super("Hammer", 7, 2, 3, 3.4, 2, 30);
	}

}
