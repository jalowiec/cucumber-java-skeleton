package skeleton;



	import java.util.ArrayList;
	import java.util.List;

	public class HotelManager {
		
		private List<Room> roomList = new ArrayList<>();
		private List<Person> personList = new ArrayList<>();
//		private List<RoomCommand> history = new ArrayList<>();
		
		
						
		public void addRoom() {
			Room addedRoom = new Room();
			addedRoom.setFree();
			roomList.add(addedRoom);
		}
		
		public Room getAddedRoom() {
			return roomList.get(roomList.size()-1);
		}
		

		public void addPerson(int personId, String personName, String personSurname) {
			personList.add(new Person(personId, personName, personSurname));
			//TODO - obs³uga podwojnego dodawania osoby
		}
		
		

		
//		public void addToHistory(RoomCommand command) {
//			history.add(command);
///		}
		
		
/*		public Room getRoom(int roomNumber) {
			
			for(Room element : roomList) {
				if(element.getRoomNumber() == roomNumber) 
					return element;
				
			}
			return null;
		}
		
		public Person getPerson(int personId) {
			
			for(Person element : personList) {
				if(element.getPersonId() == personId) 
					return element;
				
			}
			return null;
		}
		
		public void roomsDisplay() {
			for(Room element : roomList) {
				System.out.print(element.getRoomNumber() + " ");
				element.getState().stateDescription();
			}
			
			
			
		}

	}
*/
	
}
