public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,8,9};
        int key=1;
        System.out.println(binarySearch(arr,key));
    }
    public static int binarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
