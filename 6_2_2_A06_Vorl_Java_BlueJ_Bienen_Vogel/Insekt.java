
/**
 * Klasse zur Beschreibung eines Insekts.
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class Insekt extends Figur
{
    /**Flugphase des Insekts */
    int phase;
    
    /**
     * Konstruktor des Insekts
     * @param phaseNeu die Startpahse der Flügelbewegung
     */
    Insekt(int phaseNeu)
    {
        GrößeSetzen(50);
        phase = phaseNeu;
        if (phase == 1) 
        {
            FlügelUntenZeichnen();
        }
        else
        {
            FlügelObenZeichnen();
        }
    }
    
    /**
     * Zeichnet das Objekt in Position "Flügel oben"
     */
    void FlügelObenZeichnen()
    {
        
        EigeneFigurLöschen();
 
        //Flügel hinten
        int x1 = 0;
        int y1 = -7;
        int x2 = -3;
        int y2 = -28;
        int x3 = -14;
        int y3 = -25;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "weiß");
        
        //Rumpf
        int x = -20;
        int y = -12;
        int breite = 30;
        int höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "schwarz");

        //Hintern
        x = 5;
        y = -18;
        breite = 30;
        höhe = 35;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "gelb");
        
        //Streifen1 gelb
        x = -15;
        y = -12;
        breite = 5;
        höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "gelb");
        
        //Streifen2 gelb
        x = -5;
        y = -12;
        breite = 5;
        höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "gelb");
        
        //Streifen3 gelb
        x = 5;
        y = -12;
        breite = 5;
        höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "gelb");
        
        //Kopf
        x = -38;
        y = -18;
        breite = 23;
        höhe = 33;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Flügel vorne
        x1 = 0;
        y1 = 0;
        x2 = 23;
        y2 = -27;
        x3 = 7;
        y3 = -30;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "weiß");
        
        //Rüssel1
        x = -38;
        y = 4;
        breite = 5;
        höhe = 20;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "magenta");
        
        //Rüssel2
        x1 = -38;
        y1 = 24;
        x2 = -34;
        y2 = 21;
        x3 = -24;
        y3 = 31;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "magenta");
        
        //Auge
        x = -42;
        y = -15;
        breite = 10;
        höhe = 10;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "weiss");
        //Pupille Auge
        x = -42;
        y = -12;
        breite = 4;
        höhe = 4;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");        
    }
    
     /**
     * Zeichnet das Objekt in Position "Flügel unten"
     */
    void FlügelUntenZeichnen()
    {
        EigeneFigurLöschen();
        //Flügel hinten
        int x1 = 0;
        int y1 = 0;
        int x2 = -3;
        int y2 = 28;
        int x3 = -14;
        int y3 = 25;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "weiß");
 
        //Rumpf
        int x = -20;
        int y = -12;
        int breite = 30;
        int höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "schwarz");

        //Hintern
        x = 5;
        y = -18;
        breite = 30;
        höhe = 35;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "gelb");
        
        //Streifen1 gelb
        x = -15;
        y = -12;
        breite = 5;
        höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "gelb");
        
        //Streifen2 gelb
        x = -5;
        y = -12;
        breite = 5;
        höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "gelb");
        
        //Streifen3 gelb
        x = 5;
        y = -12;
        breite = 5;
        höhe = 24;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "gelb");
        
        //Kopf
        x = -38;
        y = -18;
        breite = 23;
        höhe = 33;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Flügel vorne
        x1 = 0;
        y1 = 0;
        x2 = 23;
        y2 = 27;
        x3 = 7;
        y3 = 30;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "weiß");
        
        //Rüssel1
        x = -38;
        y = 4;
        breite = 5;
        höhe = 20;
        FigurteilFestlegenRechteck(x, y, breite, höhe, "magenta");
        
        //Rüssel2
        x1 = -38;
        y1 = 24;
        x2 = -34;
        y2 = 21;
        x3 = -24;
        y3 = 31;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "magenta");
        
        //Auge
        x = -42;
        y = -15;
        breite = 10;
        höhe = 10;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "weiss");
        //Pupille Auge
        x = -42;
        y = -12;
        breite = 4;
        höhe = 4;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");        
    }
    
     /**
     * Aktionsmethode
     */
    @Override void AktionAusführen()
    {
        if(phase==0)
        {
            phase=1;
            FlügelUntenZeichnen();
        }  
        else
        {
            phase=0;
            FlügelObenZeichnen();
        }

    }
}
