public class ClearIthBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return bitMask&n;
    }
}
