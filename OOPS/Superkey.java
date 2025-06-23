public class Superkey {
    public static void main(String[] args) {
        Horse h1=new Horse();
    }
}
class Animal {
    Animal(){
        System.out.println("Animal constuctor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called");
        
    }
}