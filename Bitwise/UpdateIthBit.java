public class UpdateIthBit {
<<<<<<< HEAD
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
=======
    public static int UpdateIthBit(int b, int i, int newBit){
        if(newBit==0){
            return clearBit(int n, int i);
        }else{
            return 
        }
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(12,2,1));
>>>>>>> d9b088f0df8ecd2bf267617451e9b5eb8ae46ee1
    }
}
