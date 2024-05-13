import java.util.*;

public class Main {

 public static void main(String[] args) {
    
    int numbersRandola = 999999;
    int numbersCollaborative = 999999;
    int numbersCheater = 999999;
    int numbersGrumpy = 999999;
    int numbersCopier = 9999999;
    int numbersTolerant = 999999;

    
    World world = new World(numbersRandola,numbersCollaborative,numbersCheater,numbersGrumpy,numbersCopier,numbersTolerant);
    Scanner scan = new Scanner(System.in);

    boolean end = false;

    int rounds = 0;

    while (!end) {
        rounds ++;
        System.out.println(" Round: " + rounds);

        end = world.playRound();

        
    }


    scan.close();

 }

}
