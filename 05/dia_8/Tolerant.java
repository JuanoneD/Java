public class Tolerant extends Individual {

    private int playTime = 0;

    @Override
    public boolean play() {
        
        if (mistaken > 3){

            playTime = 3;

            mistaken = 0;

        }

        if(playTime-- > 0){

            return false;
        }

        if(mistaken <= 3){

            return putCoin();

        }

        return false;
    }

    @Override
    public Individual clone() {

        Individual clone = new Tolerant();

        return clone;
    }

    @Override
    public int getclass() {
        
        return 6;

    }
    
}
