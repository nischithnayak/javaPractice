public class DecToBin {
    public static void main(String[] args) {
        System.out.println(decTobin(5));
    }
    public static int decTobin(int dec){
        int binNum=0;
        int pow=0;
        while(dec>0){
            int lastDig=dec%2;
            binNum=binNum+lastDig*(int)Math.pow(10,pow);
            pow++;
            dec/=2;
        }
        return binNum;
    }
}
