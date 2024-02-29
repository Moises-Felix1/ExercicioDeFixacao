package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItems(OrderItem item) {
		items.add(item);
	}
	
	public void removeItems(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0;
		for(OrderItem p : items) {
			soma += p.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " +sdf.format(moment)+"\n");
		sb.append("Order status: "+getStatus()+"\n");
		sb.append("Client: "+getClient().getName()+" ("+getClient().getBirth()+") ");
		sb.append("- "+getClient().getEmail()+"\n");
		sb.append("Order items:\n");
		for(OrderItem x : items) {
			sb.append(x.getProduct().getProduct_name()+", ");
			sb.append("$"+String.format("%.2f", x.getProduct().getPrice())+", ");
			sb.append("Quantity: "+x.getQuantity()+", ");
			sb.append("Subtotal: $"+String.format("%.2f", x.subTotal()));
			sb.append("\n");
		}
		sb.append("Total price: $"+String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
}
