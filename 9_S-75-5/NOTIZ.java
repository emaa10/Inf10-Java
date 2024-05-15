public class NOTIZ{
    String inhalt;
    int priority;
    int erstellungsZeitpunk;

    public NOTIZ(String ninhalt, int nPrio) {
        inhalt = ninhalt;
        priority = nPrio;
        erstellungsZeitpunk = 0;
    }

    public String inhaltGeben() {
        return inhalt;
    }

    public long erstellungsZeitpunkGeben() {
        return erstellungsZeitpunk;
    }

    public int priorityGeben() {
        return priority;
    }
}