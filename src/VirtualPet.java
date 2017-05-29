
public class VirtualPet {

	String name;
	int energyNow = 50;
	int feedNow = 30;
	int sleepNow = 40;
	int pillageNow = 60;

	
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
	
	void quit (){
		System.exit(0);
	}

	void tick() {
		energyNow = energyNow + 5;
		feedNow = feedNow + 5;
		sleepNow = sleepNow + 5;
		pillageNow = pillageNow + 5;

	}
}
