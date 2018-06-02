package pl.edu.agh.to.booking.hotelProvider;

import java.util.ArrayList;
import java.util.List;

import skeleton.Customer;
import skeleton.Hotel;
import skeleton.HotelManager;
import skeleton.Room;

public class HotelProvider {

	public static Hotel getExampleHotel() {
		System.out.println("TWORZENIE NOWEGO HOTELU");

		Hotel hotel = new Hotel();
		hotel.setCustomerList(getExampleCustomers());
		hotel.setRoomList(getExampleRooms());
		return hotel;

	}

	public static List<Customer> getExampleCustomers() {
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("Jan", "Kowalski"));
		customerList.add(new Customer("Adam", "Nowak"));
		return customerList;

	}

	public static List<Room> getExampleRooms() {
		List<Room> roomList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			roomList.add(new Room());
		}
		return roomList;

	}

	public static HotelManager getExampleHotelManager() {
		System.out.println("TWORZENIE NOWEGO HOTELU MANAGERA");
		return new HotelManager();
	
	}
	
	public static Customer getExampleCustomer() {
		return new Customer("Robert", "Lewandowski");
	}
	
	
}
