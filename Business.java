/**
 * subclass of Building
 * 
 * @author Ethan Hopkins
 * @version 1.0
 * Module 1 Programming Project
 * Spring Semester / Freshman Year
 */

public class Business extends Building{
	protected int numRentableUnits;//holds the amount of availiable units
	
	
	/**
	 * default constructor
	 */
	public Business() {
		numRentableUnits = 0;
	}//end default constructor
	
	
	/**
	 * preferred constructor
	 * @param numRentableUnits will pass a new value for the rentable units
	 */
	public Business(String projectName, String completeAddress, 
			double totalSquareFeet, String occupancyGroup, String subGroup, 
			int numRentableUnits) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor
	
	
	/**
	 * draw method
	 * will draw the object to the screen
	 */
	public void draw() {
		System.out.println("Drawing code for <<Business>>");
	}//end draw method
	
	
	/**
	 * Business displayData
	 */
	public String displayData() {
		System.out.println("Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup + "\n"
				+ "Available Units: " + numRentableUnits);
		
		return "Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup + "\n"
				+ "Available Units: " + numRentableUnits;
	}//end method

	/**
	 * getter for numRentableUnits
	 * @return numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getter


	/**
	 * setter for numRentableUnits
	 * @param numRentableUnits passes a new value for numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setter


	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
	
//end program
}
