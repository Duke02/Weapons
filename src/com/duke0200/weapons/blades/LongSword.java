package com.duke0200.weapons.blades;

/**
 * 
 * @author The Duke
 * @since 0.2
 *
 */

public class LongSword extends Sword {

	/**
	 * Custom LongSword constructor detailing all values including number of hands and minimum amount of strength
	 * 
	 * @param name   Display name used in GUIs
	 * @param att    Attack used in battles and factoring damage dealt in attacks
	 * @param def    Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng    Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd    Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands  Number of Hands used to determine whether this lance is to be used with one or two hands
	 * @param min    Details minimum amount of strength that is required to use this lance to its full capabilities 
	 */
	public LongSword(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	/**
	 * Custom LongSword constructor detailing all values except for the minimum amount of strength required to use this longsword
	 * <br>defaults minimum strength to 25
	 * 
	 * @param name   Display name used in GUIs
	 * @param att    Attack used in battles and factoring damage dealt in attacks
	 * @param def    Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng    Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd    Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * @param hands  Number of Hands used to determine whether this lance is to be used with one or two hands
	 */
	public LongSword(String name, int att, int def, int rng, double spd,
			int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 25;
	}

	/**
	 * Custom LongSword constructor detailing all default values 
	 * <br>defaults hands to 2 and minimum strength to 25
	 * 
	 * @param name Display name used in GUIs
	 * @param att  Attack used in battles and factoring damage dealt in attacks
	 * @param def  Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng  Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd  Attack Speed used in determining how fast the using entity can attack the opposing entity
	 */
	public LongSword(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 2;
		this.minimumStrength = 25;
	}

	/**
	 * Default LongSword constructor. Just a regular ol' long sword, nothing to see here...
	 */
	
	public LongSword() {
		super("Longsword", 5, 3, 3, 2.7, 2);
	}
}
