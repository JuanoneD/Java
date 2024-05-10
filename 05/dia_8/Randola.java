import java.util.Random;

public class Randola extends Individual {

    Random random = new Random(System.currentTimeMillis());
    
    @Override
    public boolean play(){

        if(random.nextInt(2) == 1){

            return putCoin();

        }else{

            return false;

        }
         
    }

    @Override
    public Individual clone() {

        Individual clone = new Randola();

        return clone;

    }

    @Override
    public int getclass() {
        
        return 1;
    }

}
