package com.duke0200.weapons.sticks;

import com.duke0200.weapons.Weapon;

/**
 * 
 * @author The Duke
 * @since 0.2
 *
 */

public class Staff extends Weapon {

	/**
	 * Custom Staff constructor. Details all required values for this staff.
	 * <br>Defaults hands to 2 and minimumStrength to 15
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	
	public Staff(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 15;
	}

	/**
	 * Custom Staff Constructor that details all required values and the number of required hands to operate this staff
	 * <br>Defaults minimum strength to 15
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	
	public Staff(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 15;
		
	}

	/**
	 * Custom Staff Constructor that details all values including the base required ones as well as the number of 
	 * required hands to fully operate this staff as well as the minimum strength needed as well.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	
	public Staff(String name, int att, int def, int rng, double spd, int hands,
			int min) {
		super(name, att, def, rng, spd, hands, min);
	}
	
	public Staff() {
		super("Staff", 4, 1, 3, 1.8, 2);
	}

}
