import java.util.Scanner;

public class TellMeWhichMonth {

	public static void main(String[] args) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		Scanner input = new Scanner(System.in);
        
		//Prompt the user to enter a number
		System.out.print("Please enter a number between 1 and 12: ");
		int number=input.nextInt();
		
		if(number<1 || number>12) {
			System.out.println("Error! Invalid number.");
			System.exit(0);
			
		}
		
		System.out.println("\nThe number you have chosen corresponds to the month of '"+months[number-1]+"'");
		
	}

}
