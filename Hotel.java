
public class Hotel {
    public static void main(String [] args){
        HotelRoom room1 = new HotelRoom(307, 4);
        HotelRoom room2 = new HotelRoom(205, 3);
        room2.checkIn("Test Guest");
        HotelRoom room3 = new HotelRoom(402, 2);
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println("Hotel Menu:\n1 -Display rooms by room number\n2 -Check-in to a room\n3 -Check-out from a room\n4 -Find available room by requested beds");
    }
}
