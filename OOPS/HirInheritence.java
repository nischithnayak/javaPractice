public class HirInheritence {
    public static void main(String[] args) {
        Dog cat =new Dog();
        cat.breate();
        cat.eats();
        
        
    }
}
class Mamal{
    void breate(){
        System.out.println("Breaths");
    }
}
class Dog extends Mamal{
    void eats(){
        System.out.println("Eats");
    }
}
class Fish extends Mamal{
    void swims(){
        System.out.println("swims");
    }
}
