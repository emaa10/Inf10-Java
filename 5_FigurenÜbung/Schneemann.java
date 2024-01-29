
//Ignoriere erst mal die Fehler. Wenn du alles bearbeitet hast, sollten sie weg sein
public class Schneemann
{
    //Ein Schneemann besteht aus drei Kreisen.
    //Aufgabe 1: Füge drei Referenzattribute für die drei Kreise des Schneemanns ein (kreis1, kreis2, kreis3)

    
    //Konstruktor:
    public Schneemann(String farbeNeu){
        kreis1 = new Kreis();
        kreis2 = new Kreis();
        kreis3 = new Kreis();
        //Aufgabe 2:    Die drei Kreise sollen in der Farbe farbeNeu, die im Parameter steht, eingefärbt werden. 
        //Rufe bei jedem Kreis die Methode FarbeSetzen(farbeNeu) auf.
        
        
        
        //Aufgabe 3: Verschiebe die zwei unteren Kreise so, dass ein Schneemann entsteht (100 bzw 200 nach unten)
        
        //Aufgabe 4: Verschiebe den kompletten Schneemann um 300 nach rechts
    }

    //Methode zum Farbe ändern des Kopfes:
    //Aufgabe 5: Vervollständige diese Methode
    public void FarbeObenÄndern(//Füge den Parameter ein)
    {
        kreis1.FarbeSetzen(//hier soll die neue Farbe rein);
    }
    //Aufgabe 6: Erstelle ein Schneemann Objekt
}
