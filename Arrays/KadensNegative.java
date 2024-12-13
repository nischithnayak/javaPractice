public class KadensNegative {
   public static void main(String[] args) {
    int nums[]={-2,-3,-1,-2,-2};
    kadensNegative(nums);
   } 
   public static void kadensNegative(int nums[]){
    int currSum=nums[0];
    int maxSum=nums[0];
    for(int i=1;i<nums.length;i++){
        currSum=Math.max(nums[i],currSum+nums[i]);
        maxSum=Math.max(currSum,maxSum);
    }
    System.out.println("MaxSum:"+maxSum);
   }
}
