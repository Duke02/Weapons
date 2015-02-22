package com.duke0200.weapons.sticks;

import com.duke0200.weapons.axes.Axe;

/**
 * Halburd Class. Basically an axe with a longer handle (therefore more range) and slower attack speed.
 * 
 * @author The Duke
 * @since 0.4
 *
 */
public class Halberd extends Axe {

	/**
	 * Custom Halberd Constructor. User details all mandatory values.
	 * <br>Defaults minimum strength to 30 and number of hands to 2.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Halberd(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 30;
	}

	/**
	 * Custom Halberd Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 30.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Halberd(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 30;
	}

	/**
	 * Custom Halberd Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Halberd(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
	}

	/**
	 * Default Halberd Constructor. Makes an ordinary halberd.
	 */
	public Halberd() {
		super("Halberd", 5, 2, 4, 2.8, 2, 30);
	}

}
