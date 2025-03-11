import java.util.ArrayList;
public class BeautifulArrayGenerator {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }

    private static void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConquer(start, 2 * increment, res, n);
        divideConquer(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {
        BeautifulArrayGenerator generator = new BeautifulArrayGenerator();
        int n = 3;  // Example input
        System.out.println(generator.beautifulArray(n));
    }
}
