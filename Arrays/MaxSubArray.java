public class MaxSubArray {
    public static void main(String[] args) {
        int arr[]={-2,-5,1,8};
        int maxSum=arr[0];
        int currSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
}
