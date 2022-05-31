import com.project1.developerdetails.DeveloperDetails;
import com.project1.sortfile.SortFileName;

public class mainToBeDeleted {

	public static void main(String[] args) {
System.out.println("Welcome \n Project 1: Virtual Key for your repositories");
		
		DeveloperDetails dd = new DeveloperDetails();
		
		System.out.println(" "+ dd.displayDeveloperDetails());
		
		SortFileName sfile = new SortFileName();
		sfile.enterFilePath();
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Please select what you like to do: \n" +
		"  A - Request a list of files in ascending order \n  B - More \n  X - To Exit program");
		
			char menuChoice = sc.next().charAt(0);;
			
			switch(menuChoice) {
			case 'A':
			case 'a':
			    System.out.println("List of files in ascending order");
				SortFileName sfn = new SortFileName();
				sfn.sortedFiles();
			case 'B':
			case 'b':
				System.out.println("");
				break;
			case 'X':
			case 'x':
				JOptionPane.showMessageDialog(null, "You have exited the program!");
				break;
			
			default: 
				System.out.println("Invalid input. Try again!");
			} */
			
			/*
			 * while (true) { if (menuChoice == 'A' || menuChoice == 'a') {
			 * System.out.println("Requested list in ascending order"); } else if
			 * (menuChoice == 'B' || menuChoice == 'b') { System.out.println(""); } else
			 * if(menuChoice == 'X' || menuChoice == 'x') {
			 * System.out.println("You have exited the program"); break; } else {
			 * System.out.println("Incorrect input. Try again"); continue; } }
			 */


	}

}
