import java.util.ArrayList;

public class P11 {
    public static void main(String[] args) {
          ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(findLonely(list));
    }
    public  ArrayList<Integer> findLonely(ArrayList<Integer> list){
       Collections.sort(nums);
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=1;i<list.size()-1;i++){
         if(list.get(i-1)+1<list.get(i)&& list.get(i)+1<list.get(i+1)){
            list.add(nums.get(i));
         }
       }
       if(list.size()==1){
         list.
       }
    }
}
