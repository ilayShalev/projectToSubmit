public class Plot extends Property {
    public enum Type {
        URBAN,
        AGRICULTURAL,
        INDUSTRIAL
    }

    private Type type;

    public Plot(String address, double area, double price, Type type) {
        super(address, area, price);
        setType(type);

    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        this.type = type;
    }

    @Override
    public void taxIt() {
        if(getType() == Type.URBAN){
            System.out.println("Tax : " + getPrice() * 0.1);
        }
        else if(getType() == Type.AGRICULTURAL){
            System.out.println("Tax : " + getPrice() * 0.02);
        }
        else if(getType() == Type.INDUSTRIAL){
            System.out.println("Tax : " + getPrice() * 0.05);
        }

    }

    @Override
    public String toString() {
        return "Plot{" +
                "type=" + type +
                '}' + ", " + super.toString();
    }
}
