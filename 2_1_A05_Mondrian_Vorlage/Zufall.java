
/**
 * Klasse zur Erzeugung einer Zufallszahl.
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
import java.util.Random;
class Zufall
{
    Random zzgenerator;
    /**
     * Konstruktor für Objekte der Klasse Zufall
     */
    Zufall()
    {
        zzgenerator = new Random();
    }

    /**
     * Erzeugung einer zufälligen Ganzzahl aus dem Intervall [0, n[
     */
    int GanzzahlGeben(int n)
    {
        return zzgenerator.nextInt(n);
    }
}
