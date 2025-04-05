public class Swap {
    public static void main(String[] args) {
        swap(5, 2);
        swap(125, 2);
    }

    public static void swap(int x, int y) {
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
        System.out.println("Swapped values: x = " + x + ", y = " + y);
    }
}
