public class Commercial extends Property {
    private boolean storeroom = false;
    private double yield = 0.0;


    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }

    public Commercial(String address, double area, double price, boolean storeroom, double yield) {
        super(address, area, price);
        setStoreroom(storeroom);
        setYield(yield);
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public void setYield(double yield) {
        if (yield < 0) {
            throw new IllegalArgumentException("levels must not be negative");
        }
        this.yield = yield;
    }



    public boolean getStoreroom(){
        return storeroom;
    }

    public double getYield() {
        return yield;
    }


    public void yearYield() {
        System.out.println("Expectation : " + getPrice() * (getYield() / 100) / 12);
    }

    @Override
    public void taxIt() {
        System.out.println("Tax : " + getPrice() * 0.05);
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "storeroom=" + storeroom +
                ", yield=" + yield +
                '}' + ", " + super.toString();
    }
}
