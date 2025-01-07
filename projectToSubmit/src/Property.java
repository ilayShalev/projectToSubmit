public abstract class Property {
    private String address = "na ,Na";
    private double area = 0.0;
    private double price = 0.0;

    public Property() {
    }

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }


    public void setAddress(String address) {
        if (address == null || address.isEmpty() || !isValidAddress(address)) {
            throw new IllegalArgumentException("Invalid address. Must not be null, empty, and contain at least two words.");
        }
        this.address = address;
    }


    public void setArea(double area) {
        if (area < 0) {
            throw new IllegalArgumentException("Area must not be negative.");
        }
        this.area = area;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must not be negative.");
        }
        this.price = price;
    }


    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }


    private boolean isValidAddress(String address) {
        String[] words = address.trim().split("\\s+");
        return words.length >= 2;
    }


    public abstract void taxIt();


    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}
