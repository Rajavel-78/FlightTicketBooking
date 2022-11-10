package view;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import controller.CreateFlightControler;

public class CreateFlightView {
	private Scanner scanner = new Scanner(System.in);
	private CreateFlightControler createFlightController;

	public CreateFlightView() {
		createFlightController = new CreateFlightControler(this);
	}

	public void createflight() {
		System.out.println("ENTER THE FLIGHT NAME");
		String flightName=scanner.nextLine();
		System.out.println("ENTER THE HOW MANEY ROOTS");
		ArrayList<String>flightRouts=new ArrayList<String>();
		int count=scanner.nextInt();
		while(count>=0) {
			System.out.println("");
			flightRouts.add(scanner.next());
			count--;
		}
		 System.out.println("AravialTime");
		 String aravialDate=scanner.nextLine();
		 System.out.println("departureTime");
		 String departureTime=scanner.nextLine();
		 System.out.println("ENTER THE SEATS COUNT");
		 int seatsCount=scanner.nextInt();
		 System.out.println("ENTER THE AMOUNT");
		 float amount=scanner.nextFloat();
		 createFlightController.createNewFlight(flightName,flightRouts,aravialDate,departureTime,seatsCount,amount);
	}

	public void flightCreated(String alert) {
		System.out.println(alert);
	}

}
