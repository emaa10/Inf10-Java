
/**
 * Der Himmel
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class Himmel extends Rechteck
{

    /**
     * Konstruktor des Himmels
     */
    Himmel()
    {
        super();
        FarbeSetzen("blau");
        GrößeSetzen(800, 600);
        PositionSetzen(0, 0);
    }
}
