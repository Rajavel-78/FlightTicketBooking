package view;

import java.util.Scanner;

import controller.CheckLogin;

public class LogInView {
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("hello");
		LogInView login = new LogInView();
		login.checkLogIn();

	}

	public void checkLogIn() {
		System.out.println("SELECT YOUR OPTION\n1.ADMIN\n2.USER");
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			boolean isValied = true;

			while (isValied) {
				CheckLogin check = new CheckLogin();
				System.out.println("Enter your name");
				String name = scanner.nextLine();
				System.out.println("Enter your password");
				String password = scanner.nextLine();
				if (check.checkDetails(name, password)) {
					isValied = false;
				}
			}
			AdminView adminView = new AdminView();
			adminView.adminMenu();
			break;
		case "2":
			UserView userView = new UserView();
			userView.userMenu();
			break;

		}

	}

}
