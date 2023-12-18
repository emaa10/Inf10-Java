
/**
 * Klasse zum Zeichnen eines Bildes.
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class Bild
{
    Zufall zufall;
    int anzahlGelb;
    int anzahlBlau;
    int anzahlRot;
    int anzahlSchwarz;
   
    /**
     * Konstruktor für Objekte der Klasse Bild
     */
    Bild(int anzahl)
    {
        zufall = new Zufall();
        anzahlGelb = 0;
        anzahlBlau = 0;
        anzahlRot = 0;
        anzahlSchwarz = 0;
        BildZeichnen(anzahl);
    }

    /**
     * Methode zur zufälligen Bestimmung einer Farbe
     */
    String FarbeGeben()
    {
        switch(zufall.GanzzahlGeben(4))
        {
            case 0: return "rot";
            case 1: return "schwarz";
            case 2: return "blau";
            case 3: return "gelb";
            default: return null;
        }
    }
    void neuesRechteck() {
        String farbe;
        farbe = this.FarbeGeben();
            new RechteckMondrian(farbe);
            switch(farbe) {
                case "rot":
                    anzahlRot += 1;
                    break;
                case "gelb":
                    anzahlGelb += 1;
                    break;
                case "blau":
                    anzahlBlau += 1;
                    break;
                case "schwarz":
                    anzahlSchwarz += 1;
                    break;
            }
    }
    
    /**
     * Methode zum Zeichnen eines Bildes
     */
    void BildZeichnen(int anzahlRechtecke)
    {
        anzahlRot = 0;
        anzahlGelb = 0;
        anzahlBlau = 0;
        anzahlSchwarz = 0;

        for(int i=0; i<anzahlRechtecke; i++) {
            neuesRechteck(); 
            while(anzahlRot == 0 || anzahlGelb == 0 || anzahlBlau == 0 || anzahlSchwarz == 0) {
                neuesRechteck();
            }
        }

    }
    
    

}
