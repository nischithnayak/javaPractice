public class ShallowCopy {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Nischith";
        s1.roll=123;
        s1.password="Abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[0]=80;
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    marks[]=new int[3];
    this.name=s1.name;
    this.roll=s1.roll;
    this.marks=s1.marks;
}
Student(){
    marks=new int[3];
    System.out.println("Constructor is called..");
}
Student(String name){
    marks=new int[3];
    this.name=name;
}
Student(int roll){
    marks=new int[3];
    this.roll=roll;
}