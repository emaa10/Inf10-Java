import java.util.Random;

public class karte {
    private String vorderseite;
    private String rückseite;

    public karte(String newVorderseite, String newRückseite) {
        vorderseite = newVorderseite;
        rückseite = newRückseite;
    }

    public String getVorderseite() {
        return vorderseite;
    }

    public String getRückseite() {
        return rückseite;
    }

    public void setVorderseite(String newVorderseite) {
        vorderseite = newVorderseite;
    }

    public void setRückseite(String newRückseite) {
        rückseite = newRückseite;
    }
    
    public void randomNumber() {
        Random generator;
        generator = new Random();
        int test = generator.nextInt(4) - 1;
        System.out.println(test);
    }
}