public class Haus
{
    private Rechteck rechteck1;
    private Rechteck rechteck2;
    private Dreieck dreieck;
    
    //Konstruktor
    public Haus(){
       //Objekte erstellen und in rechteck und dreieck speichern
       rechteck1=new Rechteck();
       rechteck2=new Rechteck();
       dreieck=new Dreieck();
       //Aufgabe 3: Erstelle ein neues Rechteck Objekt und speichere es im passenden Attribut
       
       
       //Die Objekte einfärben und an die richtige Stelle schieben
       rechteck1.FarbeSetzen("blau");
       dreieck.FarbeSetzen("rot");
       rechteck1.Verschieben(0,100);
       rechteck2.FarbeSetzen("schwarz");
       rechteck2.Verschieben(25,150);
       rechteck2.GrößeSetzen(50,50);
       rechteck2.GanzNachVornBringen();
       
       //Aufgabe 4: Färbe die Tür grün, mache sie über GrößeSetzen(int, int) kleiner und verschiebe sie an die richtige Stelle
    }
    //Erstelle ein Haus Objekt um zu sehen, ob alles so aussieht wie du möchtest
}
