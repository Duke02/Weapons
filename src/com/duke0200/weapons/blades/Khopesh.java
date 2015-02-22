package com.duke0200.weapons.blades;

/**
 * Khopesh Class. An Ancient Egyptian sword, the khopesh had a curved design, allowing the weilder to hook 
 * opponents weapons and throw them across the battlefield. The Khopesh has more defense than a sword 
 * and a faster attack speed. 
 * 
 * @author The Duke
 * @since 0.4
 *
 */

public class Khopesh extends Sword {

	/**
	 * Custom Khopesh Constructor. User details all mandatory values.
	 * <br>Defaults number of hands to 1 and minimum strength to 20.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Khopesh(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 20;
	}

	/**
	 * Custom Khopesh Constructor. User details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 20.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Khopesh(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 20;
	}

	/**
	 * Custom Khopesh Constructor. User details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Khopesh(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Khopesh Constructor. Makes a normal khopesh so that you can be like Rick Riordan's Carter!
	 */
	public Khopesh() {
		super("Khopesh", 4, 3, 2, 2.0, 1, 20);
	}

}
