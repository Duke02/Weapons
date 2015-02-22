package com.duke0200.weapons.sticks;

import com.duke0200.weapons.sticks.Trident;

/**
 * Pitchfork Class. A lot like a trident, the pitchfork has less attack than a trident 
 * but has a faster attack speed.
 * 
 * @author The Duke
 * @since 0.4
 *
 */
public class Pitchfork extends Trident {

	/**
	 * Custom Pitchfork Constructor. User details all mandatory values.
	 * <br>Defaults number of hands to 2 and minimum strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Pitchfork(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd, 2, 25);
		
	}

	/**
	 * Custom Pitchfork Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Pitchfork(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands, 25);
	}

	/**
	 * Custom Pitchfork Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Pitchfork(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Pitchfork Constructor. Makes a normal pitchfork to be used by angry farmers!
	 */
	public Pitchfork() {
		super("Pitchfork", 4, 3, 3, 2.4, 2, 25);
	}

}
