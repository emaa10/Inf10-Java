
public class card {
    private String vorderseite;
    private String rückseite;

    public card(String newVorderseite, String newRückseite) {
        vorderseite = newVorderseite;
        rückseite = newRückseite;
    }

    public String getTopPage() {
        return vorderseite;
    }

    public String getBottomPage() {
        return rückseite;
    }

    public void setVorderseite(String newVorderseite) {
        vorderseite = newVorderseite;
    }

    public void setRückseite(String newRückseite) {
        rückseite = newRückseite;
    }
    
}