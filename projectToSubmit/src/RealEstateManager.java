import java.util.ArrayList;
import java.util.List;

public class RealEstateManager {
    private String name;
    private List<Property> properties = new ArrayList<>();

    public RealEstateManager(String name) {
        setName(name);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public List<Property> getProperties() {
        return new ArrayList<>(properties);
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public Property[] getPropertiesByPrice(double maxPrice) throws PriceException {
        if (maxPrice < 0) {
            throw new PriceException("Price cannot be negative");
        }

        List<Property> resultList = new ArrayList<>();
        for (Property property : properties) {
            if (property.getPrice() <= maxPrice) {
                resultList.add(property);
            }
        }
        return resultList.toArray(new Property[0]);
    }

    public double totalSum(){
        double sum = 0;
        for (Property property : properties) {
            sum += property.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "RealEstateManager{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }
}
