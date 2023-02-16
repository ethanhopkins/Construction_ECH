/**
 * subclass of Residential
 * 
 * @author Ethan Hopkins
 * @version 1.0
 * Module 1 Programming Project
 * Spring Semester / Freshman Year
 */

public class SingleFamilyHome extends Residential{
	private boolean garage;//determines whether or not 
	
	
	/**
	 * default constructor
	 */
	public SingleFamilyHome() {
		garage = false;
	}//end default constructor
	
	
	/**
	 * preferred constructor
	 * @param garage passes a new value to garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, 
			double totalSquareFeet, String occupancyGroup, String subGroup, 
			int numBedrooms, int numBathrooms, boolean laundryRoom, 
			boolean garage) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
		this.garage = garage;
	}//end preferred constructor

	
	/**
	 * draw method
	 * will draw the object to the screen
	 */
	public void draw() {
		System.out.println("Drawing code for <<SingleFamilyHome>>");
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
				+ "Bedrooms: " + numBedrooms + "\n"
				+ "Bathrooms: " + numBathrooms + "\n"
				+ "Laundry room: " + laundryRoom + "\n"
				+ "Garage: " + garage);
		
		return "Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup + "\n"
				+ "Bedrooms: " + numBedrooms + "\n"
				+ "Bathrooms: " + numBathrooms + "\n"
				+ "Laundry room: " + laundryRoom + "\n"
				+ "Garage: " + garage;
	}//end method
	
	
	/**
	 * getter for garage
	 * @return garage
	 */
	public boolean isGarage() {
		return garage;
	}//end getter


	/**
	 * setter for garage
	 * @param garage passes a new value
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setter


	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}//end toString
	
	
//end program
}
