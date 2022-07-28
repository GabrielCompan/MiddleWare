import java.util.List;


public class HeroDao {

	public List<Hero> getAllHeroes();
	public Hero getHero(int nameId);
	public void createHero(Hero hero);
	public void updateHero(Hero hero);
	public void deleteHero(Hero hero);
	
}