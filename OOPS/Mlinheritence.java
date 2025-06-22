public class Mlinheritence {
    public static void main(String[] args) {
        Dog duggu = new Dog();
        duggu.setColor();
        duggu.legs(4);
     
    }
}
class Animal{
        String color;
         void setColor(){
            System.out.println("Black");
         }
}
class Dog extends Animal{
    void legs(int leg){
        System.out.println("legs:"+leg);
    }
    
}
