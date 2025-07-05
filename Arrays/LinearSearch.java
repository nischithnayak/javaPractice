public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,3,45,8,6};
        int key=5;
        System.out.println(linearSearch(arr, key));
        
    }
    public static int linearSearch(int arr[],int key){
        int i=0;
        while (i<arr.length) {
            if(arr[i]==key){
                return i;
            }
            i++;
        }
        return -1;
    }
}
