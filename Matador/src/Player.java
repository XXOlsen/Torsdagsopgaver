public class Player {
    private String name;
    private BankAccount account;
    private int startPosition = 1;
    private int currentPosition = startPosition;


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

    public int getBalance() {
        return account.getBalance();
    }


    @Override
    public String toString() {
        return name + ":" + account;

    }

    public void buy(int cost) {
        //add deed to deedList
        this.account.doTransaction(-cost);
    }

    public int updatePos(int sum) {

        currentPosition = currentPosition + sum;//52
        if (currentPosition > 40) {
            //this.recive(board.getField(1).getIncome());
            currentPosition -= 40;//currentPosition = currentPosition -40
        }
        return currentPosition;
    }

    public int getPosition() {

        return currentPosition;
    }

    public void pay(int amount) {

        this.account.doTransaction(-amount);
    }

    public void pay (int amount, Player p){
        this.account.doTransaction(-amount);
        p.account.doTransaction(amount);
    }
}