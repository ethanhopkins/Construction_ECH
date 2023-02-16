/**
 * subclass of Residential
 * 
 * @author Ethan Hopkins
 * @version 1.0
 * Module 1 Programming Project
 * Spring Semester / Freshman Year
 */

public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;//holds the average size of the units
	private boolean parkingAvailable;//determines whether or not parking is available
	
	
	/**
	 * default constructor
	 */
	public Apartment() {
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}//end default constructor
	
	
	/**
	 * 
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Apartment(String projectName, String completeAddress, 
			double totalSquareFeet, String occupancyGroup, String subGroup, 
			int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor


	/**
	 * getter for numRentableUnits
	 * @return numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getter


	/**
	 * setter for numRentableUnits
	 * @param numRentableUnits passes a new value
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setter


	/**
	 * getter for avgunitSize
	 * @return avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getter


	/**
	 * setter for avgUnitSize
	 * @param avgUnitSize passes a new value
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setter


	/**
	 * getter for parkingAvailable
	 * @return parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end getter


	/**
	 * setter for parkingAvailable
	 * @param parkingAvailable passes a new value
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setter


	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + ", getNumRentableUnits()=" + getNumRentableUnits() + ", getAvgUnitSize()="
				+ getAvgUnitSize() + ", isParkingAvailable()=" + isParkingAvailable() + ", getNumBedrooms()="
				+ getNumBedrooms() + ", getNumBathrooms()=" + getNumBathrooms() + ", isLaundryRoom()=" + isLaundryRoom()
				+ ", toString()=" + super.toString() + ", displayData()=" + displayData() + ", getProjectName()="
				+ getProjectName() + ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()="
				+ getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubGroup()="
				+ getSubGroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}//end toString
	
	
//end program
}
