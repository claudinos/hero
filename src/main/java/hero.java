import java.util.ArrayList;

public class hero {
    private String heroName;
    private int heroAge;
    private String heroPower;
    private String heroWeakness;
    private int heroId;
    private static ArrayList<hero> instance=new ArrayList<hero>();
    public hero(String name, int age, String power, String weakness) {
        heroName = name;
        heroAge = age;
        heroPower = power;
        heroWeakness = weakness;
        instance.add(this);
        heroId=instance.size();
    }

    public String getheroName() {
        return heroName;
    }

    public int getheroAge() {
        return heroAge;
    }

    public String getheroPower() {
        return heroPower;
    }

    public String getheroWeakness() {
        return heroWeakness;
    }

    public int getheroId() {
        return heroId;
    }

}
