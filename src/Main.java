import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        simulateFacade();

        simulateObserver();
    }

    public static void simulateFacade() {
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("**********    Facade pattern   ***************");
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("______________________________________________");
        CarFacade car = new CarFacade();
        car.drive();
        System.out.println("\n\n\n");
    }

    public static void simulateObserver() {
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("**********    Observer pattern   *************");
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("______________________________________________");
        Timer timer = new Timer();
        Random rn = new Random();
        PoliceMan policeMan = new PoliceMan(timer);
        Accelerator a = new Accelerator();
        a.addObserver(policeMan);

        // Set timer to simulate the speed change of the accelerator
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                a.drive(String.valueOf(rn.nextInt(100)));
            }
        }, 200, 200);
    }
}
