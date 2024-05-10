import java.util.*;

public class Main {

 public static void main(String[] args) {
    
    int numbersRandola = 0;
    int numbersCollaborative = 0;
    int numbersCheater = 0;
    int numbersGrumpy = 0;
    int numbersCopier = 0;
    int numbersTolerant = 99;

    
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
