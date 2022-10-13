public class BankAccount {
    private int balance;


    public BankAccount(int startAmount){
        balance = startAmount;

    }
    //change balance, set balance
    public boolean doTransaction(int amount){
        //tjek om der er penge til rådighed - return false
        balance += amount;
        return true;
    }

    public int getBalance() {

        return balance;
    }

    @Override
    public String toString() {

        return ""+balance;
    }
}
