
/**
 * Klasse zur Beschreibung eines Gebirges.
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class Berge extends Figur
{
    
    /**
     * Konstruktor der Berge
     */
    Berge()
    {
        super();
        GrößeSetzen(200);
        int x1 = -10;
        int y1 = 50;
        int x2 = 50;
        int y2 = 50;
        int x3 = 20;
        int y3 = -20;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
        
        x1 = -50;
        y1 = 50;
        x2 = 30;
        y2 = 50;
        x3 = -10;
        y3 = -50;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
    }
    
    /**
     * Bewegt den Berg nach links
     */
    public void Bewegen()
    {
        PositionSetzen(XPositionGeben()-2, YPositionGeben());
        
        if(XPositionGeben() < -100)
        {
            PositionSetzen(800, YPositionGeben());
        }
    }  
    
    
}
