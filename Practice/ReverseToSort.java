public class ReverseToSort {
    public static boolean canBeSorted(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;
        while(l<n-1 && arr[l+1]>arr[l]){
            l++;
        }
        if(n-1==l)
        {
            return false ;
        }
        while(r>0 && arr[r-1]<arr[r]){
            r--;
        }
        reverse(arr, l,r);
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }else{
                System.out.print(arr[i]);
            }
        }
        
        return true;
    }
    public static void reverse(int arr[],int start,int end){
            int temp=arr[end];
            arr[end--]=arr[start];
            arr[start++]=temp;
        }
        
    public static void main(String[] args) {
        int arr1[]={1,2,5,4,3,6,7};
        System.out.println(canBeSorted(arr1));
    }
}
