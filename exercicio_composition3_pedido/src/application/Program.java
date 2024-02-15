package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entitie.enums.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDateTime = LocalDateTime.now().format(formatter);
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Cliente data: ");
		System.out.print("Name : ");
		String nameClient = sc.nextLine();
		System.out.print("Email : ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.nextLine();
		LocalDate formattedDate = LocalDate.parse(date, fmt); 
		
		Client client = new Client(nameClient, email, formattedDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order( LocalDateTime.now(), status, client);
		 
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #"+ (i+1) +" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct =sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(nameProduct, price);
			
			OrderItem item = new OrderItem(quantity, price, product);
			
			order.addItem(item);
		}
		System.out.println();
		System.out.println(order);
		
		sc.close();
	

	}


}
