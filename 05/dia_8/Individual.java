abstract public class Individual{

    protected int coins = 10;
    protected boolean lostCoins = false;
    protected boolean lastPlay = true;
    protected int mistaken = 0;

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

    public void remove1Coin(){

        this.coins --;

    }

    public void setLostCoins(boolean lostCoins) {

        this.lostCoins = lostCoins;

    }

    public void setLastPlay(boolean lastPlay) {

        this.lastPlay = lastPlay;

    }

    public void  addMistake(){

        mistaken ++;

    }

    public void setMistaken(int mistaken) {

        this.mistaken = mistaken;

    }

    abstract public Individual clone();

    abstract public boolean play();

    abstract public int getclass();
}
