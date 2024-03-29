package Exer_5;
import java.util.Scanner;
public class Exer_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String brand,model,plate;
        int year,speed,menu;
        boolean loopBreak = false;
        System.out.println("Escreva a marca do carro: ");
        brand = scan.nextLine();
        System.out.println("Escreva o modelo: ");
        model = scan.nextLine();
        System.out.println("Escreva a placa do carro: ");
        plate = scan.nextLine();
        System.out.println("Escreva o ano do carro: ");
        year = scan.nextInt();
        System.out.println("Escreva a velociade do carro");
        speed = scan.nextInt();
        Car car = new Car(brand, model, year, plate, speed);
        while(true){
            System.out.println("Escreva \n 1 == Informações do carro\n 2 == Velocidade do carro\n 3 == Acelerar \n 4 == Frear \n 0 == Sair ");
            menu = scan.nextInt();
            switch(menu){
                case 0:
                    loopBreak = true;
                    break;
                case 1:
                    System.out.println(car.Getinfo());
                    break;
                case 2:
                    System.out.println("A velocidade é "+ car.GetSpeed());
                    break;
                case 3:
                    car.SpeedUp();
                    break;
                case 4:
                    car.SpeedDown();
                    break;
                default:
                    System.out.println("valor invalido");
                    break;
            }
            if (loopBreak) break;
        }
        scan.close();
    }
    
}
