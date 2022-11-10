package view;

import java.util.Scanner;

public class UserView {
	private Scanner scanner = new Scanner(System.in);

	public void userMenu() {
		ManageUser manageUser = new ManageUser();
		System.out.println("1. TICKETBOOKING \n2.LISTOF FLIGHT ROUTS \n3.CANCALTICKETS\n4 BACK TO MENU\nENTER YOUR OPTION");
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			manageUser.ticketBooking();
			break;
		case "2":
			manageUser.flightRouts();
			break;
		case "3":
			manageUser.cancalTicket();
			break;
		case "4":
             LogInView login=new LogInView();
             login.checkLogIn();
			break;
		default:
			System.out.println("INVALIED INPUTS");
			this.userMenu();

		}

	}

}
