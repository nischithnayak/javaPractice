import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Input a valid number.");
        }else{
            printFibonacci(n);
        }
    }
    public static void printFibonacci(int n){
        if(n==1){
            System.out.println(0);
            return;
        }
        long fib[]=new long[n];
        fib[0]=0;
        fib[1]=1;
        System.out.print(fib[0]+" "+fib[1]);
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
            System.out.print(" " +fib[i]);
        }
        
    }
}