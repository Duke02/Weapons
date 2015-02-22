package com.duke0200.weapons.shields;

import com.duke0200.weapons.Weapon;

/**
 * Shield Class. Base for all Shields.
 * 
 * @author The Duke
 * @since 0.3
 *
 */

public class Shield extends Weapon {

	/**
	 * Custom Shield Constructor. Details all mandatory values.
	 * <br>Defaults number of hands to 1 and minimum Strength to 25
	 * 
	 * @param name  Display name used in GUIs
	 * @param att   Attack used in battles and factoring damage dealt in attacks
	 * @param def   Defense used in battles and factoring damage taken from opposing attacks
	 * @param rng   Range used in determining if opposing entity is in range of this weapon's attack radius
	 * @param spd   Attack Speed used in determining how fast the using entity can attack the opposing entity
	 * 
	 */
	public Shield(String name, int att, int def, int rng, double spd) {
		super(name, att, def, rng, spd);
		this.hands = 1;
		this.minimumStrength = 25;
	}

	public Shield(String name, int att, int def, int rng, double spd, int hands) {
		super(name, att, def, rng, spd, hands);
		this.minimumStrength = 25;
	}

	public Shield(String name, int att, int def, int rng, double spd,
			int hands, int min) {
		super(name, att, def, rng, spd, hands, min);
		
	}

	public Shield() {
		super("Shield", 2, 4, 1, 2.5, 1, 25);
	}

}
