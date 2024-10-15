public class Basics {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("Black");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Yellow";
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newString){
        color=newString;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
