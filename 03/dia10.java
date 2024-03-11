import java.util.Scanner;
public class dia10 {
    public static void main(String[] args){
        // //Exer 1:
        // int [] list = new int[5];
        // int media = 0;
        // Scanner scan = new Scanner(System.in);
        // for(int i = 0;i < list.length; ++ i){
        //     System.out.println("Digite o numero  " + (i + 1)+" ");
        //     list[i] = scan.nextInt();
        //     media += list [i];
        // }
        // media = media / list.length;
        // for(int i = 0;i < list.length; ++ i ){
        //     if (list[i] < media){
        //         System.out.println(" o numero " + list[i] + "  é menor que a media ");
        //     }else if(list[i] > media){
        //         System.out.println("o numero " + list[i] + "  é maior que a media ");
        //     }else{
        //         System.out.println("o numero "+ list[i] + "  é igual a media");
        //     }
        // }
        // scan.close();
        // //Fim Exer1;
        //Exer 3:
        int listLength = 5;
        int [] list = new int[listLength];
        int [] list1 = new int[listLength];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < list.length; ++ i){
            System.out.println("escreva o valor do item n^" + (i + 1));
            list[i] = scan.nextInt();
            list1[i] = list[i] * 2;
        }
        for(int i = 0;i < list.length; ++ i ){
            System.out.print(list[i]+" ");
        }
            System.out.println("");
        for(int i = 0;i < list.length; ++ i ){
            System.out.print(list1[i]+" 1");
        }
        scan.close();
        //Fim Exer 3;
        
    }

}
