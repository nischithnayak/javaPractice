public class Constructorcalling {
    public static void main(String[] args) {
        Mustang myHouse =new Mustang();
    }
}
abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor is called");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void walk(){
        System.out.println("Walks on 4 Legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}