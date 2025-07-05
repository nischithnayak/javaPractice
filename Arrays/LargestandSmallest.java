public class LargestandSmallest {
    public static void main(String[] args) {
        int arr[]={1,500,2,3,-5};
        System.out.println("Greatest:"+getLargest(arr));
        System.out.println("Smallest:"+getSmallest(arr));
    }
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
        public static int getSmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
}
