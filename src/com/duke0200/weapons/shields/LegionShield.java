package com.duke0200.weapons.shields;

/**
 * LegionShield Class. Used during the reign of the Ancient Roman Empire, 
 * this shield has a higher defense than its superclass but is balanced with its 
 * slower attack speed and requiring more strength to use.
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class LegionShield extends Shield {

	/**
	 * Custom LegionShield Constructor. Details all mandatory values.
	 * <br>Defaults number of required hands to 1 and minimum strength to 30.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public LegionShield(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 30;
	}

	/**
	 * Custom LegionShield Constructor. Details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 30.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public LegionShield(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 30;
	}

	/**
	 * Custom LegionShield Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public LegionShield(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default LegionShield Constructor. Makes an ordinary legionairre's shield so that you can be 
	 * a soldier of Rome!
	 */
	public LegionShield() {
		super("Legion Shield", 2, 5, 1, 2.4, 1, 30);
	}

}
