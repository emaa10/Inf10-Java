public class Regal {

    Buch[] buecher;

    public Regal() {
        buecher = new Buch[100];
        for(int i = 0; i<buecher.length; i++) {
            buecher[i] = new Buch();
        }
    }
    
    public void alleTitelausgeben() {
        for (Buch buch :buecher) {
            buch.titelAusgeben();
        }
    }

    public void erstesWeg() {
        for(int i = 0; i<buecher.lenght-1; i++) {
            buecher[i] = buecher[i+1];
        }
    }
}

public class Buch {
    public String titel;

    public Buch() {
        // constructor
    }

    public void titelAusgeben() {
        System.out.println(titel);
    }
}