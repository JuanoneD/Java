import java.util.Scanner;

public class Exer_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product mall = new Product();
        int menu,stock;
        boolean breakloop=false;
        String name,code;
        Double price;
        while(true){
            System.out.println(" Escreva \n 1 == Adicionar produto \n 2 == Remover produto \n 3 == Atulizar estoque \n 4 == Atualizar informaçoes de um produto \n 5 == Gerar relatorio \n 0 == Sair");
            menu = scan.nextInt();
            scan.nextLine();
            switch (menu) {
                case 0:
                    breakloop = true;
                    break;
                case 1:
                    System.out.println("Escreva o nome do produto");
                    name = scan.nextLine();
                    System.out.println("Escreva o codigo do produto");
                    code = scan.nextLine();
                    System.out.println("Escreva a quantida do produto");
                    stock = scan.nextInt();
                    System.out.println("Escreva o preço do produto");
                    price = scan.nextDouble();
                    scan.nextLine();
                    mall.addProduct(name, code, stock, price);
                    break;
                case 2:
                    System.out.println("Escreva o nome do produto");
                    name = scan.nextLine();
                    mall.removeProduct(name);
                    break;
                case 3:
                    System.out.println("Escreva o nome do produto");
                    name = scan.nextLine();
                    System.out.println("Escreva qual a quantidade de estoque");
                    stock = scan.nextInt();
                    scan.nextLine();
                    mall.updateStock(name, stock);
                    break;
                case 4:
                    System.out.println("Escreva o nome do produto");
                    name = scan.nextLine();
                    System.out.println("Escreva o codigo do produto");
                    code = scan.nextLine();
                    System.out.println("Escreva a quantida do produto");
                    stock = scan.nextInt();
                    System.out.println("Escreva o preço do produto");
                    price = scan.nextDouble();
                    scan.nextLine();
                    mall.updateProduct(name, code, stock, price);
                    break;
                case 5:
                    mall.reportProducts();
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
            if (breakloop){
                break;
            }
        }
        scan.close();
    }
}
