public class Spiel extends Ereignisbehandlung
{
  private Berge berg1;
  private Insekt insekt1;
  private Himmel himmel1;
  private Wiese wiese1;
  private Vogel vogel1;
  private Berge berg2;
  private Insekt insekt2;
 
  
  
  public Spiel(){
    himmel1 = new Himmel();
    wiese1 = new Wiese();
    berg1 = new Berge();
    insekt1 = new Insekt(1);
    vogel1 = new Vogel();
    berg2 = new Berge();
    insekt2 = new Insekt(1);
    berg1.PositionSetzen(270, 315);
    insekt1.PositionSetzen(435, 192);
    berg2.PositionSetzen(533, 400);
    insekt2.PositionSetzen(637, 221);
    wiese1.NachHintenBringen();
    himmel1.NachHintenBringen();
      
  }
  @Override
  public void TaktImpulsAusführen(){
      berg1.Bewegen();
      insekt1.Bewegen();
      berg2.Bewegen();
      insekt2.Bewegen();
  }
}
