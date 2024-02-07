public class Spiel extends Ereignisbehandlung {
    private Berge berg1;
    private Insekt insekt1;
    
    public Spiel() {
        berg1 = new Berge();
        insekt1 = new Insekt(1);
    }
    @Override public void TaktImpulsAusführen() {
        berg1.Bewegen();
        insekt1.Bewegen();
    }
}