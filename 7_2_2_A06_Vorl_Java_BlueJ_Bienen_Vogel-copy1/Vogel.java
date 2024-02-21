
/**
 * Beschreiben Sie hier die Klasse Vogel.
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class Vogel extends Figur
{
    /** Flugphase zur Animation des Vogels */
    int phase;
    
    /**
     * Konstruktor für Objekte der Klasse Vogel
     */
    Vogel()
    {
        super();
        GrößeSetzen(100);
        phase = 0;
        FlügelObenZeichnen();
    }

    /**
     * Zeichnet die Figur in der Position "Flügel oben"
     */
    void FlügelObenZeichnen()
    {
        EigeneFigurLöschen();
        int verschiebung =  10;
        //Flügel hinten
        int x1 = -20;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int x3 = 10;
        int y3 = -25;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
        
        //Schnabel
        x1 = 40;
        y1 = -10;
        x2 = 50;
        y2 = -15;
        x3 = 40;
        y3 = -20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange");  
        
        //Kopf
        int x = 10;
        int y = -30;
        int breite = 30;
        int höhe = 30;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Auge
        x = 28;
        y = -22;
        breite = 4;
        höhe = 4;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "blau");
        
        //Rumpf
        x = -40;
        y = -15;
        breite = 60;
        höhe = 30;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Flügel vorne
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = -30;
        y3 = -25;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
    }

    /**
     * Zeichnet die Figur in der Position "Flügel unten"
     */
    void FlügelUntenZeichnen()
    {
        EigeneFigurLöschen();
        int verschiebung =  -10;
        //Flügel hinten
        int x1 = -20;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int x3 = 20;
        int y3 = 15;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
        
        //Schnabel
        x1 = 40;
        y1 = -10;
        x2 = 50;
        y2 = -15;
        x3 = 40;
        y3 = -20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange");  
        
        //Kopf
        int x = 10;
        int y = -30;
        int breite = 30;
        int höhe = 30;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Auge
        x = 28;
        y = -22;
        breite = 4;
        höhe = 4;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "blau");
        
        //Rumpf
        x = -40;
        y = -15;
        breite = 60;
        höhe = 30;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Flügel vorne
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = -50;
        y3 = 20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
    }
    
     /**
     * Zeichnet die Figur in der Position "Flügel mittig"
     */
    void FlügelMitteZeichnen()
    {
        EigeneFigurLöschen();
        int verschiebung =  0;
        
        //Schnabelteil unten
        int x1 = 40;
        int y1 = -10;
        int x2 = 50;
        int y2 = -10;
        int x3 = 40;
        int y3 = -15;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange");  
        
        //Schnabelteil oben
        x1 = 40;
        y1 = -15;
        x2 = 50;
        y2 = -20;
        x3 = 40;
        y3 = -20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange");  
        
        //Kopf
        int x = 10;
        int y = -30;
        int breite = 30;
        int höhe = 30;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Auge
        x = 28;
        y = -22;
        breite = 4;
        höhe = 4;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "blau");
        
        //Rumpf
        x = -40;
        y = -15;
        breite = 60;
        höhe = 30;
        y = y + verschiebung;
        FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Flügel vorne
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = -50;
        y3 = 5;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
    }
    
    /**
     * Taktsteuerung des Vogels
     */
    @Override void AktionAusführen()
    {
        switch(phase)
        {
          case 0: 
            FlügelObenZeichnen(); 
            phase = 1;
            break;
          case 1:
            FlügelMitteZeichnen();
            phase = 2;
            break;
          case 2:
            FlügelUntenZeichnen();
            phase = 3;
            break;
          case 3:
            FlügelMitteZeichnen();
            phase = 0;
            break;
        }
        
        PositionSetzen(XPositionGeben(), YPositionGeben()+3);
    }
    
    
    /**
     * Tastensteuerung des Vogels
     */
    @Override void SonderTasteGedrückt(int code)
    {
        if(code == 38)
        {
            PositionSetzen(XPositionGeben(), YPositionGeben()-15);
        }
        
        switch(phase)
        {
          case 0:
            FlügelObenZeichnen(); 
            phase = 1;
            break;
          case 1:
            FlügelMitteZeichnen();
            phase = 2;
            break;
          case 2:
            FlügelUntenZeichnen();
            phase = 3;
            break;
          case 3:
            FlügelMitteZeichnen();
            phase = 0;
            break;
        }
    }
}
