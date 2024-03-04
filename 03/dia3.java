import java.util.Scanner;
public class dia3{
    public static void main(String[] args){
        // // Exer 1;
        // int number;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Digite um numero");
        // number = scan.nextInt();
        // if (number > 10){
        //     System.out.println("maior que 10");
        // }else{
        //     System.out.println("menor ou igual a 10");
        // }
        // scan.close();
        // //Fim Exer1;
        // // Exer 2;
        // int number1,number2;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Digite o primeiro numero");
        // number1 = scan.nextInt();
        // System.out.println("Digite o segundo numero");
        // number2 = scan.nextInt();
        // if (number1 > number2){
        //     System.out.println("o maior numero é "+ number1 +" e a soma é "+(number1 + number2));
        // }else{
        //     System.out.println("o maior numero é "+ number2 +" e a soma é "+(number1 + number2));
        // }
        // scan.close();
        // //fim Exer2;
        // Exer3
        // int number1,number2;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("escreva o valor do primeiro numero");
        // number1 = scan.nextInt();
        // System.out.println("escreva o valor do segundo numero");
        // number2 = scan.nextInt();
        // if (number1 > number2){
        //     System.out.println("o "+ number1 +" é o maior");
        // }else if (number2 > number1){
        //     System.out.println("o " + number2 + "é maior");
        // }else{
        //     System.out.println("Valores invalidos");
        // }
        // scan.close();
        // //fim Exer2;
        // // Exer 4;
        // Scanner scan = new Scanner(System.in);
        // int number1,number2;
        // System.out.println("escreva o valor do primeiro numero");
        // number1 = scan.nextInt();
        // System.out.println("escreva o valor do segundo numero");
        // number2 = scan.nextInt();
        // System.out.println(" Valor da Soma: "+(number1 + number2)+ "\n Valor da Subtração: "+ (number1 - number2)+"\n Valor da multiplicação" + (number1 * number2)+"\n Valor da Divisão: "+(number1 / number2));
        // scan.close();
        // // fim exer 4;
        // // Exer 5;
        // Scanner scan = new Scanner(System.in);
        // int number1,number2,aux;
        // System.out.println("escreva o valor do primeiro numero");
        // number1 = scan.nextInt();
        // System.out.println("escreva o segundo valor");
        // number2 = scan.nextInt();
        // System.out.println("valor original: \n valor 1 num: "+ number1 + "\n valor do 2 num: " + number2);
        // aux = number1;
        // number1 = number2;
        // number2 = aux;
        // System.out.println("valor alterado: \n valor do 1 num: "+ number1 + "\n valor do 2 num: " + number2);
        // scan.close();
        // // Exer 5 fim;
        // Exer 6:
        // Scanner scan = new Scanner(System.in);
        // int celsius;
        // System.out.println("escreva o valor em celsius");
        // celsius = scan.nextInt();
        // System.out.println("o valor em fahrenhit é " + ((9*celsius + 160)/5));
        // scan.close();
        // //fim Exer 6;
        // // Exer 10:
        // Scanner scan = new Scanner(System.in);
        // String word;
        // System.out.println("escreva um numero de 1 a 5 por extenço");
        // word = scan.nextLine();
        // switch (word) {
        //     case "um":
        //         System.out.println("voce escreveu 1");
        //         break;
        //     case "dois":
        //         System.out.println("voce escreveu 2");
        //         break;
        //     case "tres":
        //         System.out.println("voce escreve 3");
        //         break;
        //     case "quatro":
        //         System.out.println("voce escreveu 4");
        //         break;
        //     case "cinco":
        //         System.out.println("voce escreveu 5");
        //         break;
        //     default:
        //         System.out.println("valor invalido");
        //         break;
        // }
        // scan.close();
        // //fim exer 10
        // Exer 11
        Scanner scan = new Scanner(System.in);
        int[] numbers;
        int i;
        numbers = new int[3];
        for (i = 0;i < 3 ; i ++){
            System.out.println("escreva o valor do num " + (i + 1));
            numbers[i] = scan.nextInt();
        };

        scan.close();

        for(i = 0; i < numbers.length - 1; i ++){
            for(int j = 0;j < numbers.length - 1; j++ ){
                if (numbers[j] > numbers[j+1]){
                    int aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux; 
                }
            }
        }
        for (i = 0;i < 3;i ++){
            System.out.println("valor do num "+ (i+1)+ " é " + numbers[i]);
        };   
    }
}