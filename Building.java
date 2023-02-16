/**
 * super class for Business and Residential
 * 
 * @author Ethan Hopkins
 * @version 1.0
 * Module 1 Programming Project
 * Spring Semester / Freshman Year
 */

public class Building {
	protected String projectName;//represents the name of the project
	protected String completeAddress;//acts as the building's address
	protected double totalSquareFeet;//acts as the complete measurement of the project in square feet
	protected String occupancyGroup;//represents the type of building
	protected String subGroup;//more specific occupancy group
	
	
	/**
	 * default constructor
	 */
	public Building() {
		projectName = " ";
		completeAddress = " ";
		totalSquareFeet = 0.0;
		occupancyGroup = " ";
		subGroup = " ";
	}//end default constructor
	
	
	/**
	 * preferred constructor
	 * @param projectName will pass a new value for projectName
	 * @param completeAddress will pass a new value for completeAddress
	 * @param totalSquareFeet will pass a new value for totalSquareFeet
	 * @param occupancyGroup will pass a new value for occupancyGroup
	 * @param subGroup will pass a new value for subGroup
	 */
	public Building(String projectName, String completeAddress, 
			double totalSquareFeet, String occupancyGroup, String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}//end preferred constructor
	
	
	/**
	 * draw method
	 * will draw the object to the screen
	 */
	public void draw() {
		System.out.println("Drawing code for <<Building>>");
	}//end draw method
	
	
	/**
	 * displayData method
	 * will return all information
	 */
	public String displayData() {
		System.out.println("Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup);
		
		return "Current Project Info: \n"
				+ "Name: " + projectName + "\n"
				+ "Address: " + completeAddress + "\n"
				+ "Sq Ft: " + totalSquareFeet + "\n"
				+ "Group: " + occupancyGroup + "\n"
				+ "SubGroup: " + subGroup;
	}//end displayData method


	/**
	 * getter
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}//end getter

	
	/**
	 * setter
	 * @param projectName sets new value
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setter

	
	/**
	 * getter
	 * @return completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getter


	/**
	 * setter
	 * @param completeAddress sets new value
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setter


	/**
	 * getter
	 * @return totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getter


	/**
	 * setter
	 * @param totalSquareFeet sets new value
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setter


	/**
	 * getter
	 * @return occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getter


	/**
	 * setter
	 * @param occupancyGroup sets new value
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setter


	/**
	 * getter
	 * @return subGroup
	 */
	public String getSubGroup() {
		return subGroup;
	}//end getter


	/**
	 * setter
	 * @param subGroup sets new value
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end setter


	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}//end toString
	
	
//end program
}
