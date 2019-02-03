package kotitehtäviä;
import java.util.Scanner;
import java.text.DecimalFormat;

public class KokoOhjelma {

	public static void main(String[] args) {
		//comments are mostly mental notes to self
		//first create the "olios" to 
		//make the writing process of main simpler!!
		Scanner input = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		Koko test = new Koko();
		// Asks for
			// height
			// weight
		// calculates BMI
		double UserHeight = 0;
		double UserWeight = 0;
		
		System.out.print("Anna pituus: ");
		UserHeight = input.nextDouble();
		System.out.print("Anna Paino: ");
		UserWeight = input.nextDouble();
		test.setPituus(UserHeight);
		test.setPaino(UserWeight);
	
		
		System.out.print("Pituus: " + f.format(test.getPituus()) + "\nPaino:" + f.format(test.getPaino()) + "\n" + f.format(test.getBMI()));
		
	}

}
