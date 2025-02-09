import java.util.ArrayList;

public class P4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int idx1=1, idx2=3;
        list.add(5);
        list.add(55);
        list.add(8);
        list.add(10);
        list.add(15);
        System.out.println(list);
        Swap(list, idx1,idx2);
        System.out.println(list);

    }
    public static void Swap(ArrayList<Integer> list, int idx1,int idx2) {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
    }
}
