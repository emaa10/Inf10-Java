
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
    
    /**
     * Methode zum Zeichnen eines Bildes
     */
    void BildZeichnen(int anzahlRechtecke)
    {
        //muss noch ergänzt werden

    }
    
    

}
