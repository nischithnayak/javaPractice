public class MethodOverride {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
        Animal a=new Animal();
        a.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
