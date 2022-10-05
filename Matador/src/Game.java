
import java.util.ArrayList;

public class Game {
    private FileIO fileIO = new FileIO();
    private TextUI textUI = new TextUI();
    private ArrayList<Player> players = new ArrayList();


    public void gameSetup() {
        //**********************
        // Load af spiller data
        // **********************
        ArrayList<String> data = fileIO.readGameData();
        if (data == null) {
            data = textUI.getUserInput("Skriv spillernavn. Tast Q for at quitte", 6);
        }
        this.createPlayers(data);
        players.get(0).buy(4000);
        fileIO.writeGameData(players);
    }

    private void createPlayers(ArrayList<String> data) {
        for (String s : data) {
            String[] values = s.replaceAll(" ","").split(","); //split arrayet så vi får adskildt de to værdier
            int balance;

            if (values.length > 1) {
                balance = Integer.parseInt(values[1]);
            } else {
                balance = Integer.parseInt("30000");
            }
            Player p = new Player(values[0], balance); // brug de to værdier til at lave en ny Player instans

            players.add(p);                            // tilføj Player instansen til array'et af spillere

        }
        //Det her er kun til test
        //players.get(0).buy(7000);
    }

    public void displayPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
