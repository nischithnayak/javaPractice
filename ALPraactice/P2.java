import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(30);
        list.add(4);
        list.add(5);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=Math.max(list.get(i), max);
            }
        }
        System.out.println("Maximum:"+max);
    }
}
