
public class Sonderfeld {
    protected Spiel spiel;
    protected SonderSymbol symbol;

    public Sonderfeld(Spiel s) {
        spiel = s;
    }

    public int XPositionGeben() {
        return symbol.XPositionGeben();
    }

    public int YPositionGeben() {
        return symbol.YPositionGeben();
    }

    public void Aktion() {
    } // leer, da die Methode in den Unterklassen überschrieben werden muss

    protected void zufaelligPositionieren() {
        int x;
        int y;
        do {
            x = spiel.YKoordinateZufälligGeben();
            y = spiel.XKoordinateZufälligGeben();
        } while(!spiel.IstFrei(x, y));
        symbol.PositionSetzen(x, y);
    }
}
