import java.util.Scanner;
class Student{
    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== Student Management System =============");
        Student s1 = new Student(101, "Utkarsh", 19, "BCA");
        System.out.println("ID: " +s1.id);
        System.out.println("Name: " +s1.name);
        System.out.println("Age: " +s1.age);
        System.out.println("Course: " +s1.course);
    }
}