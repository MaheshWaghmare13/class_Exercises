import java.util.*;
public class Painting {

	public static void main(String[] args) {
		
		int noOfDoors,noOfWindows;
		double length,width,height;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the length of Room:");
		length=sc.nextDouble();
		System.out.println("Enter the Width of Room:");
		width=sc.nextDouble();
		System.out.println("Enter the Height of Room:");
		height=sc.nextDouble();
		System.out.println("Enter the Number of doors in a  Room:");
		noOfDoors=sc.nextInt();
		System.out.println("Enter the Number of windows in a Room:");
		noOfWindows=sc.nextInt();
		
		double totalSurfaceArea=2*(length*width+length*height+width*height);
		System.out.println("Total surface area= "+totalSurfaceArea);
		
		double areaofDoors= 20*noOfDoors;
		System.out.println("total Area of doors = "+areaofDoors);
		
		double areaofWindows= 15*noOfWindows;
		System.out.println("total Area of Windows = "+areaofWindows);
		
		
		double areaofFloor=length*width;
		System.out.println("Area of floor ="+areaofFloor);
		
		double paintingarea=totalSurfaceArea-areaofDoors-areaofWindows-areaofFloor;
		System.out.println("Total painting area= "+paintingarea);
		
		double paintneeded=paintingarea/350;
		
		
		
		System.out.println("paint needed to be paint the room is:"+paintneeded +"gallon");
		
	}

}
