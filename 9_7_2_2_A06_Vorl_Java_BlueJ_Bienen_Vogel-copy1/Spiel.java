

public class Spiel extends Ereignisbehandlung
{
  private Berge berg1;
  private Insekt insekt1;
  private Himmel himmel1;
  private Wiese wiese1;
  private Vogel vogel1;
  private Berge berg2;
  private Insekt insekt2;
  private Text punktzahl;
  String Punktzahl;
  
  
  public Spiel(){
    himmel1 = new Himmel();
    wiese1 = new Wiese();
    berg1 = new Berge();
    insekt1 = new Insekt(1);
    vogel1 = new Vogel();
    berg2 = new Berge();
    insekt2 = new Insekt(1);
    punktzahl = new Text();
    berg1.PositionSetzen(270, 315);
    insekt1.PositionSetzen(435, 192);
    berg2.PositionSetzen(533, 400);
    insekt2.PositionSetzen(637, 221);
    punktzahl.PositionSetzen(731,31);
    wiese1.NachHintenBringen();
    himmel1.NachHintenBringen();
    punktzahl.TextSetzen("0");
    punktzahl.TextGrößeSetzen(30);
  }
  @Override
  public void TaktImpulsAusführen(){
      berg1.Bewegen();
      berg2.Bewegen();
      insekt1.Bewegen();
      insekt2.Bewegen();
      if(vogel1.Berührt(insekt1)) {
        Punktzahl = "10";
        punktzahl.TextSetzen(Punktzahl);
        insekt1.PositionSetzen(800, insekt1.YPositionGeben());
      }
      if(vogel1.Berührt(berg1) ||vogel1.Berührt(berg2)){
        Text t = new Text();
        t.TextSetzen("Spiel beendet");
        t.TextGrößeSetzen(50);
        t.PositionSetzen(200, 100);
        Anhalten();
      }
  }
}
