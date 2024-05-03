import java.util.Scanner;

public class main {

    public static Node loginEmployer(ListNode list){

        Scanner scan = new Scanner(System.in);
        Employer user = null;
        Node userNode = null;
        String CPF,password;
        boolean loginSuccessful = false;

        while(true){

            System.out.println("Escreva o CPF");
            CPF = scan.nextLine();
            System.out.println("Escreva sua senha");
            password = scan.nextLine();

            for(int i = 0; i < list.getSize(); i ++){

                user = list.getEmployer(i);

                if(user.getCPF().equals(CPF) && user.getPassword().equals(password)){
                    
                    loginSuccessful = true;
                    System.out.println("Login bem sucdido");
                    userNode = list.getNode(i);
                    break;
                };
            }
            if(loginSuccessful){
               break; 
            }else{
                
                System.out.println("CPF ou senha incorretos");
            }    
        }
        

        return userNode;
    
        
    }

    public static Time defineTime(){

        Scanner scan = new Scanner(System.in);
        Time currentTime = null;

        String date;
        int minutes,hours;

        System.out.println("Escreva a data de hoje:");
        date = scan.nextLine();
        System.out.println("Escreva a hora e minutos separado por espaço");
        hours = scan.nextInt();
        minutes = scan.nextInt();
        currentTime = new Time(date, hours, minutes);
        
        System.out.println(date + " horas é " + hours + ":"+ minutes);

    
        
        return currentTime;
    }

    public static void addNewEmployer(ListNode list){

        Scanner scan = new Scanner(System.in);
        Employer newEmployer  = null;

        String name,CPF,birthdate,password;
        boolean admin;

        System.out.println("Escreva o nome do funcionario");
        name = scan.nextLine();
        System.out.println("Escreva o CPF do funcionario");
        CPF = scan.nextLine();
        System.out.println("Escreva o data de nascimento do funcionario");
        birthdate = scan.nextLine();
        System.out.println("Escreva a senha do funcionario");
        password = scan.nextLine();
        System.out.println("Escreva o true se for adm e false se não for");
        admin = scan.nextBoolean();
        
        newEmployer = new Employer(name,CPF,birthdate,password,admin);

        list.addEmployer(newEmployer);

    }

    public static void listEmployer(ListNode list){

        Employer employer = null;

        for(int i = 0;i < list.getSize(); i++){

            employer = list.getEmployer(i);
            System.out.println(" Nome: " + employer.getName());

        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Employer admin = new Employer("Admin", "Admin", "Admin", "Admin", true);
        ListNode list = new ListNode();


        Time currentTime = null;
        Employer user = null;
        OldPoint userPoint = null;
        Node userNode = null;
        PointDay userDay = null;

        int menu,point = 0;
        boolean exitMenu = false;
        
        list.addEmployer(admin);
        
        currentTime = defineTime();

        while(true){

            userNode = loginEmployer(list);
            user = userNode.getEmployer();
            userPoint = userNode.getPoint();
            
            exitMenu = false;

            while (!exitMenu) {
                System.out.println(" Escreva \n 0 == sair \n 1 == Bater Ponto ");

                if(user.getAdmin()){

                    System.out.println(" 2 == cadastrar novo empregado \n 3 == Listar empregados \n 4 == Horas trabalhadas \n 5 == Modifdificar Pontos \n 6 == Atualizar hora");
                }
                menu = scan.nextInt();

                switch (menu) {
                    case 0:

                        exitMenu = true;
                        break;
                    
                    case 1:

                        if((point&1) == 0){

                            userPoint.addEntrance(currentTime);
                            System.out.println("Ponto de entrada batido com sucesso");

                        }else{

                            userPoint.addExit(currentTime);
                            System.out.println("Ponto de saida batido com sucesso");

                        }
                        point ++;
                        break;
            
                    case 2:

                        if(!user.getAdmin()){
                            System.out.println("Valor invalido");
                            break;
                        }
                        
                        addNewEmployer(list);

                        break;

                    case 3:

                        if(!user.getAdmin()){
                            
                            System.out.println("Valor invalido");
                            break; 
                        }

                        listEmployer(list);

                    break;

                    case 4:

                        if(!user.getAdmin()){

                            System.out.println("Valor invalido");
                            break; 
                        }

                        break;

                    default:
                        System.out.println("Valor invalido");
                        break;
                }
            }

            System.out.println("Escreva 0 para sair e 1 para continuar");
            menu = scan.nextInt();

            if(menu == 0){
                break;
            }

        }
        
        




        
        



        scan.close();
    }
}
