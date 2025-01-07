public abstract class Residential extends Property {
    private int parkingLots = 0;


    public Residential(String address, double area, double price, int parkingLots) {
        super(address, area, price);
        setParkingLots(parkingLots);
    }

    public void setParkingLots(int parkingLots) {
        if (parkingLots < 0) {
            throw new IllegalArgumentException("parkingLots must not be negative.");
        }
        this.parkingLots = parkingLots;
    }

    public int getParkingLots() {
        return parkingLots;
    }


    @Override
    public void taxIt() {
        System.out.println("Tax : " + getPrice() * 0.08);
    }

    @Override
    public String toString() {
        return "Residential{" +
                "parkingLots=" + parkingLots +
                '}' + ", "  + super.toString();
    }
}
