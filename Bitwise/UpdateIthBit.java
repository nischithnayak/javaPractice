public class UpdateIthBit {
    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return clearBit(n, i);
        }else{
            return setIthBit( n, i);
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return bitMask | n;
    }
    public static int clearBit(int n,int i){
        int bitMask=~(1<<i);
        return bitMask & n;
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
        System.out.println(UpdateIthBit(10,2,0));
    }
}
