public class Apartment extends Residential {

    private int rooms = 1;

    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public void setRooms(int rooms) {
        if (rooms < 1) {
            throw new IllegalArgumentException("rooms must not be less then 1.");
        }
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }



    @Override
    public String toString() {
        return "Apartment{" +
                "rooms=" + rooms +
                '}' + ", " + super.toString();
    }
}
