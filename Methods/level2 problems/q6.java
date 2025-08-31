public class q6 {
    public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFarhenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKg(double p) { return p * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }

    public static void main(String[] args) {
        System.out.println("32°F = " + convertFarhenheitToCelsius(32) + " °C");
        System.out.println("0°C = " + convertCelsiusToFarhenheit(0) + " °F");
        System.out.println("10 pounds = " + convertPoundsToKg(10) + " kg");
        System.out.println("10 kg = " + convertKgToPounds(10) + " pounds");
        System.out.println("5 gallons = " + convertGallonsToLiters(5) + " liters");
        System.out.println("5 liters = " + convertLitersToGallons(5) + " gallons");
    }
}
