import java.util.Scanner;
public class Exer_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int menu;
        float num1,num2;
        do{
            System.out.println("Escreva \n 1 == Somar\n 2 == Subtrair\n 3 == Multiplicação\n 4 == Divisão\n 0 == Sair ");
            menu = scan.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Escreva o primeiro numero");
                    num1 = scan.nextInt();
                    System.out.println("Escreva o segundo numero");
                    num2 = scan.nextInt();
                    System.out.println("o valor da soma é " + Cal.Sum(num1,num2));
                    break;
                case 2:
                    System.out.println("Escreva o primeiro numero");
                    num1 = scan.nextInt();
                    System.out.println("Escreva o segundo numero");
                    num2 = scan.nextInt();
                    System.out.println("o valor da subtração é "+ Cal.Sub(num1,num2));
                    break;
                case 3:
                    System.out.println("Escreva o primeiro numero");
                    num1 = scan.nextInt();
                    System.out.println("Escreva o segundo numero");
                    num2 = scan.nextInt();
                    System.out.println("valor da multiplicação é "+Cal.Mult(num1,num2));
                    break;
                case 4:
                    System.out.println("Escreva o primeiro numero");
                    num1 = scan.nextInt();
                    System.out.println("Escreva o segundo numero");
                    num2 = scan.nextInt();
                    System.out.println("valor da divisão é "+Cal.Div(num1,num2));
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
