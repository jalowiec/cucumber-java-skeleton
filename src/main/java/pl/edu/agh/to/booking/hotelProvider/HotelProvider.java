package pl.edu.agh.to.booking.hotelProvider;

import java.util.ArrayList;
import java.util.List;

import skeleton.Customer;
import skeleton.Hotel;
import skeleton.HotelManager;
import skeleton.Room;

public class HotelProvider {

	public static Hotel getExampleHotel() {
		Hotel hotel = new Hotel();
		hotel.setCustomerList(getExampleCustomers());
		hotel.setRoomList(getExampleRooms());
		return hotel;
	}

	public static HotelManager getExampleHotelManager(Hotel hotel) {
		HotelManager hotelManager = new HotelManager(hotel);
		return hotelManager;
	}

	public static List<Customer> getExampleCustomers() {
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("Jan", "Kowalski"));
		customerList.add(new Customer("Adam", "Nowak"));
		customerList.add(new Customer("Kamil", "Grosicki"));
		return customerList;

	}

	public static List<Room> getExampleRooms() {
		List<Room> roomList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			roomList.add(new Room());
		}
		return roomList;

	}

	public static void makeSameBookings(Hotel hotel) {
		HotelManager hotelManager = getExampleHotelManager(hotel);
		hotelManager.bookingRoom(hotel.getCustomerList().get(0), hotel.getRoomList().get(0));
		hotelManager.bookingRoom(hotel.getCustomerList().get(1), hotel.getRoomList().get(1));
		hotelManager.lockingRoom(hotel.getCustomerList().get(2), hotel.getRoomList().get(2));
	}

	public static Customer getCustomerFromList(int i) {
		List<Customer> list = getExampleCustomers();
		return list.get(i);
	}

}
