public class Tax extends Field {

    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);

    }

    public String onLand() {

        return "";
    }

    private String onAccept() {

        return "";
    }

    private String onReject() {

        return "";
    }
}
