/*Contains the inventory of the player as well as the player stats
 * will house functions for checking inventory, adding/removing items from inventory
 * adding/removing from inventory should refresh HP/CP
 * pointer to next player in order
 * adding/removing health in combat
 * where the player is
 * LED color, player looks, other customizations
 */
public class Player implements PlayerInterface {

	@Override
	public int getHealthPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setHealthPoints(int add) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCombatPower() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setCombatPower(int add) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGold() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setGold(int add) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFood() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setFood(int add) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean[] getKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean[] setKeyofCourage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean[] setKeyofWisdom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean[] setKeyofStrength() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isStarving() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setStarving(boolean state) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDiseased() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDiseased(boolean state) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSlowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSlowed(boolean state) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setLost(boolean state) {
		// TODO Auto-generated method stub

	}

	@Override
	public Space getSpace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Space move(Space s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRobbed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRobbed(boolean state) {
		// TODO Auto-generated method stub

	}

	@Override
	public Trap getTrap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTrap(Trap t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setArmor(String[] a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setWeapon(String w) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPotion(String p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMagicItem(String i) {
		// TODO Auto-generated method stub

	}

	@Override
	public Armor getArmor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weapon getWeapon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Potion getPotion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MagicItem getMagicItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
