/**
 * subclass of Building
 * 
 * @author Ethan Hopkins
 * @version 1.0
 * Module 1 Programming Project
 * Spring Semester / Freshman Year
 */

public class Residential extends Building{
	protected int numBedrooms;//acts as the number of bedrooms
	protected int numBathrooms;//acts as the number of bathrooms
	protected boolean laundryRoom;//true or false if a laundry room is present
	
	
	/**
	 * default constructor
	 */
	public Residential() {
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end default constructor
	
	
	/**
	 * preferred constructor
	 * @param numBedrooms passes a new value to numBedrooms
	 * @param numBathrooms passes a new value to numBathrooms
	 * @param laundryRoom passes a new value to laundryRoom
	 */
	public Residential(String projectName, String completeAddress, 
			double totalSquareFeet, String occupancyGroup, String subGroup, 
			int numBedrooms, int numBathrooms, boolean laundryRoom) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor

	
	/**
	 * draw method
	 * will draw the object to the screen
	 */
	public void draw() {
		System.out.println("Drawing code for <<Residential>>");
	}//end draw method
	
	
	/**
	 * Residential displayData
	 */
	public String displayData() {
		System.out.println("Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup + "\n"
				+ "Bedrooms: " + numBedrooms + "\n"
				+ "Bathrooms: " + numBathrooms + "\n"
				+ "Laundry room: " + laundryRoom);
		
		return "Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup + "\n"
				+ "Bedrooms: " + numBedrooms
				+ "Bathrooms: " + numBathrooms + "\n"
				+ "Laundry room: " + laundryRoom;
	}//end method
	

	/**
	 * getter for numBedrooms
	 * @return numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getter


	/**
	 * setter for numBedrooms
	 * @param numBedrooms passes a new value
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setter


	/**
	 * getter for numBathrooms
	 * @return numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getter


	/**
	 * setter for numBathrooms
	 * @param numBathrooms passes a new value
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setter


	/**
	 * getter for laundryRoom
	 * @return laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end getter


	/**
	 * setter for laundryRoom
	 * @param laundryRoom passes a new value
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setter


	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}//end toString
	
	
//end program
}
