
public class Ampel
{
    private Lampe lampeOben; //rot
    private Lampe lampeMitte;//gelb
    private Lampe lampeUnten;//grün
    private String ampelPhase = "rot";

    public Ampel()
    {
        lampeOben = new Lampe(true);    //rot
        lampeMitte = new Lampe(false);
        lampeUnten = new Lampe(false);
        System.out.println("Lampe Oben: " + (lampeOben.statusGeben()?"An":"Aus"));
        System.out.println("Lampe Mitte: " + (lampeMitte.statusGeben()?"An":"Aus"));
        System.out.println("Lampe Unten: " + (lampeUnten.statusGeben()?"An":"Aus"));
        System.out.println("Ampelphase: " + ampelPhase);
        System.out.println("------");
    }

    public void rotSetzen() {
        lampeOben.statusSetzen(true);
        lampeMitte.statusSetzen(false);
        lampeUnten.statusSetzen(false);
    }

    public void rotGelbSetzen() {
        lampeOben.statusSetzen(true);
        lampeMitte.statusSetzen(true);
        lampeUnten.statusSetzen(false);
    }

    public void grünSetzen() {
        lampeOben.statusSetzen(false);
        lampeMitte.statusSetzen(false);
        lampeUnten.statusSetzen(true);
    }

    public void gelbSetzen() {
        lampeOben.statusSetzen(false);
        lampeMitte.statusSetzen(true);
        lampeUnten.statusSetzen(false);
    }

    public void weiterSchalten() {
        switch(ampelPhase) {
            case "rot":
                ampelPhase = "rotgelb";
                rotGelbSetzen();
                break;
            case "rotgelb":
                ampelPhase = "grün";
                grünSetzen();
                break;
            case "grün":
                ampelPhase = "gelb";
                gelbSetzen();
                break;
            case "gelb":
                ampelPhase = "rot";
                rotSetzen();
                break;
        }
        System.out.println("Lampe Oben: " + (lampeOben.statusGeben()?"An":"Aus"));
        System.out.println("Lampe Mitte: " + (lampeMitte.statusGeben()?"An":"Aus"));
        System.out.println("Lampe Unten: " + (lampeUnten.statusGeben()?"An":"Aus"));
        System.out.println("Ampelphase: " + ampelPhase);
        System.out.println("------");
    }

    

    
}
