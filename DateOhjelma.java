package lisääläksyjä;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;



public class DateOhjelma {
	
	
	

	public static void main(String[] args) {
				
		Date timetoday = new Date();
		SimpleDateFormat simpledate = new SimpleDateFormat("yyyy-MM-dd");
		
		int userbirth;

		String inputdate = "";
		int parseyear = 0;
		
		Scanner input = new Scanner(System.in);

		
		System.out.println(simpledate.format(timetoday));
		checkTime(timetoday);
				

				
		System.out.print("Anna syntymävuotesi: ");
		userbirth = input.nextInt();
		userAge(userbirth, timetoday);
		
		
		System.out.print("Anna joku päivämäärä: ");
		
		// wouldn't take input at all had to call nextLine twice
		inputdate = input.nextLine();
		inputdate = input.nextLine();
		toString(inputdate);

	}
	
	public static void userAge(int userbirth,Date timetoday) {
		String year;

		SimpleDateFormat simpleyear = new SimpleDateFormat("yyyy");

		
		int parsedyear = 0;
		year = simpleyear.format(timetoday);
		int userage = 0;

		parsedyear = Integer.parseInt(year);
		userage = parsedyear - userbirth;
		System.out.println(userage);
		
	}
	
	public static void checkTime(Date timetoday) {
		String thehoursatm;
		int parsedhours = 0;

		SimpleDateFormat simplehours = new SimpleDateFormat("HH");
	
		thehoursatm = simplehours.format(timetoday);
		parsedhours = Integer.parseInt(thehoursatm);

				
		if(parsedhours > 12) {
			System.out.println("Iltapäivä");			
		}
		else if(parsedhours < 12) {
			System.out.println("Aamupäivä");
		}

	}
	
	public static void toString(String inputdate){
		
		// parses the user given date and returns the date as parsed.
		SimpleDateFormat userinputy = new SimpleDateFormat("dd/MM/yyyy");

		Date userinputDate;
		try {
		userinputDate = userinputy.parse(inputdate);
		System.out.print(userinputDate);
		}catch(ParseException e) { 
			System.out.println("Muunto ei onnistunut"); 
			}		
	}
			
	
}
