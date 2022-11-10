package controller;

import java.util.List;

import modal.Flight;
import repositories.FlightDataBase;
import view.ViewFlightDetails;

public class FlightControler {

	
	public void listFlightDetails(String arivalPlase, String depaturePlase) {
		ViewFlightDetails viewFlightDetails=new ViewFlightDetails();
		List<Flight> flightDetails = FlightDataBase.getInstance().getFlightDetails();
		for(Flight flight:flightDetails) {
			List<String> flightRouts=flight.getRoutes();
				if(flightRouts.contains(arivalPlase)&&flightRouts.contains(depaturePlase)) {
					viewFlightDetails.display(flight);
			}
		}
	}

	

	public void findFlightRouts(String arivalPlase, String depaturePlase) {
		// TODO Auto-generated method stub
		
	}
}
