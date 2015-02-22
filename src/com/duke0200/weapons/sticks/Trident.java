package com.duke0200.weapons.sticks;

import com.duke0200.weapons.Weapon;

/**
 * Trident Class. The trident yields slightly more defense and range than the sword 
 * but has a slower attack speed and takes more hands and strength to use fully.
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class Trident extends Weapon {

	/**
	 * Custom Trident Constructor. Details all mandatory values.
	 * <br>Defaults hands to 2 and minimum Strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Trident(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 25;
	}

	/**
	 * Custom Trident Constructor. Details all mandatory vlaues along with number of hands.
	 * <br>Defaults minimum Strength to 25.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Trident(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 25;
	}

	/**
	 * Custom Trident Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Trident(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Trident Constructor. Makes an ordinary, three-pronged trident.
	 */
	public Trident() {
		super("Trident", 5, 3, 3, 2.6, 2, 25);
	}

}
