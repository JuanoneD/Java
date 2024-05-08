public class Collaborative extends Individual{


    @Override
    public boolean play() {
        
        return putCoin();

    }

    @Override
    public Individual clone() {

        Individual clone = new Collaborative();

        return clone;

    }

    @Override
    public int getclass() {

        return 2;
        
    }

}
