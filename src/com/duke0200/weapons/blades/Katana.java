package com.duke0200.weapons.blades;

/**
 * Katana class. Being known for its speed in real life, the katana here is a lot like a sword 
 * but has quite a faster attack speed, allowing for you too be a Ninja of the Fruits!
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class Katana extends Sword {

	/**
	 * Custom Katana Constructor. Details all mandatory values.
	 * <br>Defaults number of hands to 2 and minimum strength to 20.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Katana(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 20;
	}

	/**
	 * Custom Katan Constructor. Details all mandatory values.
	 * <br>Defaults minimum strength to 20.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Katana(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 20;
	}

	/**
	 * Custom Katana Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Katana(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Katana Constructor. Makes a plain old katana.
	 */
	public Katana() {
		super("Katana", 4, 2, 2, 1.8, 2, 20);
	}

}
