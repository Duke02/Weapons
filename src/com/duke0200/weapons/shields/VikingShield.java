package com.duke0200.weapons.shields;

/**
 * Viking Shield Class. Used by the fierce warriors of the North (get it? Norse North? ...Nevermind), 
 * the viking shield is small and fast but not as durable as metallic shield variants.
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class VikingShield extends Shield {

	/**
	 * Custom VikingShield Constructor. User details all mandatory values.
	 * <br>Defaults hands to 1 and minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public VikingShield(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 15;
	}

	/**
	 * Custom VikingShield Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public VikingShield(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 15;
	}

	/**
	 * Custom Viking Shield. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public VikingShield(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default VikingShield Constructor. Makes a normal, wooden Viking Shield.
	 */
	public VikingShield() {
		super("Viking Shield", 2, 4, 1, 2.2, 1, 15);
	}

}
