public class Machine {
    
    public void playMachine(Individual user1,boolean coin1,Individual user2,boolean coin2){


        if(coin1 && coin2){

            user1.addCoins(2);
            user2.addCoins(2);
            user1.setLastPlay(true);
            user2.setLastPlay(true);

            return;

        }

        if(!coin1 && coin2){

            user1.addCoins(4);
            user2.setLostCoins(true);

            user2.setLastPlay(false);
            user1.setLastPlay(true);

            user2.addMistake();
            
            return;
        }

        if(coin1 && !coin2){

            user2.addCoins(4);
            user1.setLostCoins(true);

            user2.setLastPlay(true);
            user1.setLastPlay(false);

            user1.addMistake();

            return;

        }

        if(!coin1 && !coin2){

            user1.setLastPlay(false);
            user2.setLastPlay(false);

            return;

        }

        

    }
}
