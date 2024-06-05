
/**
 * Die Verwaltungsklasse der Schlange.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
import java.util.*;
class Schlange
{
    ArrayList <RumpfSymbol> rumpf;
    /** Darstellung des Kopfs.*/
    private KopfSymbol kopf;
    /** Darstellung des Rumpfs */
    // private RumpfSymbol rumpf1;
    // private RumpfSymbol rumpf2;
    // private RumpfSymbol rumpf3;
    
    /**
     * Legt die Schlange an und stellt Anfangsposition und -bewgungsrichtung ein.
     * @param x: x-Koordinate der Startposition des Schlangenkopfs
     * @param y: y-Koordinate der Startposition des Schlangenkopfs
     * @param richtung: Startrichtung des Schlangenkopfs
     */
    Schlange(int x, int y, char richtung)
    {
        rumpf = new ArrayList <RumpfSymbol> ();
        kopf = new KopfSymbol();
        kopf.AusrichtungSetzen(richtung);
        kopf.PositionSetzen(x, y);
        for(int i=0; i < 3; i++){
            rumpf[i] = new RumpfSymbol();
        }
        switch (richtung)
        {
          case 'O':
            rumpf3.PositionSetzen(x - 1, y);
            rumpf2.PositionSetzen(x - 2, y);
            rumpf1.PositionSetzen(x - 3, y);
            break;
          case 'N':
            rumpf3.PositionSetzen(x, y + 1);
            rumpf2.PositionSetzen(x, y + 2);
            rumpf1.PositionSetzen(x, y + 3);
            break;
          case 'W':
            rumpf3.PositionSetzen(x + 1, y);
            rumpf2.PositionSetzen(x + 2, y);
            rumpf1.PositionSetzen(x + 3, y);
            break;
          case 'S':
            rumpf3.PositionSetzen(x, y - 1);
            rumpf2.PositionSetzen(x, y - 2);
            rumpf1.PositionSetzen(x, y - 3);
            break;
        }
    }
    
    /**
     * Bewegt die Schlange ein Feld in der eingestellten Richtung.
     */
    void Bewegen()
    {
        int x, xalt;
        int y, yalt;
        x = kopf.XPositionGeben();
        y = kopf.YPositionGeben();
        xalt = x;
        yalt = y;
        switch (kopf.AusrichtungGeben())
        {
          case 'O':
            x += 1;
            break;
          case 'N':
            y -= 1;
            break;
          case 'W':
            x -= 1;
            break;
          case 'S':
            y += 1;
            break;
        }
        kopf.PositionSetzen(x, y);
        rumpf1.Entfernen();
        rumpf1 = rumpf2;
        rumpf2 = rumpf3;
        rumpf3 = new RumpfSymbol();
        rumpf3.PositionSetzen(xalt, yalt);
    }
    
    /**
     * Setzt die Bewegunsrichtung der Schlange.
     * @param richtungNeu (neue) Bewegungsrichtung
     */
    void RichtungSetzen(char richtungNeu)
    {
        kopf.AusrichtungSetzen(richtungNeu);
    }
    
    /**
     * Gibt die x-Position des Schlangenkopfs zurück.
     * @return x-Position des Schlangenkopfs
     */
    int XPositionGeben()
    {
        return kopf.XPositionGeben();
    }
    
    /**
     * Gibt die y-Position des Schlangenkopfs zurück.
     * @return y-Position des Schlangenkopfs
     */
    int YPositionGeben()
    {
        return kopf.YPositionGeben();
    }
        
    /**
     * Prueft ob der Schlangenkopf auf der Position eines Rumpfsymbols ist, d.h.sich die Schlange selbst gebissen hat.
     * return wahr, wenn der Kopf im Rumpf liegt.
     */
    boolean KopfInRumpf()
    {
        return PunktInRumpf(kopf.XPositionGeben(), kopf.YPositionGeben());
    }
        
    /**
     * Prueft ob der angegebe Punkt auf der Position eines Rumpfsymbols ist.
     * @return wahr, wenn der Punkt zu einem Rumpfelement gehört.
     */
    boolean PunktInRumpf(int x, int y)
    {
        if ((x == rumpf1.XPositionGeben()) && (y == rumpf1.YPositionGeben()))
        {
            return true;
        }
        if ((x == rumpf2.XPositionGeben()) && (y == rumpf2.YPositionGeben()))
        {
            return true;
        }
        if ((x == rumpf3.XPositionGeben()) && (y == rumpf3.YPositionGeben()))
        {
            return true;
        }
        return false;
    }
}
