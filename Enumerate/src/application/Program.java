package application;

import java.util.Date;

import enitites.nums.OrderStatus;
import entities.Order;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
