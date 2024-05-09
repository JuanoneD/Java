import java.util.*;

public class main {

 public static void main(String[] args) {
    
    World world = new World(0,0,1,499,0,50);
    Scanner scan = new Scanner(System.in);

    int menu = 1;

    while (menu != 0) {

        world.playRound();

        menu = scan.nextInt();
        
    }

    scan.close();

 }

}
