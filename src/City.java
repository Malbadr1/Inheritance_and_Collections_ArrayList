import java.util.ArrayList;

public class City {

    private String name;
    private int citizensNum;

    public City(String name, int citizensNum) {
        this.name = name;
        this.citizensNum = citizensNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCitizensNum() {
        return citizensNum;
    }

    public void setCitizensNum(int citizensNum) {
        this.citizensNum = citizensNum;
    }

    @Override
    public String toString() {
        return " The City is : " +
                "name:" + name + '\'' +
                ", citizensNum:" + citizensNum;
    }

    public static void main(String[] args) {
        ArrayList<City> arraylist = new ArrayList<>();
        arraylist.add(new City("Vienna", 1897000));
        arraylist.add(new City("Salzburg", 152367));
        arraylist.add(new City("Graz", 443066));

    }
}
