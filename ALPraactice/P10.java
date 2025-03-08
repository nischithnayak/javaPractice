import java.util.ArrayList;

public class P10 {
    public static void main(String[] args) {
          ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        int target=3;
        System.out.println(pairSum(list, target));
    }
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int bp=-1,n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(rp+n-1)%n;
            }
        }
        return false;
    }
}
