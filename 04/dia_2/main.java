import java.util.Scanner;

public class main {
    public static Employer loginEmployer(ListNode list){
        Scanner scan = new Scanner(System.in);
        Employer user = null;
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
                    System.out.println("Login bem sucedido");
                    break;
                };
            }

            if(!loginSuccessful){

                System.out.println("CPF ou senha incorretos");
            }else{

                scan.close();
                return user;
            }
        }
    }
    public static Time defineTime(){
        Scanner scan = new Scanner(System.in);
        Time currentTime = null;

        String date;
        int minutes,hours;

        System.out.println("Escreva a data de hoje:");
        date = scan.nextLine();
        System.out.println("Escreva a hora");
        hours = Integer.parseInt(scan.nextLine());
        System.out.println("Escreva os minutos");
        minutes = Integer.parseInt(scan.nextLine());
        currentTime = new Time(date, hours, minutes);
        
        System.out.println(date + " horas é " + hours + ":"+ minutes);
        scan.close();
        return currentTime;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Employer admin = new Employer("Admin", "Admin", "Admin", "Admin", true);
        ListNode list = new ListNode();
        Time currentTime = null;
        Employer user;
        
        list.addEmployer(admin);

        currentTime = defineTime();
        user = loginEmployer(list);

        
        



        scan.close();
    }
}
