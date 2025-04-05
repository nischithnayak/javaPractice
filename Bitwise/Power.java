public class Power {
    public static void main(String args[] ){
        System.out.println(power(5,3));
        System.out.println(power(2,3));
    }
    public static int power(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=a*ans;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
}
