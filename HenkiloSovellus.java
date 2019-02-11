import java.util.Scanner;

public class HenkiloSovellus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Henkilo create = new Henkilo();
		
		boolean loop = true;
		int userselect = 0;
		String userName = "";
		String userAddress = "";
		while (loop == true){
		System.out.println("1. Anna henkilö\n2. Näytä henkilön tiedot\n3."
				+ " Muuta henkilön tietoja\n0. Lopetus");
			
		System.out.print("Anna valintasi (0-3): ");
		userselect = input.nextInt();
		if (userselect == 1) {
			System.out.print("Anna nimi: ");
			userName = input.nextLine();
			userName = input.nextLine();
			create.setNimi(userName);
			System.out.print("Anna osoite: ");
			userAddress = input.nextLine();
			create.setOsoite(userAddress);
			continue;
		}
		else if (userselect == 2) {
			if(userName == "" && userAddress == "") {
				System.out.println("Henkilöä ei ole!");
				continue;
			}
			System.out.println(create.toString());
		}
		else if (userselect == 3) {
			if(userName == "" && userAddress == "") {
				System.out.println("Henkilöä ei ole!");
				continue;
			}
			System.out.print("Anna nimi: ");
			userName = input.nextLine();
			userName = input.nextLine();
			create.setNimi(userName);
			System.out.print("Anna osoite: ");
			userAddress = input.nextLine();
			create.setOsoite(userAddress);
			continue;
		}
		else if (userselect == 0){
			loop = false;
			break;
		}
		else {
			break;
		}
		}
	}
}
