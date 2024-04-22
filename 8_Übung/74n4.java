import java.util.ArrayList;
public class LOTTO {
  int LOTTO[6] = {0};
  ArrayList<String> gezogeneZahlen = new ArrayList<int>();

  public void tippen(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6) {
    for (int i = 0; i<6, i++) {
      LOTTO[i] = 0;
    }
    LOTTO[0] = zahl1;
    LOTTO[1] = zahl2;
    LOTTO[2] = zahl3;
    LOTTO[3] = zahl4;
    LOTTO[4] = zahl5;
    LOTTO[5] = zahl6;
  }

  public void zahlenZiehen() {
    gezogeneZahlen.clear();
    int i = 0;
    while(i < 6) {
      zufallszahl = zufallsgenerator.ZufallsZahlErzeugen();
      if(!(gezogeneZahlen.contains(zufallszahl))) {
        gezogeneZahlen.add(zufallszahl);
        i++;
      }
    }
  }
}
