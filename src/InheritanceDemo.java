public class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);

        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        System.out.println("Bike speed is: " + mountainBike.speed);

        mountainBike.applyBrake(1); // Method inherited from Bicycle
        System.out.println("Bike speed after applying break is: " + mountainBike.speed);

        mountainBike.speedUp(5); // Method inherited from Bicycle
        System.out.println("Bike speed after speeding up is: " + mountainBike.speed);
    }
}
