import java.util.ArrayList;
public class Syntax {
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(2)); //O(1)
        list.remove(2); //O(n)
        System.out.println(list);
        list.set(2,10);
        System.out.println(list);
        System.out.println(list.contains(5));
    }
    
}
