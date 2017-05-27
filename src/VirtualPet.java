
public class VirtualPet {

	String name;
	int energyNow = 50;
	int feedNow = 20;
	int sleepNow = 30;
	int pillageNow = 50;

	int getEnergyNow() {
		return energyNow;
	}

	int getFeedNow() {
		return feedNow;
	}

	int getSleepNow() {
		return sleepNow;
	}

	int getPillageNow() {
		return pillageNow;
	}

	void energy() {
		energyNow = energyNow + 10;
		sleepNow = sleepNow - 10;
		feedNow = feedNow - 10;
		pillageNow = pillageNow + 10;
	
	}

	void hunger() {
		feedNow = feedNow + 10;
		sleepNow = sleepNow - 5;
		energyNow = energyNow - 10;
		pillageNow = pillageNow - 10;
	}

	void sleeping() {
		sleepNow = sleepNow + 5;
		energyNow = energyNow + 10;
		feedNow = feedNow - 10;
		pillageNow = pillageNow - 10;
	}

	void pillage() {
		pillageNow = pillageNow + 10;
		sleepNow = sleepNow - 5;
		feedNow = feedNow + 10;
		sleepNow = sleepNow - 10;
	}

	void tick() {
		energyNow = energyNow - 5;
		feedNow = feedNow + 5;
		sleepNow = sleepNow + 5;
		pillageNow = pillageNow + 5;

	}
}
