public class Copier extends Individual{

    @Override
    public int getclass() {
        
        return 5;
        
    }



    @Override
    public boolean play() {
        
        if(lastPlay){

            return putCoin();
        }

        return false;
    }


    @Override
    public Individual clone() {

        Individual clone = new Copier();

        return clone;

    }


    
}
