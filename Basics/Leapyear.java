public class Leapyear {
    public static void main(String[] args) {
        System.out.println(Leapyear(2004));
    }    
    public static boolean Leapyear(int year){
        boolean x=year % 4 ==0;
        boolean y=(year %1000)!=0;
        boolean z=((year%100)==0 && (year %400 ==0));
        if(x& (y || z)){
            return true;
        }
        return false;
    }
}
