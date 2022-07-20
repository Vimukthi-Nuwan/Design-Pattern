public class RoomFactory {

    public Room createRoom(String s){
        if (s == null || s.isEmpty())
            return null;
        switch (s){
            case "Single":
                return new Single();
            case "Double":
                return new Double();
            case "King":
                return new King();
            case "Queen":
                return new Queen();
            case "Twin":
                return new Twin();
            default:
                throw new IllegalArgumentException("Unknown Room "+s);
        }
    }

}
