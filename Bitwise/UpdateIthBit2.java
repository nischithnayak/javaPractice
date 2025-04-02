public class UpdateIthBit2 {
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i, int newBit){
        int num=clearIthBit(n, i);
        int bitMask=newBit<<i;
        return num|bitMask;
    }
    public static void main(String[] args) {
     System.out.println(updateIthBit(10, 2, 0)); 
     System.out.println(updateIthBit(10, 2, 1)); 
    }
}
