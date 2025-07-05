public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
         System.out.println(checkPalindrome(231132));
    }
    public static boolean checkPalindrome(int n){
        int ans=0;
        int num=n;
        while(n!=0){
            int lastDig=n%10;
            ans=ans*10 +lastDig;
            n/=10;
        }
        if(num==ans){
            return true;
        }
return false;
    }
}

