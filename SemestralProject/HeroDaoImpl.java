import java.util.ArrayList;
import java.util.List;


public class HeroDaoImpl implements HeroDao {

   List<Hero> heroes;

   public HeroDaoImpl(){
	  
   }

   @Override
   public List<Hero> getAllHeroes() {
      return heroes;
   }

   @Override
   public Hero getHero(int nameId) {
      return heroes.get(nameId);
   }

   @Override
   public void createHero(Hero hero) {
	   heroes.add(hero);
	   System.out.println("Hero: Roll No " + hero.getRollNo() + ", created in the database");
   }

   @Override
   public void updateHero(Hero hero) {
	  heroes.get(hero.getNameId()).setName(hero.getName());
      System.out.println("Hero: Roll No " + hero.getRollNo() + ", updated in the database");
   }

   @Override
   public void deleteHero(Hero hero) {
	  heroes.remove(hero.getNameId());
      System.out.println("Hero: Roll No " + hero.getRollNo() + ", deleted from database");
   }
}