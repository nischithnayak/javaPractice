public class MultipleInheritence {
    public static void main(String[] args) {
        Bear b1=new Bear();
        b1.eatsAnimals();
        b1.eatsPlants();
    }
}
interface Herbivorous {
    void eatsPlants();
}
 interface Carnivorous   {

    void eatsAnimals();
}
class Bear implements Herbivorous, Carnivorous{
    public void eatsPlants(){
        System.out.println("Bear eats Plants");
    }
    public void eatsAnimals(){
        System.out.println("Bear eats Animals");
    }
}
