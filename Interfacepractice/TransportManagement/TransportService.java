package Interfacepractice.TransportManagement;

// RideRouteApp Main Class

// Demonstrates Polymorphism: uses Vehicle reference to point to different child objects.

public class TransportService {
    public static void main(String[] args) {
        // Polymorphic array of vehicles
        Vehicle[] vehicles = { new Car(), new Bike(), new AutoRickshaw() };

        double distance = 10.0; // 10 km ride
        double surge = 1.2;     // 20% surge pricing

        System.out.println("=== RideRoute Smart Transportation Booking System ===");
        for (Vehicle v : vehicles) {
            v.start(); // Polymorphic call

            // Downcast to FareCalculator to access calculateFare
            FareCalculator calc = (FareCalculator) v;

            double totalFare = calc.calculateFare(v.fare(), distance, surge);
            System.out.println(v.getClass().getSimpleName() + " → Speed: " + v.speed() + " km/h, Base Fare: ₹" 
                + v.fare() + ", Total Fare for " + distance + " km: ₹" + totalFare);
            System.out.println("---------------------------------------------------");
        }
    }
}