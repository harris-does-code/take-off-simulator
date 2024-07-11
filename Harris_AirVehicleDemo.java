
import java.util.Scanner;

public class Harris_AirVehicleDemo {

	public static void main(String[] args) {
		
		// One object for a fighter jet with data for number of engines, number of crew, jet name, and manufacturer name
		Harris_FighterJet jetOne = new Harris_FighterJet(2, 1, "F-22", "Lockheed Martin");
		
		// One object for a cargo plane with data for number of engines, number of crew, plane name, and manufacturer name
		Harris_CargoPlane planeOne = new Harris_CargoPlane(4, 3, "C-17", "Boeing");
		
		// Output fighter jet information
		System.out.println("###################");
		System.out.println("# FighterJet Info #\n");
		System.out.println(jetOne.toString() + "\n");
		
		// Create Scanner and variables for 'yes' and 'no' inputs from user
		Scanner input = new Scanner(System.in);
		String yes = "y";
		String no = "n";
		
		// Prompt user for take off information for fighter jet
		System.out.println("Ready for takeoff? (y/n): ");
		String takeOffJet = input.nextLine();
		
		// Loop to check if the plane can take off or if take off should be delayed
		while (takeOffJet.equals(no)) {
			if (takeOffJet.equals(no)) {
				System.out.println("Pilot will be prompted again in 5 seconds.");
				System.out.println("Please ensure takeoff preparations are complete.");
				try {
					Thread.sleep(5000);
				}
				catch(Exception ex) {
					System.out.println("Exception.");
				}
				System.out.println("Ready for takeoff? (y/n): ");
				takeOffJet = input.nextLine();
			}
			else if (takeOffJet.equals(yes)) {
				break;
			}
			else {
				break;
			}
			
		}
		// Deploy methods for flight simulation of fighter jet
		jetOne.avTakeOff();
		jetOne.avFly();
		jetOne.breakSoundBarrier();
		jetOne.avLand();
		
		// Output cargo plane information
		System.out.println("\n###################");
		System.out.println("# CargoPlane Info #\n");
		System.out.println(planeOne.toString() + "\n");
		
		// Prompt user for take off information for cargo plane
		System.out.println("Ready for takeoff? (y/n): ");
		String takeOffPlane = input.nextLine();
		
		// Loop to check if the plane can take off or if take off should be delayed
		while (takeOffPlane.equals(no)) {
			if (takeOffPlane.equals(no)) {
				System.out.println("Pilot will be prompted again in 5 seconds.");
				System.out.println("Please ensure takeoff preparations are complete.");
				try {
					Thread.sleep(5000);
				}
				catch(Exception ex) {
					System.out.println("Exception.");
				}
				System.out.println("Ready for takeoff? (y/n): ");
				takeOffPlane = input.nextLine();
			}
			else if (takeOffPlane.equals(yes)) {
				break;
			}
			else {
				break;
			}
		}
		// Deploy methods for flight simulation of cargo plane
		planeOne.avTakeOff();
		planeOne.avFly();
		planeOne.avLand();
		
		
	}
}




