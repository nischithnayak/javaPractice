public class Inheritence {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.breath();
        shark.eat();
        shark.swims();
    }
}
class Animal{
    void breath(){
        System.out.println("Breaths");
    }
    void eat(){
        System.out.println("Eats");
    }
}
class Fish extends Animal{
    void swims(){
        System.out.println("Fish swims");
    }
}
