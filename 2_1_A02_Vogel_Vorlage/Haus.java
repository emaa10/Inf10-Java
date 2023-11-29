
/**
 * Klasse zur Darstellung eines Hauses.
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class Haus extends Figur
{

    /**
     * Methode zum Zeichnen des Hauses
     */
    void HausZeichnen()
    {
        FigurteilFestlegenDreieck(0,-10,10,0,-10,0,"rot");
        FigurteilFestlegenRechteck(-10, 0, 20, 20, "gelb");
    }

}
