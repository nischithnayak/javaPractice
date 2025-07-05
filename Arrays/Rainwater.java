public class Rainwater {
    public static void main(String[] args) {
     int arr[]={4,2,0,6,3,2,5};
     System.out.println("Trapped Rain Water:"+trapRain(arr));
    }
    public static int trapRain(int arr[]){
        int n=arr.length;
        int res=0;
        int l=0,r=n-1;
        int lmax=arr[l], rmax=arr[r];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax, arr[l]);
                res+=lmax-arr[l];
            }
            else{
                r--;
                rmax=Math.max(rmax, arr[r]);
                res+=rmax-arr[r];
            }
        }
        return res;
    }
}
