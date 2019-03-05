package lisääläksyjä;
import java.util.Scanner;

public class TuotteetOhjelma {
	
	
	public void askBook() {
		
	}
	
	public void askDVD() {
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DVDTuote dvd = new DVDTuote();
		KirjaTuote book = new KirjaTuote();
		Tuote product = new Tuote();
		
		String productNbm, productName, productSidos;
		String productAgeRes = "";
		double productPrice;
		int pages, productDuration;
		
		System.out.println("Anna kirjatuotteen tiedot!");
		
		System.out.print("Anna tuotekoodi: ");
		productNbm = input.nextLine();
		book.setTuotenro(productNbm);
		System.out.print("Anna nimi: ");
		productName = input.nextLine();
		book.setNimi(productName);
		System.out.print("Anna hinta: ");
		productPrice = input.nextDouble();
		book.setHinta(productPrice);
		System.out.print("Anna sivumäärä: ");
		pages = input.nextInt();
		book.setAmt(pages);
		System.out.print("Anna sidosasu: ");
		productSidos = input.next();
		book.setSidosAsu(productSidos);
		
		System.out.println("Anna dvdtuotteen tiedot!");
		
		System.out.print("Anna tuotekoodi: ");
		productNbm = input.next();
		dvd.setTuotenro(productNbm);
		System.out.print("Anna nimi: ");
		productName = input.nextLine();
		productName = input.nextLine();
		dvd.setNimi(productName);
		System.out.print("Anna hinta: ");
		productPrice = input.nextDouble();
		dvd.setHinta(productPrice);
		System.out.print("Anna kesto(min): ");
		productDuration = input.nextInt();
		dvd.setLength(productDuration);
		System.out.print("Ikäsuositus: ");
		while(productAgeRes == "") {
		productAgeRes = input.next();
		dvd.setAgeFor(productAgeRes);
		}
		System.out.println("KIRJATUOTTEEN TIEDOT!");
		
		System.out.print(book.toString());
		
		System.out.println("DVDTUOTTEEN TIEDOT!");
		System.out.print(dvd.toString());
		

	}

}
