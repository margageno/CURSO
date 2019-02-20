package third.bad;

public class Drone extends Vehicle implements SwitchCamera {

    @Override
    public void turnCameraOn() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOff() {
        System.out.println("yes");
    }
}
