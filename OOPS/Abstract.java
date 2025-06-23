public class Abstract {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.eat();
        h1.walk();
            
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 Legs");
    }
}