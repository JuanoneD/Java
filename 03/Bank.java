
public class Bank {
    String numberaccount;
    String Name;
    float balance;
    Bank(String numberaccount,String Name,float balance){
        this.numberaccount = numberaccount;
        this.Name = Name;
        this.balance = balance;
    }
    public void deposit(float value){
        this.balance += value;
    }
    public void withdraw(float value){
        if (value < this.balance){
            this.balance -= value; 
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public float GetBalance(){
        return this.balance;
    }
}
