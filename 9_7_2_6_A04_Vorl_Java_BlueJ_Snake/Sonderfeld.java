
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

}
