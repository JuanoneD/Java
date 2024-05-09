import java.util.*;

public class main {

 public static void main(String[] args) {
    
    World world = new World(0,0,1,499,0,0);
    Scanner scan = new Scanner(System.in);

    boolean end = false;

    int rounds = 0;

    while (!end) {
        rounds ++;
        System.out.println(" Round: " + rounds);

        end = world.playRound();

        scan.nextLine();

        
    }


    scan.close();

 }

}
