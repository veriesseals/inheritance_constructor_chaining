public class Main {

    public static void main(String[] args) {
        Car gt = new Car("Ford", "GT", "Black");

        // Method accessed from the Vehicle class
        // -----------------------------------------------------
        gt.accelerate();
        System.out.println(gt.model + " running at " + gt.getSpeed() + " miles per hour.");

        // Create a Car object using the parameterized constructor
        Car tesla = new Car("Tesla", "Model S", "Red");

        // Use inherited methods
        tesla.accelerate();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.turn("right");


        tesla.brake();
        System.out.println(tesla.model + " running at " + tesla.getSpeed() + " miles per hour.");

        tesla.adjustSeat(2);


    }
}
