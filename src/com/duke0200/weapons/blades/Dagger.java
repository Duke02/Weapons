package com.duke0200.weapons.blades;

/**
 * Dagger Class. Obviously, the dagger is greatly limited in range compared to the sword. 
 * The dagger has less attack than the sword but makes up for it with its faster attack 
 * speed and it only needing one hand to operate fully. 
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class Dagger extends Sword {

	/**
	 * Custom Dagger Constructor. Details all mandatory values.
	 * <br>Defaults hands to 1 and minimum strength to 5
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public Dagger(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 5;
	}

	/**
	 * Custom Dagger Constructor. Details all mandatory values and number of hands.
	 * <br>Defaults minimum strength to 5.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public Dagger(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 5;
	}

	/**
	 * Custom Dagger Constructor. Details all values.
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min   Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public Dagger(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Default Dagger Constructor. Makes a plain old dagger.
	 */
	public Dagger() {
		super("Dagger", 3, 2, 1, 1.6, 1, 5 );
	}

}
