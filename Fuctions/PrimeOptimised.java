class PrimeOptimised{
    public static void main(String[] args) {
        System.out.println(isPrimeOrNot(10));
        System.out.println(isPrimeOrNot(5));
    }
    public static boolean isPrimeOrNot(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false ;
            }
        }
        return true;
    }
}