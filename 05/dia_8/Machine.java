public class Machine {
    
    public void playMachine(Individual user1,boolean coin1,Individual user2,boolean coin2){


        if(coin1 && coin2){

            user1.addCoins(2);
            user2.addCoins(2);

            return;

        }

        if(!coin1 && coin2){

            user1.addCoins(4);


        }else{

            user2.addCoins(4);

        }

    }
}
