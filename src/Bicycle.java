public class Bicycle {
    int gear;
    int speed;

    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int increment) {
        speed -= increment;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
