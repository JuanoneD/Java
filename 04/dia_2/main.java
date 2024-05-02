import java.util.Scanner;

public class main {
    void printMenu(){
        System.out.println("Escreva o ");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String CPF,password;

        Employer admin = new Employer("Admin", "Admin", "Admin", "Admin", true);
        Employer user;
        ListNode list = new ListNode();

        list.addEmployer(admin);

        while(true){

            System.out.println("Escreva o CPF");
            CPF = scan.nextLine();
            System.out.println("Escreva sua senha");
            password = scan.nextLine();
            for(int i=0;i<list.getSize();i++){
                user = list.getEmployer(i);
                if(user.getCPF().equals(CPF));
            }



        }

    }
}
