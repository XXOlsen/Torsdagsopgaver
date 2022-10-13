public class Property extends Field{
    protected int seriesID;
    protected Player owner;
    protected String option;

    boolean monpoly = false; // bruges i Plot.onLand() til at bestemme om der skal vises tilbud om at bygge

    public Property(int id, String label, int cost, int income, int serieID) {
        super(id, label, cost, income);
        this.seriesID = serieID;
    }


    @Override
    public String toString() {
        String s = super.toString();
        return s+" (serieID:"+this.seriesID+")";
    }
    @Override
    public String onLand(Player p){
        String s = super.onLand(p);
        if (this.owner == null){
            option = "buy";
            s += "\n Vil du købe "+this.getLabel()+" for "+this.cost+"kr. Din saldo nu:" +p.getBalance() + "\n Tast J for ja N for nej.";
        }else{
            option = "payRent";
            s += "\n "+this.owner+" ejer allerede "+this.getLabel();
            s += "\n Du skal betale "+this.getIncome()+" i husleje. Tast J for at acceptere:";


        }
        return s;
    }
    @Override
    protected String onAccept(Player p){
        String s="";

        if(option.equals("buy")){
            s = this.getLabel()+" er din!";

            p.buy(this.cost);

            //1.D Vi skal dernæst sikre, at når en spiller køber en Property,
            //bliver denne lagt i spillerens liste af Properties.
            //Derfor skal I ind i koden der hvor spilleren vælger at købe en grund,
            //betaler for den og bliver sat som ejer af grunden (det lavede vi i onsdags).
            //Her skal du tilføje en linje, der kalder spillerens addDeed() med den købte Property.
            p.addDeed(this);

            this.owner = p;

        }else if(option.equals("payRent")){
            s = "Du har betalt din husleje";
            p.pay(getIncome(),this.owner);
        }

        return s;
    }
    @Override
    protected String onReject(Player p){
        return "";
    }
}
