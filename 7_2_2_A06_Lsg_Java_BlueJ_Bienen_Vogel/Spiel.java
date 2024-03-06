
/**
 * Das Spiel
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class Spiel extends Ereignisbehandlung
{
    /** Referenzattribut des Vogels */
    Vogel vogel;

    // /** Referenzattribute der Insekten */
    // Insekt insekt1, insekt2, insekt3;
    Insekt[] insekten;

    
    /** Referenzattribute der Berge */    
    Berge berge1, berge2;

    /**
     * Konstruktor des Spiels
     */
    Spiel()
    {
        super();
        new Himmel();
        new Wiese();
        insekt1 = new Insekt(0);
        insekt1.PositionSetzen(700, 100);
        insekt2 = new Insekt(1);
        insekt2.PositionSetzen(500, 200);
        insekt3 = new Insekt(1);
        insekt3.PositionSetzen(600, 300);
        vogel = new Vogel();

        berge1 = new Berge();
        berge2 = new Berge();
        berge1.PositionSetzen(320,320);
        berge2.PositionSetzen(600, 340);
        vogel.Gehen(-50);

        TaktdauerSetzen(300);
    }

    /**
     * Testet auf Berührung und beendet das Spiel
     */
    @Override void TaktImpulsAusführen()
    {
        berge1.Bewegen();
        berge2.Bewegen();
        insekt1.Bewegen();
        insekt2.Bewegen();
        insekt3.Bewegen();
        if(vogel.Berührt(insekt1))
        {
            insekt1.PositionSetzen(800, insekt1.YPositionGeben());
        }

        if(vogel.Berührt(insekt2))
        {
            insekt2.PositionSetzen(800, insekt2.YPositionGeben());
        }
        
        if(vogel.Berührt(insekt3))
        {
            insekt3.PositionSetzen(800, insekt3.YPositionGeben());
        }

        if(vogel.Berührt(berge1)||vogel.Berührt(berge2))
        {
            Text t = new Text();
            t.TextSetzen("Spiel beendet");
            t.TextGrößeSetzen(50);
            t.FarbeSetzen("weiß");
            t.PositionSetzen(200, 200);
            Anhalten();
        }

    }
}
