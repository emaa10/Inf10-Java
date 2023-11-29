
/**
 * Rechtecke, inspiriert von Mondrian
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */

class RechteckMondrian extends Rechteck
{
    Zufall zufall; 

    /**
     * Konstruktor für Objekte der Klasse Rechteck_Mondrian
     */
    RechteckMondrian(String farbe)
    {
        super();
        zufall = new Zufall();
        super.GrößeSetzen((zufall.GanzzahlGeben(4) + 1)*20, (zufall.GanzzahlGeben(4) + 1)*20);
        super.PositionSetzen(zufall.GanzzahlGeben(10)*20,zufall.GanzzahlGeben(10)*20);


        super.FarbeSetzen(farbe);
    }

}
