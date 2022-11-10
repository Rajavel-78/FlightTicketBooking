package controller;

import java.util.List;

import modal.Flight;
import modal.Passanger;
import repositories.FlightDataBase;
import view.ManageUser;
import view.ViewFlightDetails;

public class TicketController {

	public void cansalTicket() {

	}

	
	public boolean booking(int flightId, String passangerName, int passangerAge, String arivalPlase,
			String depaturePlase) {
		List<Flight> flightDetails = FlightDataBase.getInstance().getFlightDetails();
		Passanger passanger=new Passanger();
		boolean isAvilable=true;
		for (Flight flight : flightDetails) {
            if(flight.getSeats()!=0) {
            	isAvilable=false;
            	float amount=1000.00f;
            	passanger.setAge(passangerAge);
            	passanger.setAmount(1000.0f);
            	passanger.setArrivalPlase(arivalPlase);
            	passanger.setDeparturePlase(depaturePlase);
            	passanger.setPassangerName(passangerName);
            	passanger.setGenter(depaturePlase);
            	ManageUser mangeUser=new ManageUser();
                mangeUser.payAmount(passanger,amount);
            }
		}
		if(isAvilable) {
			return true;
		}else {
			return false;
		}
		
	}


	

	
}
