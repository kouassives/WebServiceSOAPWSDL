import java.util.Scanner;

import messervices.MonService;
import messervices.MonServiceService;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonService port = new MonServiceService().getMonServicePort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Votre nom : ");
		String nom = sc.nextLine();
		System.out.println(port.hello(nom));
	}

}
