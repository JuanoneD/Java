import java.util.*;

public class main {

 public static void main(String[] args) {
    
    World world = new World(0,0,1,499,0,0);
    Scanner scan = new Scanner(System.in);

    int menu = 1;
    int rounds = 0;

    while (menu != 0) {

        world.playRound();

        menu = scan.nextInt();

        rounds ++;
        System.out.println(" Round: " + rounds);
    }


    scan.close();

 }

}
