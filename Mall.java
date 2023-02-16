/**
 * subclass of Business
 * 
 * @author Ethan Hopkins
 * @version 1.0
 * Module 1 Programming Project
 * Spring Semester / Freshman Year
 */

public class Mall extends Business{
	private int numRentedUnits;//holds amount of units rented
	private double medianUnitSize;//holds value for the size of the unit
	private int numParkingSpaces;//holds value for amount of parking spaces
	
	
	/**
	 * default constructor
	 */
	public Mall() {
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}//end default constructor
	
	
	/**
	 * preferred constructor
	 * @param numRentableUnits passes a new value to numRentableUnits
	 * @param medianUnitSize passes a new value to medianUnitSize
	 * @param numParkingSpaces passes a new value to numParkingSpaces
	 */
	public Mall(String projectName, String completeAddress, 
			double totalSquareFeet, String occupancyGroup, String subGroup, 
			int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//end preferred constructor

	
	/**
	 * draw method
	 * will draw the object to the screen
	 */
	public void draw() {
		System.out.println("Drawing code for <<Mall>>");
	}//end draw method
	
	
	/**
	 * Mall displayData
	 */
	public String displayData() {
		System.out.println("Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup + "\n"
				+ "Rented Units: " + numRentedUnits + "\n"
				+ "Median Unit Size: " + medianUnitSize + "\n"
				+ "Parking Spaces: " + numParkingSpaces);
		
		return "Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup + "\n"
				+ "Rented Units: " + numRentedUnits + "\n"
				+ "Median Unit Size: " + medianUnitSize + "\n"
				+ "Parking Spaces: " + numParkingSpaces;
	}//end method
	

	/**
	 * getter for numRentedUnits
	 * @return numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getter


	/**
	 * setter for numRentedUnits
	 * @param numRentedUnits passes a new value
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setter


	/**
	 * getter for medianUnitSize
	 * @return medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getter


	/**
	 * setter for medianUnitSize
	 * @param medianUnitSize passes a new value
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setter


	/**
	 * getter for numParkingSpaces
	 * @return numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getter


	/**
	 * setter for numParkingSpaces
	 * @param numParkingSpaces passes a new value
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setter


	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}//end toString method
	
	
//end program
}
