package lisääläksyjä;

import java.util.Scanner;

public class TyontekijaOhjelma {

	public static void main(String[] args) {
		// Call Classes
		Tyontekija worker = new Tyontekija();
		Scanner input = new Scanner(System.in);
		// Introduce variables for a worker
		String fullName, empAdd;
		double hourlySalary = 0;
		
		System.out.println("Syötä työntekijän tiedot!");
		
		System.out.print("Anna nimi: ");
		fullName = input.nextLine();
		worker.setNimi(fullName);
		System.out.print("Anna osoite: ");
		empAdd = input.nextLine();
		worker.setOsoite(empAdd);
		System.out.print("Anna tuntipalkka: ");
		hourlySalary = input.nextDouble();
		worker.setTuntipalkka(hourlySalary);
		
		System.out.print("TYÖNTEKIJÄTIEDOT\n" + worker.toString());
	
	}

}
