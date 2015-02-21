package com.duke0200.weapons;

/**
 * 
 * @author The Duke
 * @version 0.2
 * @since 0.1
 *
 */


public class Weapon {
	
	/** 
	 * Display name for this weapon
	*/
	protected String name;
	/** 
	 * This weapon's attack which is used for battling and factoring how much damage the using entity deals to an opposing entity
	 */
	protected int attack;
	/** 
	 * This weapon's defense which is used for battling and factoring how much damage the using entity takes from an attack from an opposing entity 
	 */
	protected int defense;
	/** 
	 * This weapon's range which is used in seeing whether the using entity can attack the opposing entity with this weapon
	 * */
	protected int range;
	/** 
	 * This weapon's minimum number of hands that this weapon can be used with
	 *  */
	protected int hands;
	/** 
	 * This weapon's attack speed which determines how fast the using entity can attack with this weapon
	 * */
	protected double attackSpeed;
	/** 
	 * This weapon's current total kills which will be used to determine if this weapon can earn bonuses based on how many kills it gets in a certain time frame in a future update 
	 * */
	protected int totalKills;
	/** 
	 * This weapon's minimum strength that the using entity is required to meet in order to use this weapon
	 * */
	protected int minimumStrength;
	
	/**
	 * <p>
	 * Constructor for weapons that will be used by any entity that can use them (ie mobs, players, NPCs) specifies weapon's attack, name, defense, range, and attack speed
	 * <br>defaults hands to 2 and minimum strength to 20
	 * 
	 * @param name the name to be displayed for the weapon
	 * @param att  the attack to be used to help the entity that is currently using the weapon attack an opposing entity
	 * @param def  the defense to be used to take off opposing damage from enemy entities
	 * @param rng  the range to be used to figure out how close the entity must be to an opposing entity in order to attack
	 * @param spd  the speed to be assigned to this weapon's attackSpeed to figure out how fast the entity currently using the weapon can use the weapon before it cools down
	 */
	
	
	public Weapon(String name, int att, int def, int rng, double spd) {
		this.name = name;
		this.attack = att;
		this.defense = def;
		this.range = rng;
		this.attackSpeed = spd;
		this.hands = 2;
		this.totalKills = 0;
		this.minimumStrength = 20;
	}
	
	/** 
	 * <p>
	 * Constructor for weapons that will be used by any entity that can use them (ie mobs, players, NPCs) specifies number of hands, along with default 
	 * <br>defaults minimum strength to 20
	 *
	 * @param name  the name to be displayed for the weapon
	 * @param att   the attack to be used to help the entity that is currently using the weapon attack an opposing entity
	 * @param def   the defense to be used to take off opposing damage from enemy entities
	 * @param rng   the range to be used to figure out how close the entity must be to an opposing entity in order to attack
	 * @param spd   the speed to be assigned to this weapon's attackSpeed to figure out how fast the entity currently using the weapon can use the weapon before it cools down
	 * @param hands the number of hands this weapon requires in order to be used, such as one-handed or two-handed
	 */
	
	public Weapon(String name, int att, int def, int rng, double spd, int hands) {
		this.name = name;
		this.attack = att;
		this.defense = def;
		this.range = rng;
		this.attackSpeed = spd;
		this.totalKills = 0;
		this.minimumStrength = 20;
		this.hands = hands;
	}
	
	/**
	 * <p>
	 * Constructor for weapons that will be used by any entity that can use them (ie mobs, players, NPCs) specifies number of hands and minimum strength, along with default
	 * 
	 * @param name  the name to be displayed for the weapon
	 * @param att   the attack to be used to help the entity that is currently using the weapon attack an opposing entity
	 * @param def   the defense to be used to take off opposing damage from enemy entities
	 * @param rng   the range to be used to figure out how close the entity must be to an opposing entity in order to attack
	 * @param spd   the speed to be assigned to this weapon's attackSpeed to figure out how fast the entity currently using the weapon can use the weapon before it cools down
	 * @param hands the number of hands this weapon requires in order to be used, such as one-handed or two-handed
	 * @param min   the minimum amount of strength the entity using this weapon must have in order to use this weapon
	 */
	
	public Weapon(String name, int att, int def, int rng, double spd, int hands, int min) {
		this.name = name;
		this.attack = att;
		this.defense = def;
		this.range = rng;
		this.attackSpeed = spd;
		this.totalKills = 0;
		this.minimumStrength = min;
		this.hands = hands;
	}
	
	/**
	 * Default Constructor for Weapon. Really just used to create less typing. LAWLZ
	 */
	
	public Weapon() {
		this.name = "I'm just filler";
		this.attack = 100101;
		this.defense = 100;
		this.range = 1000000;
		this.attackSpeed = 0.00001;
		this.totalKills = 0;
		this.minimumStrength = 0;
		this.hands = 0; 
	}
	
