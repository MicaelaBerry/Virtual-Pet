import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// charlie brown arrrgh

		Scanner input = new Scanner(System.in);

		Dog fido = new Dog();
		writeLine("My dog is " + fido);

		fido.name = "Fido"; // always write name(fido) and give it a value(name)
							// before asking for it's value
		writeLine("Its name is " + fido.name);
	}

}
