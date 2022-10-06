public class Field {
    private String label;
    private int ID;
    private int cost;
    private int income;
    private int seriesID;
    private Player owner;

    public Field (String label, int ID, int cost, int income, int seriesID, Player owner){
        this.label = label;
        this.ID = ID;
        this.cost = cost;
        this.income = income;
        this.seriesID = seriesID;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return ID + " : " + label;
    }

    public void onland(){
        System.out.println("Du er landet på" + ID + "" + label);
    }
}
