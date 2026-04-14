public class App {

    // Method to calculate tax
    public static double calculateTax(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return income * 0.05;
        } else if (income <= 1000000) {
            return income * 0.2;
        } else {
            return income * 0.3;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Tax Calculator CI/CD Project Running...");

        // Keep app running (VERY IMPORTANT for Kubernetes)
        while (true) {
            Thread.sleep(10000);
        }
    }
}