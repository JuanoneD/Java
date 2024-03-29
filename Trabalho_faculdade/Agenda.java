import java.util.ArrayList;
public class Agenda {
    private ArrayList<Contacts> contactsNames = new ArrayList<Contacts>();

    public void addContact(Contacts name){
        contactsNames.add(name);
    }
    public void removeContact(Contacts name){
        contactsNames.remove(name);
    }
    public String searchContact(Contacts name){
        if (contactsNames.contains(name)){
            return name.getPhone();
        }else{
            return "Não encontrado";
        }
    }
}
