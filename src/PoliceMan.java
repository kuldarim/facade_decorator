import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

/**
 * Created by kuldarim on 21/11/15.
 */
public class PoliceMan implements Observer {

    private Timer timer;

    public PoliceMan(Timer timer){
        this.timer = timer;
    }

    @Override
    public void update(Observable o, Object arg) {
        int speed = Integer.parseInt((String) arg);
        if (speed <= 80) {
            System.out.println("Your speed is under limits " + speed);
        } else {
            System.out.println("Your should stop now ! " + speed);
            timer.cancel();
        }

    }
}
