import java.util.Scanner;
public class Exer_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loopbreak = false;
        int menu;
        String name,phone;
        Contacts contact1 = new Contacts("","");
        Contacts contact2 = new Contacts("","");
        Agenda agenda = new Agenda();
        while (true) {
            System.out.println(" Escreva\n 1 == Adicionar Contato\n 2 == Remover contato\n 3 == Pesquisar contato \n 0 == Sair ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu) {
                case 0:
                    loopbreak = true;
                    break;
                case 1:
                    System.out.println("Escreva o nome");
                    name = scan.nextLine();
                    System.out.println("Escreva o  telefone");
                    phone = scan.nextLine();
                    contact1 = new Contacts(name, phone);
                    System.out.println("Escreva o nome");
                    name = scan.nextLine();
                    System.out.println("Escreva o  telefone");
                    phone = scan.nextLine();
                    contact2 = new Contacts(name, phone);
                    agenda.addContact(contact1);
                    agenda.addContact(contact2);
                    break;
                case 2:
                    System.out.println("Escreva o nome para ser removido");
                    name = scan.nextLine();
                    if (contact1.getName().equals(name)){
                        agenda.removeContact(contact1);
                    }else if(contact2.getName().equals(name)){
                        agenda.removeContact(contact2);
                    }else{
                        System.out.println("Nome não encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Escreva o nome para ser procurado");
                    name = scan.nextLine();
                    if (contact1.getName().equals(name)){
                        System.out.println(agenda.searchContact(contact1));
                    }else if(contact2.getName().equals(name)){
                        System.out.println(agenda.searchContact(contact2));
                    }else{
                        System.out.println("Nome não encontrado");
                    }
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            if(loopbreak){
                break;
            }
        }
        scan.close();
    }
}
