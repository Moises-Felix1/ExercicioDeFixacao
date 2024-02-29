package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.Product;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Birth date(DD/MM/YYYY): ");
		String data = sc.next();
		LocalDate date = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		System.out.println();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Date agora = new Date();
		Order order = new Order(agora, OrderStatus.valueOf(status), new Client(name, email, date));
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #"+(i+1) +" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String p_name = sc.nextLine();
			System.out.print("Product price: ");
			double p_price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			System.out.println();
			OrderItem item = new OrderItem(quantity, p_price, new Product(p_name, p_price));
			order.addItems(item);
		}
		
		System.out.println();
		
		System.out.println(order.toString());
		sc.close();
	}

}
