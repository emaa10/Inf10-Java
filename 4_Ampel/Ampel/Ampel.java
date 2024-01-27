public class Ampel
{
    private Lampe lampeRot;  //oben
    private Lampe lampeGelb; //mitte 
    private Lampe lampeGrün; //unten
    enum ampelFarben {ROT, ROTGELB, GRÜN, GELB}
    ampelFarben ampelPhase = ampelFarben.ROT;

    public Ampel()
    {
        lampeRot = new Lampe(true);
        lampeGelb = new Lampe(false);
        lampeGrün = new Lampe(false);
        printStatus();
    }
    
    public void printStatus() {
        System.out.println("Lampe Oben: " + (lampeRot.getStatus()?"🔴":"⚫"));
        System.out.println("Lampe Mitte: " + (lampeGelb.getStatus()?"🟡":"⚫"));
        System.out.println("Lampe Unten: " + (lampeGrün.getStatus()?"🟢":"⚫"));
        System.out.println("Ampelphase: " + ampelPhase);
        System.out.println("------");
    }

    public void rotSetzen() {
        lampeRot.setStatus(true);
        lampeGelb.setStatus(false);
        lampeGrün.setStatus(false);
    }

    public void rotGelbSetzen() {
        lampeRot.setStatus(true);
        lampeGelb.setStatus(true);
        lampeGrün.setStatus(false);
    }

    public void grünSetzen() {
        lampeRot.setStatus(false);
        lampeGelb.setStatus(false);
        lampeGrün.setStatus(true);
    }

    public void gelbSetzen() {
        lampeRot.setStatus(false);
        lampeGelb.setStatus(true);
        lampeGrün.setStatus(false);
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
        printStatus();
    }

    

    
}
