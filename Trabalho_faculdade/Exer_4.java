import java.util.Scanner;
public class Exer_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu,score,level;
        boolean breakloop = false;
        String name;
        System.out.println("Escreva o nome do jogador ");
        name = scan.nextLine();
        System.out.println("Escreva a pontuação ");
        score = scan.nextInt();
        System.out.println("Escreva o nivel do jogador ");
        level = scan.nextInt();
        Players player = new Players(name, score, level);
        while(true){
            System.out.println("Escreva \n 1 == Ver nome \n 2 == Ver pontuação \n 3 == Ver level \n 4 == Alterar pontuação \n 5 == Alterar level \n 0 == Sair ");
            menu = scan.nextInt();
            switch(menu){
                case 0:
                    breakloop = true;
                    break;
                case 1:
                    System.out.println("O nome é  " + player.GetName());
                    break;
                case 2:
                    System.out.println("Sua pontuação é " + player.GetScore());
                    break;
                case 3:
                    System.out.println("Seu level é " + player.GetLevel());
                    break;
                case 4:
                    System.out.println("Escreva a sua nova pontuação: ");
                    score = scan.nextInt();
                    player.SetScore(score);
                    break;
                case 5:
                    System.out.println("Escreva o seu novo nivel: ");
                    level = scan.nextInt();
                    player.Setlevel(level);
                    break;
                default:
                    System.out.println("Valor invalido");
            }
            if (breakloop) break;
        }
        scan.close();
    }
}
