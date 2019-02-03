import java.util.Scanner;

public class HenkiloOhjelma {

	public static void main(String[] args) {
		//Define variables for main program
		String UserName;
		String UserAddress;
		// Introduce scanner
		Scanner input = new Scanner(System.in);
		//Call my other class and create function
		Henkilo test = new Henkilo();
		//Set variables
		System.out.print("Anna nimi: ");
		UserName = input.nextLine();
		test.setNimi(UserName);
		
		System.out.print("Anna osoite: ");
		UserAddress = input.nextLine();
		test.setOsoite(UserAddress);

		System.out.println("Nimi on: " + test.getNimi() +  " | Osoite on: " + test.getOsoite());
		System.out.print(test.toString());
	}

}
