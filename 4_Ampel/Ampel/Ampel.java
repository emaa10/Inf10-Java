
public class Ampel
{
    private Lampe lampeOben;
    private Lampe lampeMitte;
    private Lampe lampeUnten;

    public Ampel()
    {
        lampeOben = new Lampe("Rot");
        lampeMitte = new Lampe("Schwarz");
        lampeUnten = new Lampe("Schwarz");
    }

    public void rotSetzen() {
        lampeOben.farbeSetzen("Rot");
        lampeMitte.farbeSetzen("Schwarz");
        lampeUnten.farbeSetzen("Schwarz");
    }

    public void rotGelbSetzen() {
        lampeOben.farbeSetzen("Rot");
        lampeMitte.farbeSetzen("Gelb");
        lampeUnten.farbeSetzen("Schwarz");
    }

    public void grünSetzen() {
        lampeOben.farbeSetzen("Schwarz");
        lampeMitte.farbeSetzen("Schwarz")
        lampeUnten.farbeSetzen("Grün");
    }

    public void gelbSetzen() {
        lampeOben.farbeSetzen("Schwarz");
        lampeMitte.farbeSetzen("Gelb");
        lampeUnten.farbeSetzen("Schwarz");
    }

    

    
}
