public class MethodOverload {
    public static void main(String[] args) {
        Add ans=new Add();
        System.out.println(ans.sum(1,2));
        System.out.println(ans.sum(1,2,3));
        System.out.println(ans.sum(1f,2.5f));
    }
}
class Add{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}