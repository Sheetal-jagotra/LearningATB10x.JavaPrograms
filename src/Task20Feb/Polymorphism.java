package Task20Feb;

public class Polymorphism {
    public static void main(String[] args) {
        Student s = new Student(15,67);
        s.marks();
        s.marks(78,98);

    }
}
class Student{
    int age;
    int roll_no;

    public Student(int age, int roll_no) {
        this.age = age;
        this.roll_no = roll_no;
    }

    void marks(){
        System.out.println("total marks of the student will be out of 100");;
    }
    void marks(int a,int b){
        System.out.println("marks of student a is 98");
        System.out.println("marks of student b is 87");
    }

}