import java.util.Random;

public class spiel {
    private karte karte1; // Vorder- und Rückseite mit Baum
    private karte karte2; // Vorderseite Baum, Rückseite leer
    private karte karte3; // Vorderseite und Rückseite leer
    private karte gezogen;
    private String seiteOben;
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

    public void draw() {
        int zahl = randomNumber(2);
        switch(zahl) {
            case 0: gezogen = karte1; break;
            case 1: gezogen = karte2; break;
            case 2: gezogen = karte3; break;
        }

        zahl = randomNumber(1);

        switch(zahl) {
            case 0: seiteOben = gezogen.getVorderseite();
            case 1: seiteOben = gezogen.getRückseite();
        }
        System.out.println("Gezeigt wird: " + seiteOben + " und gezogen wurde: " + gezogen.getVorderseite() + " und " + gezogen.getRückseite());

        if(gezogen.getVorderseite() == gezogen.getRückseite()) {
            punkteDealer++;
            System.out.println("Dealer win");
        } else {
            punkteSpieler++;
            System.out.println("Player win");
        }

    }

    public void drawMultiple(int amount) {
        for(int c=0;c<amount;c++) {
            draw();
        }
        System.out.println("Dealer's points: " + punkteDealer + ", Player's points: " + punkteSpieler);
        System.out.println(punkteDealer>punkteSpieler?"Dealer won!":"Player won!");
    }


    // public void countCards(int count) {
    //     for(int i=0;i<count;i++) {
    //         createCards();
    //         if(karte1.getVorderseite() == karte1.getRückseite()) {
    //             punkteDealer += 1;
    //         } else{
    //             punkteSpieler += 1;
    //         }            
    //         if(karte2.getVorderseite() == karte2.getRückseite()) {
    //             punkteDealer += 1;
    //         } else{
    //             punkteSpieler += 1;
    //         }            
    //         if(karte3.getVorderseite() == karte3.getRückseite()) {
    //             punkteDealer += 1;
    //         } else{
    //             punkteSpieler += 1;
    //         }
    //     }
    //     System.out.println("PunkteSpieler: " + punkteSpieler + " PunkteDealer: " + punkteDealer);
    // }

    public int randomNumber(int nextInt) { // random number von 0 bis nextInt
        Random generator;
        generator = new Random();
        int number = generator.nextInt(nextInt + 1);
        return number;
    }

}