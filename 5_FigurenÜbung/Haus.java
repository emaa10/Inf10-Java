public class Haus
{
    private Rechteck rechteck1;
    private Dreieck dreieck;
    //Aufgabe 2: Füge ein neues Rechteck Attribut für eine Tür ein
    
    //Konstruktor
    public Haus(){
       //Objekte erstellen und in rechteck und dreieck speichern
       rechteck1=new Rechteck();
       dreieck=new Dreieck();
       //Aufgabe 3: Erstelle ein neues Rechteck Objekt und speichere es im passenden Attribut
       
       
       //Die Objekte einfärben und an die richtige Stelle schieben
       rechteck1.FarbeSetzen("blau");
       dreieck.FarbeSetzen("rot");
       rechteck1.Verschieben(0,100);
       
       //Aufgabe 4: Färbe die Tür grün, mache sie über GrößeSetzen(int, int) kleiner und verschiebe sie an die richtige Stelle
    }
    //Erstelle ein Haus Objekt um zu sehen, ob alles so aussieht wie du möchtest
}
