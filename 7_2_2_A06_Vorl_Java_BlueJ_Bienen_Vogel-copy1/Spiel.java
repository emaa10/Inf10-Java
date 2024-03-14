public class Spiel extends Ereignisbehandlung
{
  private Himmel himmel1;
  private Wiese wiese1;
  private Vogel vogel1;

  Berge[] berge;
  Insekt[] insekten;

  public Text gameover;
  public Text restart;
  public Text punkteText;
  public int punkte = 0;
  private boolean taktgeberStatus = true;
 
  
  
  public Spiel(){
    himmel1 = new Himmel();
    wiese1 = new Wiese();
    vogel1 = new Vogel();

    berge = new Berge[2];
    for(int i = 0; i<2; i++) {
      berge[i] = new Berge();
    }
    

    insekten = new Insekt[3];
    for(int i=0; i<insekten.length;i++) {
      insekten[i] = new Insekt(1);
    }

    gameover = new Text();
    restart = new Text();
    punkteText = new Text();
    punkteText.SichtbarkeitSetzen(true);
    punkteText.PositionSetzen(750, 50);
    punkteText.TextGrößeSetzen(35);
    punkteText.TextSetzen("0");
    punkteText.FarbeSetzen("gelb");
    gameover.SichtbarkeitSetzen(false);
    restart.SichtbarkeitSetzen(false);
    berge[0].PositionSetzen(270, 315);
    berge[1].PositionSetzen(700, 315);

    insekten[0].PositionSetzen(300, 192);
    insekten[1].PositionSetzen(637, 50);
    insekten[2].PositionSetzen(50, 50);
    wiese1.NachHintenBringen();
    himmel1.NachHintenBringen();
      
  }
  
  @Override
  public void TasteGedrückt (char taste) {
    System.out.println(taste);
    if(taste == 'r' && taktgeberStatus == false) {
      berge[0].PositionSetzen(270, 315);
      berge[1].PositionSetzen(700, 315);
      insekten[0].PositionSetzen(300, 192);
      insekten[1].PositionSetzen(637, 50);
      insekten[2].PositionSetzen(50, 50);
      vogel1.PositionSetzen(93, 212);
      gameover.SichtbarkeitSetzen(false);
      restart.SichtbarkeitSetzen(false);
      Zeichenfenster.TaktgeberStarten();
    }
  }

  @Override
  public void TaktImpulsAusführen(){
      taktgeberStatus = true;
      berge[0].Bewegen();
      berge[1].Bewegen();
      for(Insekt ins :insekten) { // geht oben nicht weil da im feld noch nix drin war
        ins.Bewegen();
      }

      punkteText.TextSetzen(String.valueOf(punkte));

      // insekt logic
      for (Insekt ins :insekten) {
        if(ins.Berührt(vogel1)) { ins.PositionSetzen(810, ins.YPositionGeben()); punkte += 5;}
      }

      // berg logic
      for(Berge berg :berge) {
        if(berg.Berührt(vogel1)) { 
          punkte = 0;
  
          gameover.TextSetzen("GAME OVER");
          gameover.GanzNachVornBringen();
          gameover.SichtbarkeitSetzen(true);
          gameover.TextGrößeSetzen(100);
          gameover.PositionSetzen(125, 250);
          gameover.FarbeSetzen("rot");
  
          restart.TextSetzen("press r to restart");
          restart.GanzNachVornBringen();
          restart.SichtbarkeitSetzen(true);
          restart.TextGrößeSetzen(50);
          restart.PositionSetzen(200, 300);
  
          taktgeberStatus = false;
          Zeichenfenster.TaktgeberStoppen();
        }
      }
  }

}
