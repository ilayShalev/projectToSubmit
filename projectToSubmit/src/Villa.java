public class Villa extends Residential {
    private int levels = 1;


    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public void setLevels(int levels) {
        if (levels < 1) {
            throw new IllegalArgumentException("levels must not be less then 1.");
        }
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "levels=" + levels +
                '}' + ", " + super.toString();
    }
}
