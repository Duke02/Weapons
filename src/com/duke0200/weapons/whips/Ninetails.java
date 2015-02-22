package com.duke0200.weapons.whips;

/**
 * Ninetails class. Basically a bunch of whips with one handle (is that what it's called? I should do my research...), 
 * the ninetails has a higher attack than its superclass but attacks slower. 
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class Ninetails extends Whip {

	/**
	 * Custom Ninetails Constructor. User details all mandatory values.
	 * <br>Defaults number of hands to 1 and minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Ninetails(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd, 1, 15);
		
	}

	/**
	 * Custom Ninetails Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 15.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Ninetails(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands, 15);
		
	}

	/**
	 * Custom Ninetails Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Ninetails(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Ninetails Constructor. Makes a normal Ninetails that you can't put in a PokeBall sadly...
	 */
	public Ninetails() {
		super("Ninetails", 6, 1, 5, 2.6, 1, 15);
	}

}
