package oopFundamentals.inheritance;

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear); // Calls the constructor of the base class (oopFundamentals.inheritance.Bicycle)
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
