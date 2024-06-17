
public class Minus extends Sonderfeld
{

    public Minus(Spiel s)
    {
        super(s);
        symbol = new MinusSymbol();
        zufaelligPositionieren();
    }

    @Override 
    public void Aktion() {
        spiel.PunkteÄndern(200);
        zufaelligPositionieren();
    }

}
