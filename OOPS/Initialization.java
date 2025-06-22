public class Initialization{
    public static void main(String []args){
        Student s1=new Student("Nischith Nayak");
        System.out.println(s1.name);
        
    }
}
class Student{
    int roll;
    String name;
    Student(String name){
       this.name=name;
    }
}



