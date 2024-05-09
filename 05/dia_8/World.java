import java.util.Random;

public class World {

    Dynamic_array<Individual> list = new Dynamic_array<Individual>();
    Machine machine = new Machine();
    Random random = new Random();


    World(int numbersRandola, int numbersCollaborative, int numbersCheater, int numbersGrumpy, int numbersCopier, int numbersTolerant){

        Individual individual = null;


        while (numbersRandola > 0 || numbersCollaborative > 0 || numbersCheater > 0 || numbersGrumpy > 0 || numbersCopier > 0 || numbersTolerant > 0 ) {
            
            if( numbersRandola -- > 0 ){

                individual = new Randola();
                list.add(individual);
            }

            if( numbersCollaborative -- > 0 ){

                individual = new Collaborative();
                list.add(individual);

            }

            if ( numbersCheater -- > 0 ){

                individual = new Cheater();
                list.add(individual);

            }

            if ( numbersGrumpy -- > 0 ){

                individual = new Grumpy();
                list.add(individual);

            }

            if ( numbersCopier -- > 0 ){

                individual = new Copier();
                list.add(individual);

            }

            if (numbersTolerant -- > 0 ){

                individual = new Tolerant();
                list.add(individual);
            }

        }

    }

    public void playRound(){

        Individual player1 = null;
        Individual player2 = null;
        int index1, index2;

        int number,numbersRandola = 0, numbersCollaborative = 0, numbersCheater = 0, numbersGrumpy = 0, numbersCopier = 0, numbersTolerant = 0;

        for(int i = 0; i < list.getSize()/2; i ++){


            do{

                index1 = random.nextInt(list.getSize());
                index2 = random.nextInt(list.getSize());

            }  while (index1 == index2);

            
            player1 = list.getValue(index1);
            player2 = list.getValue(index2);

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
