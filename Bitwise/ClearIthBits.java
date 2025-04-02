public class ClearIthBits {
    public static int clearIthBit(int n, int i){
        int bitMask=(-1)<<i;
        return bitMask & n;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(15,2));
    }
}
