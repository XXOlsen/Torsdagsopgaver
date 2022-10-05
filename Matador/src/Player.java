

public class Player {
    private String name;
    private BankAccount account;

    public Player(String name, int amount) {
        this.name = name;
        account = new BankAccount(amount);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAmount() {

        return account.getBalance();
    }

    @Override
    public String toString() {
        return name + ":" + account.getBalance();
    }

    public void buy(int cost) {
        this.account.doTransaction(-cost);
    }
}