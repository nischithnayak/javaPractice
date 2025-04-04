public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(powerOf2(10));
        System.out.println(powerOf2(16));
        System.out.println(powerOf2(9));
    }
    public static boolean powerOf2(int n){
        return (n &(n-1))==0;
    }
}
