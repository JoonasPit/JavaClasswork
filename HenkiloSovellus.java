package lisääläksyjä;
import java.util.Scanner;

public class HenkiloSovellus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		
		while(loop == true) {
			int userselect = 0;
			
			System.out.print("Anna valinta 1-3");
			userselect = input.nextInt();
			if(userselect == 0){
				loop = false;
			}
			
		}
		
		// kesken
		

	}

}
