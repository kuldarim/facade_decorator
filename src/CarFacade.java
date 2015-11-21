/**
 * Created by kuldarim on 21/11/15.
 */
public class CarFacade {
    private Engine engine;
    private Window window;
    private SteeringWheel steeringWheel;
    private Brake brake;
    private Accelerator accelerator;

    public CarFacade() {
        this.engine = new Engine();
        this.window = new Window();
        this.steeringWheel = new SteeringWheel();
        this.brake = new Brake();
        this.accelerator = new Accelerator();
    }

    public void drive() {
        engine.start();
        window.open("Driver");
        window.open("Passenger");
        accelerator.drive("90 km/h");
        window.close("Passenger");
        steeringWheel.turn("left");
        brake.stop();
        engine.stop();
    }
}
