import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// charlie brown arrrgh

		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet();

		pet.name = "Louie the Pirate Cat";

		// add a loop for responses
		System.out.println("Welcome to Virtual Pet Extravaganza! ");

		System.out.println("   ^_____^  ");
		System.out.println("   | o X |    n ");
		System.out.println("   (  v  )   | | ");
		System.out.println("  .^`-^-'^.  / /  ");
		System.out.println("  `.  ;  .' / / ");
		System.out.println("  | | | | |  /   ");
		System.out.println(" ((_((|))_))  ");

		do {
			System.out.println("Here is the status of " + pet.name + "\nHunger is " + pet.feedNow + "\nTiredness is "
					+ pet.sleepNow + "\nPillaging is " + pet.pillageNow + "\nEnergy is " + pet.energyNow);

			System.out.println("\nWhat would you like " + pet.name + " to do?\n Enter the number on the menu below\n");
			System.out.println("1: Feed " + pet.name + " some stinky pirate grub.");
			System.out.println("2: Make " + pet.name + " catch some ZzzZzz.");
			System.out.println("3: Make " + pet.name + " sail the 7 seas and find treasure.");
			System.out.println("4: Raise " + pet.name + " energy levels.");
			System.out.println("5: Quit the program.");
			String userInput = input.nextLine();

			// user input cases
			switch (userInput) {
			case "1":
				pet.hunger();
				System.out.println("Louie ate some stinky pirate grub!\n");
				break;

			case "2":
				pet.sleeping();
				System.out.println("Louie is getting some ZzzZzz!\n");
				break;

			case "3":
				pet.pillage();
				System.out.println("Louie travel the 7 seas and found some treasure!\n");

				break;

			case "4":
				pet.energy();
				System.out.println("Louie drank an energy drink and has more energy!\n");
				break;

			case "5":
				System.out.println("You have quit Virtual Pet Extravaganza");
				pet.quit();

			}
			if (pet.feedNow < 20) {
				System.out.println("I'm getting pretty peckish... I could use some pirate grub.\n");
			} else if (pet.sleepNow < 10) {
				System.out.println("I'm feeling a bit tired... I could use some ZzzZzzs.\n");
			} else if (pet.energyNow < 10) {
				System.out.println("I'm feeling a bit lethargic... I could use some energy!\n");
			} else if (pet.pillageNow < 10) {
				System.out.println("I'm not feeling like a pirate... I need to sail the 7 seas!\n");
			}
			
			// runs after every user input with extra stats to show passage of
			// time
			pet.tick();
	//		System.out.println("Time has passed and " + pet.name + " levels have changed.\n");

		} while (pet.energyNow > 1 && pet.feedNow > 1 && pet.pillageNow > 1 && pet.sleepNow > 1);

		if (pet.energyNow > 0) {
			System.out.println(pet.name + " now has levels below 0.\n You made " + pet.name
					+ " walk the plank to Davey Jones' locker.");
		} else if (pet.feedNow > 0) {
			System.out.println(pet.name + " now has levels below 0.\n You made " + pet.name
					+ " walk the plank to Davey Jones' locker.");
		} else if (pet.pillageNow > 0) {
			System.out.println(pet.name + " now has levels below 0.\n You made " + pet.name
					+ " walk the nplank to Davey Jones' locker.");
		} else if (pet.sleepNow > 0) {
			System.out.println(pet.name + " now has levels below 0.\n You made " + pet.name
					+ " walk the plank to Davey Jones' locker.");
		}

	}

}// end main method
