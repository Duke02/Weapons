package com.duke0200.weapons.blades;

import com.duke0200.weapons.Weapon;

/**
 * 
 * @author The Duke
 * @since 0.2
 *
 */

public class Sword extends Weapon {

	/**
	 * <p>
	 * Custom Sword Constructor detailing all default values
	 * <br>defaults hands to 1 and minimum strength to 20
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * 
	 */
	
	public Sword(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 20;
	}

	/**
	 * <p>
	 * Custom Sword constructor detailing all default values and number of hands
	 * <br>defaults minimum strength to 20
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	
	public Sword(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 20;
	}

	/**
	 * Custom Sword Constructor detailing all needed values including number of hands and minimum amount of strength required 
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	
	public Sword(String name, int att, int def, int rng, double spd, int hands,
			int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}
	
	/**
	 * Used to make a normal sword
	 */
	
	public Sword() {
		super("Sword", 4, 2, 2, 2.1, 1);
	}

}
