import java.util.Random;

public class spiel {
    private card card1; // Vorder- und Rückseite mit Baum
    private card card2; // Vorderseite Baum, Rückseite leer
    private card card3; // Vorderseite und Rückseite leer
    private card drawn;
    private String topPage;
    private int pointsPlayer;
    private int pointsDealer;

    public spiel() {
        createCards();
    }
    
    public void createCards() {
        card1 = new card("Baum", "Baum");
        card2 = new card("Baum", "leer");
        card3 = new card("leer", "leer");
    }

    public void draw() {
        int number = randomNumber(2);
        switch(number) {
            case 0: drawn = card1; break;
            case 1: drawn = card2; break;
            case 2: drawn = card3; break;
        }

        number = randomNumber(1);

        switch(number) {
            case 0: topPage = drawn.getTopPage();
            case 1: topPage = drawn.getBottomPage();
        }
        System.out.println("Shown: " + topPage + " and: " + drawn.getTopPage() + " and " + drawn.getBottomPage() + " was drawn.");

        if(drawn.getTopPage() == drawn.getBottomPage()) {
            pointsDealer++;
            System.out.println("Dealer win");
        } else {
            pointsPlayer++;
            System.out.println("Player win");
        }

    }

    public void drawMultiple(int amount) {
        for(int c=0;c<amount;c++) {
            draw();
        }
        System.out.println("Dealer's points: " + pointsDealer + ", Player's points: " + pointsPlayer);
        System.out.println(pointsDealer>pointsPlayer?"Dealer won!":"Player won!");
    }


    // public void countCards(int count) {
    //     for(int i=0;i<count;i++) {
    //         createCards();
    //         if(card1.getVorderseite() == card1.getRückseite()) {
    //             pointsDealer += 1;
    //         } else{
    //             pointsPlayer += 1;
    //         }            
    //         if(card2.getVorderseite() == card2.getRückseite()) {
    //             pointsDealer += 1;
    //         } else{
    //             pointsPlayer += 1;
    //         }            
    //         if(card3.getVorderseite() == card3.getRückseite()) {
    //             pointsDealer += 1;
    //         } else{
    //             pointsPlayer += 1;
    //         }
    //     }
    //     System.out.println("PunkteSpieler: " + pointsPlayer + " PunkteDealer: " + pointsDealer);
    // }

    public int randomNumber(int nextInt) { // random number von 0 bis nextInt
        Random generator;
        generator = new Random();
        int number = generator.nextInt(nextInt + 1);
        return number;
    }

}