
import java.util.Scanner;
public class Exer_3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int menu;
        String name,accountNum;
        Float balance;
        Bank user = new Bank("","",0);
        while(true){
            System.out.println("Escreva \n 1 == Criar conta \n 0 == Sair");
            menu = scan.nextInt();
            scan.nextLine();
            if (menu == 1){
                System.out.println("Escreva o numero da conta");
                accountNum = scan.nextLine();
                System.out.println("Escreva nome do titular da conta");
                name = scan.nextLine();
                System.out.println("Escreva o saldo da conta");
                balance = scan.nextFloat();
                user = new Bank(accountNum,name,balance);
                while(true){
                    System.out.println("Escreva \n 1 == Depositar \n 2 == Sacar\n 3 == Ver saldo \n 0 == Sair");
                    menu = scan.nextInt();
                    scan.nextLine();
                    if(menu == 1){
                        System.out.println("Escreva o valor para adicionar");
                        balance = scan.nextFloat();
                        user.deposit(balance);
                    }else if(menu == 2){
                        System.out.println("Escreva o valor para sacar");
                        balance = scan.nextFloat();
                        user.withdraw(balance);
                    }else if (menu == 3){
                        System.out.println("O seu saldo é " + user.GetBalance());
                    }else if(menu == 0){
                        break;
                    }else{
                        System.out.println("Valor invalido");
                    }
                }   
            }else if (menu == 0){
                break;
            }else{
                System.out.println("valor invalido");
            }
        }
        scan.close();
    }
}
