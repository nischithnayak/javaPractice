public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sumofDigi(12365));
        System.out.println(sumofDigi(12));
        System.out.println(sumofDigi(1));

    }
    public static int sumofDigi(int n){
        int ans=0;
        while(n!=0){
            int lastDig=n%10;
            ans+=lastDig;
            n/=10;
        }
        return ans;
    }
}
