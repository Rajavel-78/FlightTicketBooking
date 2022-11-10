package repositories;

import java.util.ArrayList;
import java.util.List;

import modal.Flight;
import modal.Passanger;
import modal.Ticket;

public class FlightDataBase {
	private static FlightDataBase filghtDataBase = null;

	private List<Flight> flightDetails;
	private List<Passanger> passangerDetails;
	private List<Ticket> ticketList;

	private FlightDataBase() {
		flightDetails = new ArrayList<Flight>();
		passangerDetails = new ArrayList<Passanger>();
		ticketList = new ArrayList<Ticket>();
	}

	public static FlightDataBase getInstance() {
		if (filghtDataBase == null) {
			filghtDataBase = new FlightDataBase();
		}
		return filghtDataBase;
	}

	public List<Flight> getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(Flight flightDetails) {
		this.flightDetails.add(flightDetails);
	}

	public List<Passanger> getPassangerDetails() {
		return passangerDetails;
	}

	public void setPassangerDetails(Passanger passangerDetails) {
		this.passangerDetails.add(passangerDetails);
	}

	public List<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(Ticket ticketList) {
		this.ticketList.add(ticketList);
	}

}
