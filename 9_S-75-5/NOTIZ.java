public class NOTIZ{
    String inhalt;
    int priority;
    int erstellungsZeitpunk;

    public NOTIZ(String ninhalt, int nPrio) {
        inhalt = ninhalt;
        priority = nPrio;
        // erstellungsZeitpunk = time.now();
    }

    public String inhaltGeben() {
        return inhalt;
    }

    // public 

    public int priorityGeben() {
        return priority;
    }
}