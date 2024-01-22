import java.util.Random;

public class spiel {
    private card card1; // Vorder- und Rückseite mit Baum
    private card card2; // Vorderseite Baum, Rückseite leer
    private card card3; // Vorderseite und Rückseite leer
    private card gezogen;
    private String seiteOben;
    private int punkteSpieler;
    private int punkteDealer;

    public spiel() {
        createCards();
    }
    
    public void createCards() {
        card1 = new card("Baum", "Baum");
        card2 = new card("Baum", "leer");
        card3 = new card("leer", "leer");
    }

    public void draw() {
        int zahl = randomNumber(2);
        switch(zahl) {
            case 0: gezogen = card1; break;
            case 1: gezogen = card2; break;
            case 2: gezogen = card3; break;
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
    //         if(card1.getVorderseite() == card1.getRückseite()) {
    //             punkteDealer += 1;
    //         } else{
    //             punkteSpieler += 1;
    //         }            
    //         if(card2.getVorderseite() == card2.getRückseite()) {
    //             punkteDealer += 1;
    //         } else{
    //             punkteSpieler += 1;
    //         }            
    //         if(card3.getVorderseite() == card3.getRückseite()) {
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