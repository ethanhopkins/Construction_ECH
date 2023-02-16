/**
 * application class for Construction package
 * 
 * @author Ethan Hopkins
 * @version 1.0
 * Module 1 Programming Project
 * Spring Semester / Freshman Year
 */

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * New building objects using each constructor
		 */
		Building b1 = new Building("Gaines House", 
				"123 Main Street | Louisville, Kentucky | 40201", 2540, 
				"Residential", "R1");
		b1.displayData();
		b1.draw();
		b1.toString();
		
		b1.getProjectName();
		b1.setProjectName(null);
		
		b1.getCompleteAddress();
		b1.setCompleteAddress(null);
		
		b1.getTotalSquareFeet();
		b1.setTotalSquareFeet(0);
		
		b1.getOccupancyGroup();
		b1.setOccupancyGroup(null);
		
		b1.getSubGroup();
		b1.setSubGroup(null);
		
		System.out.println("\n");
		
		Building b2 = new Building();
		b2.displayData();
		b2.draw();
		b2.toString();
		System.out.println("\n");
		//end building testing
		
		
		/**
		 * New business objects with both constructors
		 */
		Business bs1 = new Business("Office", 
				"384 South Street | Louisville, Kentucky | 40201", 
				4800, "Business", "B", 6);
		bs1.displayData();
		bs1.draw();
		bs1.toString();
		
		bs1.getNumRentableUnits();
		bs1.setNumRentableUnits(0);
		System.out.println("\n");
		
		Business bs2 = new Business();
		bs2.displayData();
		bs2.draw();
		bs2.toString();
		System.out.println("\n");
		//end business testing
		
		
		/**
		 * New residential objects with both constructors
		 */
		Residential r1 = new Residential("Gaines House", 
				"123 Main Street | Louisville, Kentucky | 40201", 2540, 
				"Residential", "R1", 3, 4, true);
		r1.displayData();
		r1.draw();
		r1.toString();
		
		r1.getNumBedrooms();
		r1.setNumBedrooms(0);
		
		r1.getNumBathrooms();
		r1.setNumBathrooms(0);
		
		r1.isLaundryRoom();
		r1.setLaundryRoom(false);
		System.out.println("\n");
		
		Residential r2 = new Residential();
		r2.displayData();
		r2.draw();
		r2.toString();
		System.out.println("\n");
		//end residential testing
		
		/**
		 * New mall objects with both constructors
		 */
		Mall m1 = new Mall("Jefferson Mall", 
				"123 North Street | Louisville, Kentucky | 40201", 40000, 
				"Business", "B", 8, 6, 18);
		m1.displayData();
		m1.draw();
		m1.toString();

		m1.getNumRentedUnits();
		m1.setNumRentedUnits(0);
		
		m1.getMedianUnitSize();
		m1.setMedianUnitSize(0);
		
		m1.getNumParkingSpaces();
		m1.setNumParkingSpaces(0);
		System.out.println("\n");
		
		Mall m2 = new Mall();
		m2.displayData();
		m2.draw();
		m2.toString();
		System.out.println("\n");
		//end mall testing
		
		
		/**
		 * New singlefamilyhome objects with both constructors
		 */
		SingleFamilyHome s1 = new SingleFamilyHome("Gaines House", 
				"128 East Street | Louisville, Kentucky | 40201", 2540, 
				"Residential", "R1", 4, 3, true, false);
		s1.displayData();
		s1.draw();
		s1.toString();
		
		s1.isGarage();
		s1.setGarage(true);
		System.out.println("\n");
		
		SingleFamilyHome s2 = new SingleFamilyHome();
		s2.displayData();
		s2.draw();
		s2.toString();
		//end singlefamilyhome testing
		
	}

}
