package modal;

public class Passanger {
	private int PassangerId;
	private String passangerName;
	private int age;
	private String genter;
	private String arrivalPlase;
	private String departurePlase;
	private float Amount;

	public int getPassangerId() {
		return PassangerId;
	}

	public void setPassangerId(int passangerId) {
		PassangerId = passangerId;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenter() {
		return genter;
	}

	public void setGenter(String genter) {
		this.genter = genter;
	}

	public String getArrivalPlase() {
		return arrivalPlase;
	}

	public void setArrivalPlase(String arrivalPlase) {
		this.arrivalPlase = arrivalPlase;
	}

	public String getDeparturePlase() {
		return departurePlase;
	}

	public void setDeparturePlase(String departurePlase) {
		this.departurePlase = departurePlase;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

}
