import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Hero {

    Random random = new Random();
    private int nameId;
    int belief = random.nextInt(2);
    int power = random.nextInt(101);
    int magic = random.nextInt(101);
    private static List<Hero> instances = new ArrayList<Hero>();
    public Hero(){
        instances.add(this);
        nameId = instances.size();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Nom du héro : " + hero.nameId + "\n"
                            + "Stats : " + "\n"
                            + " Power : " + hero.power + "\n"
                            + " Magic : " + hero.magic + "\n");
    }

    public int getNameId(){
        return nameId;
    }
}