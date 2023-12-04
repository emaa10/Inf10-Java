
/**
 * Klasse zur Darstellung eines Vogels
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class Vogel extends Figur
{
    

    /**
     * Darstellung des Vogels gemäß Skizze
     */
    void VogelFlügelObenZeichnen()
    {
       FigurteilFestlegenEllipse(-35, -15, 50, 30, "schwarz");
       FigurteilFestlegenDreieck(-30, -25, -20, 0, 0, 0, "grau");
       FigurteilFestlegenDreieck(-20, 0, 0, 0, 10, -25, "grau");
       FigurteilFestlegenEllipse(10, -30, 30, 30, "schwarz");
       FigurteilFestlegenEllipse(29, -29, 1, 1, "grau");
       FigurteilFestlegenDreieck(40, -20, 40, -10, 50, -15, "orange");
    }


}
