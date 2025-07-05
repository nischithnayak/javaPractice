public class BinToDec {
    public static void main(String[] args) {
        
        System.out.println(binToDecimal(1111));
    }
    public static int binToDecimal(int binNum){
        int dec=0;
        int pow=0;
        while(binNum>0){
            int lastDig=binNum%10;
            dec=dec+lastDig*(int)Math.pow(2,pow);
            pow++;
            binNum/=10;
        }
        return dec;
    }
}
