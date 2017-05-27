import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// charlie brown arrrgh

		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet();

		pet.name = "Louie the Pirate Cat";

		// add a loop for responses
		System.out.println("Welcome to Virtual Pet Extravaganza! ");
		do {
			System.out.println("Here is the status of " + pet.name + "\nHunger is " + pet.feedNow + "\nTiredness is "
					+ pet.sleepNow + "\nPillaging is " + pet.pillageNow + "\nEnergy is " + pet.getEnergyNow());

			System.out.println("\nWhat would you like " + pet.name + " to do?\n Enter the number on the menu below\n");
			System.out.println("1: Feed " + pet.name + " some stinky food.");
			System.out.println("2: Make " + pet.name + " catch some ZzzZzz.");
			System.out.println("3: Make " + pet.name + " sail the 7 seas and find treasure.");
			System.out.println("4: Get " + pet.name + " energy level.");
			String userInput = input.nextLine();

			// this is where your do loop *was*
			switch (userInput) {
			case "1":
				pet.hunger();
				break;

			case "2":
				pet.sleeping();
				break;

			case "3":
				pet.pillage();
				break;

			case "4":
				pet.energy();
				break;

			}
			pet.tick();

		} while (pet.getEnergyNow() > 0);

		if (pet.getEnergyNow() > 0) {
			System.out.println("You made " + pet.name + " walk the \nplank to Davey Jones' locker.");
		}
		if (pet.getFeedNow() > 0) {
			System.out.println("You made " + pet.name + " walk the \nplank to Davey Jones' locker.");
		} if (pet.getPillageNow() > 0) {
			System.out.println("You made " + pet.name + " walk the \nplank to Davey Jones' locker.");
		}if (pet.getSleepNow() > 0) {
			System.out.println("You made " + pet.name + " walk the \nplank to Davey Jones' locker.");
		}
	}

}// end main method
