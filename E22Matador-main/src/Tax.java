public class Tax extends Field {
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);

    }

    @Override
    public String onLand(Player p) {
        String s = super.onLand(p);
        s += "\n Vil du betale fast beløb? Tast J for ja \n (Ellers trækker vi et beløb der svarer til 10 % af dine aktiver)";
        return s;
    }

    @Override
    protected String onAccept(Player p) {
        p.pay(this.cost);
        return p.getName() + " har nu betalt et fast beløb";
    }


    @Override
    protected String onReject(Player p) {
        //1.F Metoden kan du bruge i Tax-klassens onReject() til at beregne hvor meget spilleren
        //skal betale i skat. Implementer dette og test at det virker.
        int currentAssets = calculateAssets(p);

        /*Todo: indkommenter følgende linje når metoden er skrevet: */
        //float assets = calculateAssets(p);
        float calcTax = currentAssets * 0.1f; // todo:  ændres til denne assignment: balance + assets * 0.1f; (Når der er kommet en værdi i 'assets')

        p.pay((int) calcTax);

        return p.getName() + " Afviste at betale et fast beløb i skat. Vi har derfor trukket 10 % af " + p.getName() + "'s aktiver";
    }


    //1.A Torsdagsopgave 13/10-2022:
    //I klassen Tax skal du lave metoden calculateAssets(Player p).
    //Metoden skal beregne og returnere spillerens samlede værdier.

    protected int calculateAssets(Player p) {
        //1.B I metoden calculateAssets() skal du først finde ud af hvor mange rede penge spilleren har.
        //Gem fx dette i en variable kaldet assets.

        //1.F Du kan nu kalde metoden fra Tax klassens calculateAssets()
        //og lægge beløbet til din lokale variable assets fra 1.b.
        //Til sidst skal du returnere assets.
        int assets = p.getPropertyValues() + p.getBalance(); //p.getBalance hvor mange penge man har i hånden
        return  assets;
    }



}
