package Exer_8;

import java.util.Scanner;
public class Exer_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pizza calabresa = new Pizza("Calabresa", 50.2d);
        calabresa.addIngredients("Calabresa");
        calabresa.addIngredients("queijo");
        Pizza frango = new Pizza("Frango", 45.5d);
        frango.addIngredients("Frango");
        frango.addIngredients("queijo");
        Pizza portuguesa = new Pizza("Portuguesa", 30.3d);
        portuguesa.addIngredients("Ovo");
        portuguesa.addIngredients("queijo");
        Pizza marguerida = new Pizza("Marguerida", 40.23d);
        marguerida.addIngredients("Tomate");
        marguerida.addIngredients("queijo");
        Orders order = new Orders();
        int menu;
        boolean loopBreak=false;
        String name,address;
        while (true) {
            System.out.println(" Escreva \n 1 == Nova ordem \n 2 == Cancelar ordem \n 3 == Relatorio \n 0 == Sair");
            menu = scan.nextInt();
            scan.nextLine();
            switch (menu) {
                case 0:
                    loopBreak = true;
                    break;
                case 1:
                    System.out.print("Escreva o nome do cliente ");
                    name = scan.nextLine(); 
                    System.out.print("Escreva o endereço do cliente ");
                    address = scan.nextLine();
                    System.out.println("\nEscreva 1 para:");
                    calabresa.seePizza();
                    System.out.println("\nEscreva 2 para:");
                    frango.seePizza();
                    System.out.println("\nEscreva 3 para:");
                    portuguesa.seePizza();
                    System.out.println("\nEscreva 4 para:");
                    marguerida.seePizza();
                    System.out.println("");
                    menu = scan.nextInt();
                    scan.nextLine();
                    switch (menu) {
                        case 1:
                            order.addOrders(name,address,calabresa);
                            break;
                        case 2:
                            order.addOrders(name, address,frango);
                            break;
                        case 3:
                            order.addOrders(name, address,portuguesa);
                            break;
                        case 4:
                            order.addOrders(name, address, marguerida);
                            break;
                        default:
                            System.out.println("Sabor invalido");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Escreva o nome do cliente");
                    name = scan.nextLine();
                    order.removeOrders(name);
                    break;
                case 3:
                    System.out.println(order.reportOrder());
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            if(loopBreak){
                break;
            }
        }
        scan.close();
    }
}
