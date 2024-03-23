import java.util.Scanner;
public class Exer_2{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int menu;
        String title,writer,year;
        Books book =  new Books("","","");
        do{
            System.out.println("Escreva \n 1 == Cadastrar livro \n 2 == Ver informações do livro \n 0 == Sair ");
            menu = scan.nextInt();
            scan.nextLine();
            switch(menu){
                case 1:
                    System.out.println("Escreva o titulo do livro");
                    title = scan.nextLine();
                    System.out.println("Escreva o autor do livro");
                    writer = scan.nextLine();
                    System.out.println("Escreva ano do lançamento do livro");
                    year = scan.nextLine();
                    book =  new Books(title,writer,year);
                    break;
                case 2:
                    System.out.println(book.GetInfo());
                    break;
                case 0:
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }while(menu != 0);
        scan.close();

    }
}
