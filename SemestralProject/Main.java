import java.util.*;


public class Main {

    public static void startGame(){
        int numberOfHero = 0;

        System.out.println("Lord of the ring");
        Scanner inputUserOjt = new Scanner(System.in);
        Scanner inputUserTeamNameObj = new Scanner(System.in);

        System.out.println("Firstly choose your team's name");
        String inputUserTeamName = inputUserTeamNameObj.nextLine();
        System.out.println("So, now your team is called " + inputUserTeamName);

        System.out.println("Choose your action (Capture or Advance)");
        String inputUser = inputUserOjt.nextLine();

        if (inputUser.equals("Capture") || inputUser.equals("capture")){
            System.out.println("You choose to capture a hero !");
            Hero hero = new Hero();
            System.out.println("Congratulation, you have a new hero on your team !"+"\n"
                    + "Nom du héro : " + hero.getNameId() + "\n"
                    + "Stats : " + "\n"
                    + " Power : " + hero.power + "\n"
                    + " Magic : " + hero.magic + "\n");
        }
        if (inputUser.equals("Advance") || inputUser.equals("advance")){
            System.out.println("You choose to advance !");
            if(numberOfHero == 0){
                System.out.println("You loose, you don't have any hero to figth with you");
                System.exit(0);
            }
            else {

            }
        }
    }

    public static void main(String[] args){
        Main.startGame();
    }
}
