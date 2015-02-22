package com.duke0200.weapons.sticks;

import com.duke0200.weapons.Weapon;

/**
 * Spear Class. Being a long stick, the spear can reach enemies further away than a sword can but is balanced with its
 * lower defense and slower attack.
 * 
 * @author The Duke
 * @since 0.2
 *
 */

public class Spear extends Weapon {

	/**
	 * Custom Spear Constructor. Details all required values
	 * <br>Defaults hands to 2 and minimum strength to 15
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Spear(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 15;
	}

	/**
	 * Custom Spear Constructor. Details all required values and number of hands required to fully operate this spear.
	 * <br>Defaults minimum Strength to 15
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	
	public Spear(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 15;
	}

	/**
	 * Custom Spear Constructor. Details all required values and number of hands and minimum amount of strength required to fully operate this spear.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Spear(String name, int att, int def, int rng, double spd, int hands,
			int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}
	
	/**
	 * Default Spear Constructor. Used to make normal spear.
	 */
	
	public Spear() {
		super("Spear", 4, 1, 4, 2.3, 2, 15);
	}

}
