package com.duke0200.weapons.shields;

/**
 * CoatOfArms class. A medieval European shield, the family crest was often displayed on the front of this shield, 
 * showing the family's honor on the battlefield. The Coat of Arms is basically a shield with a cool design sadly...
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class CoatOfArms extends Shield {

	/**
	 * Custom CoatOfArms Constructor. User details all mandatory values.
	 * <br>Defaults number of hands to 1 and minimum strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public CoatOfArms(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 25;
	}

	/**
	 * Custom CoatOfArms Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public CoatOfArms(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 25;
	}

	/**
	 * Custom CoatOfArms Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public CoatOfArms(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default CoatOfArms Constructor. Makes an ordinary coat of arms to display your family crest!
	 */
	public CoatOfArms() {
		super("Coat Of Arms", 2, 4, 1, 2.3, 1, 25);
	}

}
