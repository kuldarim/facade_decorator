import java.util.Observable;

/**
 * Created by kuldarim on 21/11/15.
 */
public class Accelerator extends Observable {
    private String speed;

    public Accelerator() {
        this.speed = "0";
    }

    public void drive(String speed) {
        System.out.println("driving at " + speed);
        this.speed = speed;
        setChanged();
        notifyObservers(speed);
    }
}
