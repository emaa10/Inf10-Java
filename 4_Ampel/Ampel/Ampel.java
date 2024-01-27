
public class Ampel
{
    private Lampe lampeOben; //rot
    private Lampe lampeMitte;//gelb
    private Lampe lampeUnten;//grün
    // private String ampelPhase = "rot";
    enum ampelFarben {ROT, ROTGELB, GRÜN, GELB}
    ampelFarben ampelPhase = ampelFarben.ROT;

    public Ampel()
    {
        lampeOben = new Lampe(true);    //rot
        lampeMitte = new Lampe(false);
        lampeUnten = new Lampe(false);
        System.out.println("Lampe Oben: " + (lampeOben.getStatus()?"An":"Aus"));
        System.out.println("Lampe Mitte: " + (lampeMitte.getStatus()?"An":"Aus"));
        System.out.println("Lampe Unten: " + (lampeUnten.getStatus()?"An":"Aus"));
        System.out.println("Ampelphase: " + ampelPhase);
        System.out.println("------");
    }

    public void rotSetzen() {
        lampeOben.setStatus(true);
        lampeMitte.setStatus(false);
        lampeUnten.setStatus(false);
    }

    public void rotGelbSetzen() {
        lampeOben.setStatus(true);
        lampeMitte.setStatus(true);
        lampeUnten.setStatus(false);
    }

    public void grünSetzen() {
        lampeOben.setStatus(false);
        lampeMitte.setStatus(false);
        lampeUnten.setStatus(true);
    }

    public void gelbSetzen() {
        lampeOben.setStatus(false);
        lampeMitte.setStatus(true);
        lampeUnten.setStatus(false);
    }

    public void weiterSchalten() {
        switch(ampelPhase) {
            case ROT:
                ampelPhase = ampelFarben.ROTGELB;
                rotGelbSetzen();
                break;
            case ROTGELB:
                ampelPhase = ampelFarben.GRÜN;
                grünSetzen();
                break;
            case GRÜN:
                ampelPhase = ampelFarben.GELB;
                gelbSetzen();
                break;
            case GELB:
                ampelPhase = ampelFarben.ROT;
                rotSetzen();
                break;
        }
        System.out.println("Lampe Oben: " + (lampeOben.getStatus()?"An":"Aus"));
        System.out.println("Lampe Mitte: " + (lampeMitte.getStatus()?"An":"Aus"));
        System.out.println("Lampe Unten: " + (lampeUnten.getStatus()?"An":"Aus"));
        System.out.println("Ampelphase: " + ampelPhase);
        System.out.println("------");
    }

    

    
}
