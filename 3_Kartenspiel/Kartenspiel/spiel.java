public class spiel {
    private karte karte1; // Vorder- und Rückseite mit Baum
    private karte karte2; // Vorderseite Baum, Rückseite leer
    private karte karte3; // Vorderseite und Rückseite leer
    private int punkteSpieler;
    private int punkteDealer;

    public spiel() {
        createCards();
    }
    
    public void createCards() {
        karte1 = new karte("Baum", "Baum");
        karte2 = new karte("Baum", "leer");
        karte3 = new karte("leer", "leer");

    }

    public void countCards(int count) {
        for(int i=0;i<count;i++) {
            createCards();
            if(karte1.getVorderseite() == karte1.getRückseite()) {
                punkteDealer += 1;
            } else{
                punkteSpieler += 1;
            }            
            if(karte2.getVorderseite() == karte2.getRückseite()) {
                punkteDealer += 1;
            } else{
                punkteSpieler += 1;
            }            
            if(karte3.getVorderseite() == karte3.getRückseite()) {
                punkteDealer += 1;
            } else{
                punkteSpieler += 1;
            }
        }
    }

}