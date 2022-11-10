package view;

import java.util.Scanner;

import controller.FlightControler;
import controller.TicketController;
import modal.Passanger;

public class ManageUser {
private Scanner scanner=new Scanner(System.in);
	public void ticketBooking() {
		System.out.println("Enter YOUR NAME");
		String passangerName=scanner.nextLine();
		System.out.println("ENTER YOUR AGE");
		int passangerAge=scanner.nextInt();
		System.out.println("ENTER YOUR ARIVAL PLASE");
		String arivalPlase=scanner.nextLine();
		System.out.println("ENTER YOUR DEPATURE PLASE");
		String depaturePlase=scanner.nextLine();
		FlightControler flightControl=new FlightControler();
		flightControl.listFlightDetails(arivalPlase, depaturePlase);
		System.out.println("ENTER THE FLIGHT NUMBER");
		int flightId=scanner.nextInt();
		TicketController ticketControl=new TicketController();
		ticketControl.booking(flightId,passangerName,passangerAge,arivalPlase,depaturePlase);
		
	}
	public void flightRouts() {
	     System.out.println("ENTER THE ARIVAL PLASE");
	     String arivalPlase=scanner.nextLine();
	     System.out.println("ENTER THE ARIVAL PLASE");
	     String depaturePlase=scanner.nextLine();
	     FlightControler flightControler=new FlightControler();
	     flightControler.findFlightRouts(arivalPlase,depaturePlase);
	}

	public void cancalTicket() {
		System.out.println("ENTER THE TICKET NO");
		int ticketNO=scanner.nextInt();
		
	}
    public void payAmount(Passanger passanger,float amount) {
	  
		
	}

}
