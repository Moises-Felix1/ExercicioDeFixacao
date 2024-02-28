package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		System.out.println("E-mail: ");
		System.out.println("Birth date(DD/MM/YYYY): ");
		
		sc.close();
	}

}
