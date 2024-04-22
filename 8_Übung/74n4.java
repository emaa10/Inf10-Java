import java.util.ArrayList;
public class LOTTO {
  int LOTTO[6] = {0};
  ArrayList<int> getippteZahlen = new ArrayList<int>();
  ArrayList<int> gezogeneZahlen = new ArrayList<int>();

  public void tippen(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6) {
    getippteZahlen.clear();
    getippteZahlen.add(zahl1);
    getippteZahlen.add(zahl2);
    getippteZahlen.add(zahl3);
    getippteZahlen.add(zahl4);
    getippteZahlen.add(zahl5);
    getippteZahlen.add(zahl6);
    System.out.println(getippteZahlen);
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

  public void tippÜberprüfen() {
    int counter = 0;
    for(int i = 0; i < getippteZahlen.size(); i++) {
      if(gezogeneZahlen.contains(getippteZahlen.get(i))) {
        counter++;
      }
    }
    System.out.println("Anzahl der richtigen: " + counter);
  }


  public void quickStart(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6) {
    tippen(zahl1, zahl2, zahl3, zahl4, zahl5, zahl6);
    zahlenZiehen();
    tippÜberprüfen();
  }
}
