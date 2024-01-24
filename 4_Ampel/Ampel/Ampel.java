
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

    

    
}
