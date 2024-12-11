public class BinaryCoeff {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = binaryCoeff(n, r);
        System.out.println("Binomial Coefficient: " + result);
    }  

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binaryCoeff(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNMR = factorial(n - r);
        return factN / (factR * factNMR);
    }
}
