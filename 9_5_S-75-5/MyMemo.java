import java.util.ArrayList;



public class MyMemo {
    private ArrayList<NOTIZ> notizen;

    public MyMemo() {
        notizen = new ArrayList<NOTIZ>();
    }

    public void notizenHinzufügen(NOTIZ notizNeu) {
        notizen.add(notizNeu);
    }

    public void alleAusgeben1() {
        for (NOTIZ n : notizen) {
            System.out.println(n.erstellungsZeitpunkGeben() + " - " + n.priorityGeben() + " - " + n.inhaltGeben());
        }
    }
}
