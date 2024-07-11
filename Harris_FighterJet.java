
public class Harris_FighterJet implements Harris_AirVehicle, Harris_SoundBarrier {

	// Variables within the class
	private int numberOfEngines;
	private int numberOfCrew;
	private String nameOfJet;
	private String nameOfManufacturer;
	
	// Default constructor
	public Harris_FighterJet(){
	}
	
	// Constructor with variables for arguments in the parameter list
	public Harris_FighterJet(int numberOfEngines, int numberOfCrew, String nameOfJet, String nameOfManufacturer) {
		this.numberOfEngines = numberOfEngines;
		this.numberOfCrew = numberOfCrew;
		this.nameOfJet = nameOfJet;
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

	// Getters and setters for name of the fighter jet
	public String getNameOfJet() {
		return nameOfJet;
	}
	public void setNameOfJet(String nameOfJet) {
		this.nameOfJet = nameOfJet;
	}

	// Getters and setters for name of the jet manufacturer
	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}
	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = nameOfManufacturer;
	}
	
	// toString method to print information for the fighter jet
	public String toString() {
		return "FighterJet [numEngines=" + numberOfEngines + ", numCrewMembers=" + numberOfCrew + ", nameOfPlane=" + nameOfJet + ", manufacturer=" + nameOfManufacturer + "]";
	}

	// Implementing method from the interface Harris_SoundBarrier
	@Override
	public void breakSoundBarrier() {
		System.out.println("F-22 broke the sound barrier!");
	}

	// Implementing the methods from the interface Harris_AirVehicle
	@Override
	public void avTakeOff() {
		System.out.println(nameOfJet + " has started the takeoff roll..........");
		try {
			Thread.sleep(3000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
		System.out.println(nameOfJet + " has taken off and is now flying.");
		try {
			Thread.sleep(3000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
	}
	@Override
	public void avFly() {
		System.out.println("Flying............");
		try {
			Thread.sleep(3000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
	}
	@Override
	public void avLand() {
		try {
			Thread.sleep(3000);
		}
		catch (Exception ex) {
			System.out.println("Exception.");
		}
		System.out.println(nameOfJet + " has successfully landed.");
	}
	
	
}
