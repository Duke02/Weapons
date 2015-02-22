package com.duke0200.weapons.ranged;

import com.duke0200.weapons.Weapon;

/**
 * Sling Class. Used in most ancient civilizations, the sling is basically a piece of cloth with a hard object 
 * in the middle. The projectile is then swung with the cloth and hits the enemy. The sling has less range than 
 * a bow but is faster and needs only one hand to use.
 * 
 * @author The Duke
 * @since 0.4
 *
 */
public class Sling extends Weapon {

	/**
	 * Custom Sling Constructor. User details all mandatory values.
	 * <br>Defaults hands to 1 and minimum strength to 10.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Sling(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd, 1, 10);
	}

	/**
	 * Custom Sling Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 10.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Sling(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands, 10);
		
	}

	/**
	 * Custom Sling Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Sling(String name, int att, int def, int rng, double spd, int hands,
			int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Sling Constructor. Makes an ordinary sling.
	 */
	public Sling() {
		super("Sling", 4, 1, 7, 1.9, 1, 10);
	}

}
