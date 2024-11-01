public class Constructor {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Nischith");
        Student s3=new Student(123);
        Student s4=new Student(s2);

    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Nischith");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
    Student(Student original){
        this.name=original.name;
        this.roll=original.roll;
    }
}