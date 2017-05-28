import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// charlie brown arrrgh

		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet();

		pet.name = "Louie the Pirate Cat";

		// add a loop for responses
		System.out.println("Welcome to Virtual Pet Extravaganza! ");
		
		System.out.println(	"   ^_____^  ");     
		System.out.println(	"   | o X |    n "); 
		System.out.println(	"   (  v  )   | | "); 
		System.out.println(	"  .^`-^-'^.  / /  ");  
		System.out.println(	"  `.  ;  .' / / "); 
		System.out.println(	"  | | | | |  /   "); 
		System.out.println(	" ((_((|))_))  "); 
		
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

			// this is where your do loop *was*
			switch (userInput) {
			case "1":
				pet.hunger();
				System.out.println("Louie ate some stinky pirate grub!\nBut his levels have changed.\n");
				break;

			case "2":
				pet.sleeping();
				System.out.println("Louie is getting some ZzzZzz!\nBut his levels have changed.\n");
				break;

			case "3":
				pet.pillage();
				System.out.println("Louie travel the 7 seas and found some treasure!\nBut his levels have changed.\n");

				break;

			case "4":
				pet.energy();
				System.out.println("Louie drank an energy drink and has more energy!\nBut his levels have changed.\n");
				break;
				
			case "5":
				System.out.println("You have quit Virtual Pet Extravaganza");
				pet.quit();

			}
			
			//runs after every user input with extra stats
			pet.tick();

		} while (pet.energyNow > 0 && pet.feedNow > 0 && pet.pillageNow > 0
				&& pet.sleepNow > 0);

		if (pet.energyNow > 0) {
			System.out.println(pet.name + " now has levels below 0. You made " + pet.name
					+ " walk the plank to Davey Jones' locker.");
		} else if (pet.feedNow > 0) {
			System.out.println(pet.name + " now has levels below 0. You made " + pet.name
					+ " walk the plank to Davey Jones' locker.");
		} else if (pet.pillageNow> 0) {
			System.out.println(pet.name + " now has levels below 0. You made " + pet.name
					+ " walk the nplank to Davey Jones' locker.");
		} else if (pet.sleepNow > 0) {
			System.out.println(pet.name + " now has levels below 0. You made " + pet.name
					+ " walk the plank to Davey Jones' locker.");
		}

	}

}// end main method
