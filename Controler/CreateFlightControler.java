package controller;

import java.util.ArrayList;
import java.util.List;

import modal.Flight;
import repositories.FlightDataBase;
import view.CreateFlightView;

public class CreateFlightControler {
	static int flightId=0;
	private CreateFlightView createFlightView;

	public CreateFlightControler(CreateFlightView createFlightView2) {
		this.createFlightView = createFlightView;
	}

	public void createNewFlight(String name, ArrayList<String> flightRouts, String aravialDate, String departureTime,int seat,float amount) {
		Flight flight = new Flight();
		flight.setFlightId(flightId);
		flight.setFlightName(name);
		flight.setArivalTime(aravialDate);
		flight.setDepartureTime(departureTime);
		flight.setRoutes(flightRouts);
		flight.setSeats(seat);
		flight.setAmount(amount);
        FlightDataBase.getInstance().setFlightDetails(flight);
		if (true) {
//			createFlightView.flightCreated("Flight Created");
		} else {
//			createFlightView.flightCreated("Flight not Created");
		}
	}

}
