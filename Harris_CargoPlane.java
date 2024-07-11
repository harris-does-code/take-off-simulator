
public class Harris_CargoPlane implements Harris_AirVehicle {
	
	// Variables for the class
	private int numberOfEngines;
	private int numberOfCrew;
	private String nameOfPlane;
	private String nameOfManufacturer;
	
	// Default constructor
	public Harris_CargoPlane() {
	}

	// Constructor with variables as arguments for the parameter list
	public Harris_CargoPlane(int numberOfEngines, int numberOfCrew, String nameOfPlane, String nameOfManufacturer) {
		this.numberOfEngines = numberOfEngines;
		this.numberOfCrew = numberOfCrew;
		this.nameOfPlane = nameOfPlane;
		this.nameOfManufacturer = nameOfManufacturer;
	}

	// Getters and setters for number of engines
	public int getNumberOfEngines() {
		return numberOfEngines;
	}
	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	// Getters and setters for number of crew members
	public int getNumberOfCrew() {
		return numberOfCrew;
	}
	public void setNumberOfCrew(int numberOfCrew) {
		this.numberOfCrew = numberOfCrew;
	}

	// Getters and setters for the name of the cargo plane
	public String getNameOfPlane() {
		return nameOfPlane;
	}
	public void setNameOfPlane(String nameOfPlane) {
		this.nameOfPlane = nameOfPlane;
	}

	// Getters and setters for the name of the plane's manufacturer
	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}
	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = nameOfManufacturer;
	}
	
	// toString method to print out the cargo plane's information
	public String toString() {
		return "CargoPlane [numEngines=" + numberOfEngines + ", numCrewMembers=" + numberOfCrew + ", nameOfPlane=" + nameOfPlane + ", manufacturer=" + nameOfManufacturer + "]";
	}

	// Implementing the methods from the interface Harris_AirVehicle
	@Override
	public void avTakeOff() {
		System.out.println(nameOfPlane + " has started the takeoff roll..........");
		try {
			Thread.sleep(8000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
		System.out.println(nameOfPlane + " has taken off and is now flying.");
		try {
			Thread.sleep(8000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
	}
	@Override
	public void avFly() {
		System.out.println("Flying............");
		try {
			Thread.sleep(8000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
	}
	@Override
	public void avLand() {
		try {
			Thread.sleep(8000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
		System.out.println(nameOfPlane + " has successfully landed.");
	}
	
	
	
}
