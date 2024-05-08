import java.util.Random;

public class World {

    Dynamic_array<Individual> list = new Dynamic_array<Individual>();
    Machine machine = new Machine();
    Random random = new Random();


    World(int numbersCollaborative,int numbersRandola){

        Collaborative collaborative = null;
        Randola randola = null;


        while (numbersCollaborative != 0 && numbersRandola != 0) {
            
            if (numbersCollaborative-- != 0){

                collaborative = new Collaborative();
                list.add(collaborative);

            }

            if(numbersRandola -- != 0){

                randola = new Randola();
                list.add(randola);

            }
            
        }

    }

    public void playRound(){

        Individual player1 = null;
        Individual player2 = null;

        int number,numbersRandola = 0,numbersCollaborative = 0;

        for(int i = 0; i < 2 * list.getSize(); i ++){

            player1 = list.getValue(random.nextInt(list.getSize()));
            player2 = list.getValue(random.nextInt(list.getSize()));

            machine.playMachine(player1, player1.play(), player2, player2.play());

        }

        for(int i = 0; i < list.getSize(); i ++){

            player1 = list.getValue(i);

            player1.remove1Coint();

            if(player1.getCoins() >= 20){

                player2.setCoins(10);

                player2 = player1.clone();

                list.add(player2);

            }

            number = random.nextInt(100);

            if(number < 10){

                player1.remove1Coint();

            }


            if(player1.getCoins() <= 0){

                list.remove(i --);

            }else{

                if( player1.getclass() == 1){

                    numbersRandola ++;

                }else if(player1.getclass() == 2){

                    numbersCollaborative ++;
                }

            }

        }

    }
    

    


}
