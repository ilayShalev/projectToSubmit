import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
   public static RealEstateManager manager = new RealEstateManager("Ilay");

    public static void main(String[] args) {


        manager.setProperties(DataManager.getSampleProperties());

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nבחר אופציה:");
            System.out.println("1 < חיפוש נכסים");
            System.out.println("2 < דו\"ח פיננסי");
            System.out.println("3 < תשואת נדל\"ן מסחרי");
            System.out.println("4 < נכסים לפי עיר");
            System.out.println("5 < כמות ערים");
            System.out.println("-1 < יציאה מהתוכנית");
            System.out.print("בחר: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("הזן מחיר מקסימלי: ");
                    double price = scanner.nextDouble();
                    propertiesList(price);
                    break;
                case 2:
                    financialReport();
                    break;
                case 3:
                    System.out.println("תשואת נדל\"ן מסחרי: " + commercialReport());
                    break;
                case 4:
                    System.out.print("הזן שם עיר: ");
                    scanner.nextLine();
                    String city = scanner.nextLine();
                    PropertiesByCity(city);
                    break;
                case 5:
                    numberOfCities(manager);
                    break;
                case -1:
                    System.out.println("יציאה מהתוכנית");
                    return;
                default:
                    System.out.println("אופציה לא תקינה");
            }

        }


    }


    public static void propertiesList(double price) {
        try {
            if (price < 0) {
                throw new PriceException("Price cannot be negative.");
            }

            for (Property property : manager.getProperties()) {
                if (property.getPrice() < price) {
                    throw new PriceException("Property price " + property.getPrice() + " is greater than the specified price.");
                } else {
                    System.out.println(property);
                }
            }

        } catch (PriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void financialReport(){
        for (Property property : manager.getProperties()) {
            property.taxIt();
        }

    }


    public static double  commercialReport() {
        double sum = 0.0;
        for (Property property : manager.getProperties()) {
            if(property instanceof Commercial) {
                sum += ((Commercial) property).getYield();
            }
        }
        return sum;
    }


    public static void PropertiesByCity(String city){
        city = city.toLowerCase().replace("-", "");
        for (Property property : manager.getProperties()) {
            String address = property.getAddress().toLowerCase().replace("-", "");
            if(address.contains(city)){
                System.out.println(property);
            }
        }

    }
    public static void numberOfCities(RealEstateManager manager) {
        Set<String> cities = new HashSet<>();

        for (Property property : manager.getProperties()) {
            String address = property.getAddress();
            String city = address.split(",")[0].trim();

            cities.add(city);
        }

        System.out.println("Number of unique cities: " + cities.size());
        System.out.println("Cities: " + cities);
    }
}