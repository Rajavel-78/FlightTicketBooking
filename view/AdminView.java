package view;

import java.util.Scanner;

import controller.FlightControler;

public class AdminView {
  private Scanner scanner=new Scanner(System.in);
	public void adminMenu() {
		System.out.println("SELECT YOUR OPTION\n1.ADD FLIGHT DETAILS\n2 ADD ROUTS\n3 SERECH PASSANger\n4. BACK TO MENU");
		String option=scanner.nextLine();
		switch(option){
		case "1":
			CreateFlightView createflightView=new CreateFlightView();
			createflightView.createflight();
		break;
		case "2":
		break;
		case "3":
		break;
		case "4":
			LogInView login=new LogInView();
            login.checkLogIn();
		break;
		default:
		System.out.println("INVALIED INPUTS");
		
		}this.adminMenu();
		
		
	}

	

}
