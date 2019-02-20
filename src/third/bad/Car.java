package third.bad;

public class Car extends Vehicle implements SwitchCamera, SwitchRadio {

    @Override
    public void turnRadioOn() {
        System.out.println("yes");
    }

    @Override
    public void turnRadioOff() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOn() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOff() {
        System.out.println("yes");
    }
}
