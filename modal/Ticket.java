package modal;

public class Ticket {
	private int ticketNo;
	private int flightId;
	private int passangerId;
	private String arivalPlase;
	private String departurePlase;
	private float amount;

	public Ticket(int ticketNo, int flightId, int passangerId, String arivalPlase, String departurePlase,
			float amount) {
		super();
		this.ticketNo = ticketNo;
		this.flightId = flightId;
		this.passangerId = passangerId;
		this.arivalPlase = arivalPlase;
		this.departurePlase = departurePlase;
		this.amount = amount;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}

	public String getArivalPlase() {
		return arivalPlase;
	}

	public void setArivalPlase(String arivalPlase) {
		this.arivalPlase = arivalPlase;
	}

	public String getDeparturePlase() {
		return departurePlase;
	}

	public void setDeparturePlase(String departurePlase) {
		this.departurePlase = departurePlase;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
