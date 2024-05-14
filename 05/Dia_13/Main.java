import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


public class Main {


    public static void main(String[] args) {

        Dynamic_array<ArrayList<Integer>> map = new Dynamic_array<>(256);
        ArrayList<Integer> array;

        Hash hash = new Hash(16);
        Queue<Integer> queue = new Queue<>();


        String[] values;
        String line;
        int index,i,j;
        boolean cycle = false;
        Integer valueInteger;
        

        try{ 
            
            FileReader arq = new FileReader("desafio4.txt");
            BufferedReader readArq = new BufferedReader(arq);

            line = readArq.readLine();

            while (line != null) {

                line = line.replace(" ", "");
                values = line.split(">");

                index = Integer.parseInt(values[0]);

                values = 
                    values.length < 2 ? new String[0]
                    : values[1].split(",");

                array = new ArrayList<>();

                for(String value : values){
                    if (value.equals(""))
                        continue;
                    
                    array.add(Integer.parseInt(value));
                }

                map.add(array, index);

                line = readArq.readLine();

            }

        readArq.close();

        }catch (Exception e){
            e.printStackTrace();
        };


        i = 0;

        while(!cycle){

            hash.add(i);
            array = map.getvalue(i);


            if(array != null){ 

                for( j = 0; j < array.size(); j ++){

                    valueInteger = array.get(j);

                    if(hash.contains(valueInteger)){

                        cycle = true;
            
                    }

                    queue.enqueue(valueInteger);

                }
            }

            if( queue.getSize() == 0 ){

                break;

            }else{

                i = queue.dequeue();

                if(hash.contains(i)){

                    cycle = true;
        
                }

            }
        }

        if( cycle ){

            System.out.println("\nAchou o ciclo");

        }else{

            System.out.println("\nNão achou o ciclo");

        }
        
    }

    

    
}
