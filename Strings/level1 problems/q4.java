public class q4 {
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // NPE
    }

    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see abrupt stop
        handleException();
    }
}
