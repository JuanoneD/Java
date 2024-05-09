import java.util.Random;

public class World {

    Dynamic_array<Individual> list = new Dynamic_array<Individual>();
    Machine machine = new Machine();
    Random random = new Random();


    World(int numbersRandola, int numbersCollaborative, int numbersCheater, int numbersGrumpy, int numbersCopier, int numbersTolerant){

        Collaborative collaborative = null;
        Randola randola = null;
        Cheater cheater = null;
        Grumpy grumpy = null;
        Copier copier = null;
        Tolerant tolerant = null;


        for(int i = 0; i < numbersCollaborative ; i ++){

            collaborative = new Collaborative();
            list.add(collaborative);

        }

        for(int i = 0; i < numbersRandola; i ++){

            randola = new Randola();
            list.add(randola);
        }

        for(int i = 0; i < numbersCheater; i ++){

            cheater = new Cheater();
            list.add(cheater);

        }

        for(int i = 0; i < numbersGrumpy; i ++){

            grumpy = new Grumpy();
            list.add(grumpy);

        }

        for(int i = 0; i < numbersCopier; i ++){

            copier = new Copier();
            list.add(copier);

        }

        for (int i = 0; i < numbersTolerant; i ++){

            tolerant = new Tolerant();
            list.add(tolerant);

        }
        

    }

    public void playRound(){

        Individual player1 = null;
        Individual player2 = null;

        int number,numbersRandola = 0, numbersCollaborative = 0, numbersCheater = 0, numbersGrumpy = 0, numbersCopier = 0, numbersTolerant = 0;

        for(int i = 0; i < list.getSize()/2; i ++){

            player1 = list.getValue(random.nextInt(list.getSize()));
            player2 = list.getValue(random.nextInt(list.getSize()));

            machine.playMachine(player1, player1.play(), player2, player2.play());

        }

        for(int i = 0; i < list.getSize(); i ++){

            player1 = list.getValue(i);

            player1.remove1Coin();

            if(player1.getCoins() >= 20){

                player1.setCoins(10);

                player2 = player1.clone();
                list.add(player2); 

            }

            number = random.nextInt(100);

            if(number < 10){

                player1.remove1Coin();

            }


            if(player1.getCoins() <= 0){

                list.remove(i --);

            }else{

                if( player1.getclass() == 1){

                    numbersRandola ++;

                }else if(player1.getclass() == 2){

                    numbersCollaborative ++;

                }else if(player1.getclass() == 3){

                    numbersCheater ++;

                }else if(player1.getclass() == 4){

                    numbersGrumpy ++;

                }else if(player1.getclass() == 5){

                    numbersCopier ++;

                }else if (player1.getclass() == 6){

                    numbersTolerant ++;

                }

            }

        }

        System.out.println("Numero de Randolas == "+ numbersRandola + "| Numero de Colaborativos == "+ numbersCollaborative + "| Numero de trapaceiros == " + numbersCheater + "| Numeros de Rabugento " + numbersGrumpy + "| Numeros de copiadores " + numbersCopier + "| Numeros de tolerantes " + numbersTolerant);

    }
    
}
