
public class Lampe
{
    
    public boolean status;
    
    public Lampe(boolean newStatus) {
        status = newStatus;
    }


    public void statusSetzen(boolean newStatus) {
        status = newStatus;
    }
    public boolean statusGeben() {
        return status;
    }
}
