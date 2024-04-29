
import java.util.Random;

public class dia_29 {
    public static int[] Simplify(int[]array)
    {
        int value1;
        int value2;
        int j =0;
        int[] array_simplify = new int[array.length / 2];
        for(int i=0;i<array.length;i+=2){
            value1 = array[i]&240;
            value2 = array[i+1]>>4;
            array_simplify[j++] = value1+value2;
        }
        return array_simplify;
    }
    public static int[] desSimplify(int[]array){
        Random random = new Random();
        int []array_desSimplify=new int[array.length*2];
        int j=0;
        for(int i=0;i<array.length;i++){
            array_desSimplify[j++] = (array[i]&240)+ random.nextInt(15);
            array_desSimplify[j++] = ((array[i]&15)<<4)+random.nextInt(15);
        }
        return array_desSimplify;
    }
    public static void main(String[] args) {
        int[] array = new int[]{ 244, 232, 241, 123, 232,064,111,140};
        int[] simplifyArray = new int[array.length/2];
        simplifyArray = Simplify(array);
        System.out.println("array original:");
        for(int i=0;i<array.length;i++){
            System.out.print(" numero "+array[i]);
        }
        System.out.println("\narray simplificado:");
        array = desSimplify(simplifyArray);
        for(int i=0;i<array.length/2;i++){
            System.out.print(" numero "+simplifyArray[i]);
        }
        System.out.println("\narray dessimplicados:");
        for(int i=0;i<array.length;i++){
            System.out.print(" numero "+array[i]);
        }

    }
    
}
