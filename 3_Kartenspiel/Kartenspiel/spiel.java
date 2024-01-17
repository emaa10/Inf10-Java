public class spiel {
    private karte karte1; // Vorder- und Rückseite mit Baum
    private karte karte2; // Vorderseite Baum, Rückseite leer
    private karte karte3; // Vorderseite und Rückseite leer
    private int punkteSpieler;

    public spiel() {
        karte1 = new karte("Baum", "Baum");
        karte2 = new karte("Baum", "leer");
        karte3 = new karte("leer", "leer");
    }
}