public class Cheater extends Individual{
    
    @Override
    public boolean play() {

        return false;

    }

    @Override
    public int getclass() {
        
        return 3;

    }

    @Override
    public Individual clone() {

        Individual clone = new Cheater();
        return clone;
        
    }
}
