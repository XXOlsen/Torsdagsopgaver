import java.util.ArrayList;

public class Player {
    private String name;
    private BankAccount account;
    private int startPosition = 1;
    private int currentPosition = startPosition;
    /*TODO: tilføj en liste til at holde på det spilleren har købt (jvf. Task 1.c)*/

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

    /*TODO: udvid metoden sådan at den tager en instans af type Property. Denne instans skal lægges i deeds */
    public void buy(int cost) {
        //add deed to deeds

        this.account.doTransaction(-cost);
    }

    public int updatePos(int sum) {

        currentPosition = currentPosition + sum;//52
        if (currentPosition > 40) {

            //  Field startField = board.getField(1);
            //  this.receive(startField);

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

    public void pay(int amount, Player p) {
        this.account.doTransaction(-amount);
        p.account.doTransaction(amount);
    }

    public void recieve(int amount) {
        this.account.doTransaction(amount);
    }

    //1.C Dernæst skal du finde værdien af spillerens grunde. Det kan vi ikke endnu,
    //fordi vi ikke ved hvilke grunde hver enkelt spiller ejer.
    //Derfor skal du lave et felt ArrayList deeds i klassen Player og du skal lave
    //en metode addDeed(Property p) også i klassen Player. I addDeed-metoden skal du
    //tilføje den Property, der kommer ind som parameter, til listen af deeds.

    public ArrayList<Property> deeds = new ArrayList<>(); //det er en type af Property og ikke en String.

    public void addDeed(Property p) {
        deeds.add(p);
    }

    //1.E Nu kan du lave en metode i Player, som kan give dig værdien af alle spillerens grunde.
    //Den kan fx hedde getPropertyValues(). Metoden løber alle spillerens deeds igennem
    //og lægger cost sammen og returnerer summen.

    public int getPropertyValues() {
        int sum = 0;
        for (int i = 0; i < deeds.size(); i++) {
            sum += deeds.get(i).cost;
        }
        return sum;
    }

}