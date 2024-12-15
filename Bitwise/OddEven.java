public class OddEven{
    public static void main(String[] args) {
        OddEven(5);
        OddEven(4);
    }
    public static void OddEven(int n){
        if((n&1)==0){
            System.out.println("Even");
            
        }else{
            System.out.println("Odd");
        }
    }
}