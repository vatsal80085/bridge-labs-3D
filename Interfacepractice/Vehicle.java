package Interfacepractice;

// FareCalculator Interface

// Demonstrates Interface usage for dynamic pricing logic.
interface FareCalculator {
    double calculateFare(double baseFare, double distanceKm, double surgeMultiplier);
}

// Abstract Class Vehicle

// Demonstrates Abstraction & Inheritance: defines common vehicle behavior.
public abstract class Vehicle {
    abstract int speed();   // must be implemented by all vehicles
    abstract int fare();    // base fare
    abstract void start();  // start message
}

// Car Class

// Demonstrates Polymorphism: overrides abstract methods & custom fare logic.
class Car extends Vehicle implements FareCalculator {
    @Override
    void start() {
        System.out.println("Car is a four-wheeler vehicle. Starting engine...");
    }

    @Override
    int speed() {
        return 80; // km/h
    }

    @Override
    int fare() {
        return 50; // base fare in ₹
    }

    @Override
    public double calculateFare(double baseFare, double distanceKm, double surgeMultiplier) {
        // fare = base + distance*rate * surge
        double ratePerKm = 12;
        return baseFare + (distanceKm * ratePerKm * surgeMultiplier);
    }
}

// --------------------
// Bike Class
// --------------------
class Bike extends Vehicle implements FareCalculator {
    @Override
    void start() {
        System.out.println("Bike is a two-wheeler vehicle. Kick-starting...");
    }

    @Override
    int speed() {
        return 60;
    }

    @Override
    int fare() {
        return 20;
    }

    @Override
    public double calculateFare(double baseFare, double distanceKm, double surgeMultiplier) {
        double ratePerKm = 6;
        return baseFare + (distanceKm * ratePerKm * surgeMultiplier);
    }
}

// --------------------
// AutoRickshaw Class
// --------------------
class AutoRickshaw extends Vehicle implements FareCalculator {
    @Override
    void start() {
        System.out.println("Auto-rickshaw is a three-wheeler vehicle. Ready to ride!");
    }

    @Override
    int speed() {
        return 50;
    }

    @Override
    int fare() {
        return 30;
    }

    @Override
    public double calculateFare(double baseFare, double distanceKm, double surgeMultiplier) {
        double ratePerKm = 8;
        return baseFare + (distanceKm * ratePerKm * surgeMultiplier);
    }
}

// 1. RideRoute – Smart Transportation Booking System

// Story: A city transport app lets users book bikes, cars, or auto-rickshaws. Each vehicle type has different fare calculations and ride rules. The developer uses:

// ● An abstract class Vehicle with common properties (speed, fare).
// ● Separate child classes (Bike, Car, Auto) that implement their own fare logic using
// overridden methods.
// ● A FareCalculator interface for dynamic pricing algorithms.

// Focus Concepts:
// ● Inheritance
// ● Abstraction
// ● Interfaces
// ● Polymorphism
// ● Sequence diagram to show User → App → Vehicle → Fare flow
