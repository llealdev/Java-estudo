package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(12, new Date(), OrderStatus.PEDING_PAGYMRNT);
		
		System.out.println(order);
		
		OrderStatus of1 = OrderStatus.DELIVERED;
		OrderStatus of2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println();
		System.out.println(of1);
		System.out.println(of2);

	}

}
