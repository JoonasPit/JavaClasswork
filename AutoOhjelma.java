package lisääläksyjä;
import java.util.Scanner;

public class AutoOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kysyy merkki malli rekisteri vuosimalli
		Scanner input = new Scanner(System.in);
		Auto car = new Auto();
		
		String CarType, CarModel,LicensePlate;
		int carYear = 0;
		
		System.out.print("Anna merkki: ");
		CarType = input.nextLine().trim();
		car.setCarType(CarType);
		
		System.out.print("Anna malli: ");
		CarModel = input.nextLine().trim();
		car.setCarModel(CarModel);
		
		System.out.print("Anna rekisterinumero: ");
		LicensePlate = input.nextLine().trim();
		car.setLicensePlate(LicensePlate);
		
		System.out.print("Anna vuosimalli: ");
		carYear = input.nextInt();
		
		car.setmodelyear(carYear);
			
		
		System.out.println("Merkki ja malli: " + car.getCarType() + car.getCarModel());
		System.out.println("Rekisterinumero: " + car.getLicensePlate());
		System.out.print("Vuosimalli: " + car.getmodelyear());
	}

}
