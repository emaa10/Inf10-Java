

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
    berg1 = new Berge();
    insekt1 = new Insekt(1);
    himmel1 = new Himmel();
    wiese1 = new Wiese();
    vogel1 = new Vogel();
    berg2 = new Berge();
    insekt2 = new Insekt(1);
    berg1.PositionSetzen(101, 315);
    insekt1.PositionSetzen(435, 192);
    berg2.PositionSetzen(533, 400);
    insekt2.PositionSetzen(637, 221);
      
  }
  @Override
  public void TaktImpulsAusführen(){
      berg1.Bewegen();
      insekt1.Bewegen();
  }
}
