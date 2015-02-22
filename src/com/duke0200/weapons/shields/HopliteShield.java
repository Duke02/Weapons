package com.duke0200.weapons.shields;

/**
 * HopliteShield Class. Used by Ancient Greek Spearmen, the hoplite shield is slightly slower 
 * than a legionairre's shield.
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class HopliteShield extends Shield {

	/**
	 * Custom HopliteShield Constructor. User details all mandatory values.
	 * <br>Defaults number of hands to 1 and minimum strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public HopliteShield(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 25;
	}

	/**
	 * Custom HopliteShield Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public HopliteShield(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 25;
	}

	/**
	 * Custom HopliteShield Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public HopliteShield(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default HopliteShield Constructor. Makes a normal Greek Hoplite Shield. 
	 */
	public HopliteShield() {
		super("Hoplite Shield", 2, 5, 1, 2.5, 1, 25);
	}

}
