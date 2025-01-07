import java.util.ArrayList;
import java.util.List;

public class DataManager {
    public static ArrayList<Property> getSampleProperties(){
        ArrayList<Property> properties = new ArrayList<>();


        properties.add(new Plot("Tel Aviv, Dizengoff 45", 200.0, 600000, Plot.Type.URBAN));
        properties.add(new Plot("Herzliya, Ben Gurion 12", 180.0, 550000, Plot.Type.AGRICULTURAL));

        properties.add(new Apartment("Netanya, HaSharon 24", 90.0, 800000, 1, 5));
        properties.add(new Apartment("Petah Tikva, Rothschild 5", 120.0, 950000, 2,1));

        properties.add(new Villa("Jerusalem, Emek Refaim 33",53.2, 20000000, 2, 6));
        properties.add(new Villa("Eilat, Hayarkon 10",80.0, 150000, 0, 1));

        properties.add(new Vacation("Tiberias, Golan 8", 80.0, 600000, 2, 30));
        properties.add(new Vacation("Eilat, Coral Beach 14", 60.0, 550000, 3, 15));

        properties.add(new Commercial("Tel Aviv, Rothschild 3", 500.0, 5000000, 250.5));
        properties.add(new Commercial("Haifa, Haifa Bay 12", 600.0, 4500000,true,  12));

        properties.add(new Office("Ramat Gan, Arlozorov 18", 150.0, 1200000));
        properties.add(new Office("Ashdod, Adar 7", 180.0, 1500000));


        return properties;
    }
}

