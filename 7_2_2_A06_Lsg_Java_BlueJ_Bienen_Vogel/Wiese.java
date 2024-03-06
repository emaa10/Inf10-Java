
/**
 * Die Wiese
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class Wiese extends Rechteck
{

    /**
     * Konstruktor der Wiese
     */
    Wiese()
    {
        super();
        FarbeSetzen("hellgrün");
        GrößeSetzen(800, 200);
        PositionSetzen(0,400);
    }
}
