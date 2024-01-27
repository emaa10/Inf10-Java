public class Ampel
{
    private Lampe lampRed;    //oben
    private Lampe lampYellow; //mitte 
    private Lampe lampGreen;  //unten
    enum lightColors {RED, REDYELLOW, GREEN, YELLOW}
    lightColors TLPhase = lightColors.RED;

    public Ampel()
    {
        lampRed = new Lampe(true);
        lampYellow = new Lampe(false);
        lampGreen = new Lampe(false);
        printStatus();
    }
    
    public void printStatus() {
        System.out.println("Lampe Oben: " + (lampRed.getStatus()?"🔴":"⚫"));
        System.out.println("Lampe Mitte: " + (lampYellow.getStatus()?"🟡":"⚫"));
        System.out.println("Lampe Unten: " + (lampGreen.getStatus()?"🟢":"⚫"));
        System.out.println("Ampelphase: " + TLPhase);
        System.out.println("------");
    }

    public void setRed() {
        lampRed.setStatus(true);
        lampYellow.setStatus(false);
        lampGreen.setStatus(false);
    }

    public void setRedYellow() {
        lampRed.setStatus(true);
        lampYellow.setStatus(true);
        lampGreen.setStatus(false);
    }

    public void setGreen() {
        lampRed.setStatus(false);
        lampYellow.setStatus(false);
        lampGreen.setStatus(true);
    }

    public void setYellow() {
        lampRed.setStatus(false);
        lampYellow.setStatus(true);
        lampGreen.setStatus(false);
    }

    public void weiterSchalten() {
        switch(TLPhase) {
            case RED:
                TLPhase = lightColors.REDYELLOW;
                setRedYellow();
                break;
            case REDYELLOW:
                TLPhase = lightColors.GREEN;
                setGreen();
                break;
            case GREEN:
                TLPhase = lightColors.YELLOW;
                setYellow();
                break;
            case YELLOW:
                TLPhase = lightColors.RED;
                setRed();
                break;
        }
        printStatus();
    }

    

    
}
