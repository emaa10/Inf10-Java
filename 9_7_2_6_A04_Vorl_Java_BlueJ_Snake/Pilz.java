
public class Pilz extends Sonderfeld
{

    public Pilz(Spiel s)
    {
        super(s);
        symbol = new PilzSymbol();
        zufaelligPositionieren();
    }

    @Override 
    public void Aktion() {
        spiel.PunkteÄndern(200);
        zufaelligPositionieren();
    }

}
