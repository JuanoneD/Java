abstract public class Individual{

    int coins = 10;

    protected boolean putCoin(){

        this.coins --;

        return true;
    }

    public void addCoins(int coins){

        this.coins += coins;

    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void remove1Coint(){
        this.coins --;
    }

    abstract public Individual clone();

    abstract public boolean play();

    abstract public int getclass();
}
