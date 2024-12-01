import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
      String str="geeksforgeeks";
      printDuplicateString(str);  
    }
    public static void printDuplicateString(String str){
        int n=str.length();
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        
        String sortedStr=new String(chars);
        
        for (int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && sortedStr.charAt(i)==sortedStr.charAt(i+1)){
                count ++;
                i++;
            }
            if(count>1){
                System.out.println(sortedStr.charAt(i)+", Count: "+count);
            }
        }
    }

}
