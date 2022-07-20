public class RoomService {

    public static void main(String[] args) {
        RoomFactory roomFactory = new RoomFactory();
        Room room = roomFactory.createRoom("Single");
        room.allowUser();
    }

}
