import java.util.ArrayList;
public class P5 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.add(list2);
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> currlist=list.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j));
            }
            System.out.println();
        }
        System.out.println(list);
    }
}