	/**
	 * <p>
	 * Returns this weapon's attack which can be used with the using entity's attack to deal damage to an opposing entity
	 * 
	 * @return this weapon's attack to be used in fights and accounting for damage taken to the entity currently using this weapon
	 */
	
	public int getAttack() {
		return this.attack;
	}
	
	/**
	 * <p>
	 * Returns this weapon's defense which can be used with the using entity's defense to subtract attack damage from an opposing entity
	 * 
	 * @return this weapon's defense to be used in fights and accounting for damage taken to the entity currently using this weapon
	 */
	
	public int getDefense() {
		return this.defense;
	}
	
	/**
	 * <p>
	 * Returns this weapon's range which is meant to be used to see if the using entity can use this weapon against an opposing entity within this range
	 * 
	 * @return this weapon's range to be used in fights and accounting if the entity currently using this weapon is in proximity for attacking an opposing entity
	 */
	
	public int getRange() {
		return this.range;
	}
	
	/**
	 * <p>
	 * Returns this weapon's number of hands, which can be used to determine whether the using entity can use this weapon with another weapon or item
	 * 
	 * @return this weapon's number of required hands to be used in figuring out if the entity using this weapon can use a double weapon approach
	 */
	
	public int getHands() {
		return this.hands;
	}
	
	/**
	 * <p>
	 * Used to display the name in certain scenarios such as GUIs
	 * 
	 * @return this weapon's name to be displayed in GUIs 
	 */
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * <p>
	 * Used to get how fast an entity can attack with this weapon
	 * 
	 * @return this weapon's attackSpeed to be used in figuring out how fast and often the using entity can use this weapon
	 */
	
	public double getAttackSpeed() {
		return this.attackSpeed;
	}
	
	/**
	 * <p>
	 * Used to get how many total kills. In future updates, this can be used to grant bonuses to the using entity if they gain x kills within y amount of time.
	 * 
	 * @return this weapon's totalKills to be used in the future to give bonuses if the using entity makes a certain number of kills with this weapon in a certain amount of time
	 */
	
	public int getTotalKills() {
		return this.totalKills;
	}
	
	/**
	 * <p>
	 * Used to see whether the using entity can even lift this weapon and use it at its minimum ability
	 * 
	 * @return this weapon's minimumStrength to be used in figuring out whether the using entity can use this weapon based on their strength
	 */
	
	public int getMinimumStrength() {
		return this.minimumStrength;
	}
	
	/**
	 * <p>
	 * To be upgraded with a sharp object to make this weapon's attack greater by 1.25
	 */
	public void makeBladed() {
		this.attack *= 1.25;
	}
	
	/**
	 * <p>
	 * Used to set this weapon's attack for events such as fatigue, spells, etc.
	 * 
	 * @param a this weapon's new base attack
	 */
	
	public void setAttack(int a) {
		this.attack = a;
	}
	
	/**
	 * <p>
	 * Used to change this weapon's defense for certain events such as divine interventions
	 * 
	 * @param d this weapon's new base defense
	 */
	
	public void setDefense(int d) {
		this.defense = d;
	}
	
	/**
	 * <p>
	 * Used to change this weapon's range for certain events such as the using entity gaining additional strength
	 * 
	 * @param r this weapon's new base range
	 */
	
	public void setRange(int r ) {
		this.range = r;
	}
	
	/**
	 * <p>
	 * Used to set which hand the using entity will use this weapon with (commonly 1 or 2)
	 * 
	 * @param h this weapon's new base number of hands 
	 */
	
	public void setHands(int h) {
		this.hands = h;
	}
	
	/**
	 * <p>
	 * Used to change this weapon's name for events such as making this weapon bladed
	 * 
	 * @param n this weapon's new name to be used in GUIs 
	 */
	
	public void setName(String n) {
		this.name = n;
	}
	
	/**
	 * <p>
	 * Used to change this weapon's attack speed for events such as divine intervention and power ups
	 * 
	 * @param as this weapon's new base attackSpeed
	 */
	
	public void setAttackSpeed(double as) {
		this.attackSpeed = as;
	}
	
	/**
	 * <p>
	 * Used to add the most recent kill to this weapon's total kills
	 */
	
	public void addKill() {
		this.totalKills += 1;
	}
	
	/**
	 * <p>
	 * Used to change this weapon's minimum strength. Could be used in case of down grades to the using entity 
	 * 
	 * @param ms this weapon's new base minimumStrength
	 */
	
	public void setMinimumStrength(int ms/*DOS*/) {
		this.minimumStrength = ms;
	}
	
	/**
	 * <p>
	 * Used to deal damage to an opposing entity with values such as opposing defense and user attack being factored in
	 * 
	 * 
	 */
	
	public void Use(/*Entity enemy (cough cough you should do something like this)*/) {
		
	}
}
