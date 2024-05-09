public class Grumpy extends Individual {

    @Override
    public boolean play() {

        if (!lostCoins){

            return putCoin();

        }
        
        return false;
    }


    @Override
    public int getclass() {

        return 4;

    }



    @Override
    public Individual clone() {
        Individual clone = new Grumpy();
        return clone;
    }

    
}
