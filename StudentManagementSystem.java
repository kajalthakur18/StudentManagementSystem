import java.util.Scanner;
import java.util.ArrayList;
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
        ArrayList<Student> students = new ArrayList<>();
        int choice = 0;

        while(choice !=6){
        System.out.println("======== Student Management System =============");
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
       System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1){
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Student Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Course: ");
            String course = sc.nextLine();
            Student s = new Student(id, name, age, course);
            students.add(s);
            System.out.println("Student Added Successfully!");
        }
        if (choice == 2){
            for(Student s : students){
                System.out.println("ID: " +s.id);
                System.out.println("Name: " +s.name);
                System.out.println("Age: " +s.age);
                System.out.println("Course: " +s.course);
                System.out.println("----------------------------");
        }
        }
        if (choice == 3){
            System.out.println("Enter Student ID to Search: ");
            int id = sc.nextInt();
            boolean found = false;
            for(Student s : students){
                if(s.id == id){
                    System.out.println("ID: " +s.id);
                    System.out.println("Name: " +s.name);
                    System.out.println("Age: " +s.age);
                    System.out.println("Course: " +s.course);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Student Not Found!");
            }
        }
        if (choice == 4){
            System.out.println("Enter Student ID to Update: ");
            int updatedId = sc.nextInt();
            boolean found = false;
            for(Student s : students){
                if(s.id == updatedId){
                    System.out.println("Enter New Name: ");
                    s.name = sc.next();
                    System.out.println("Enter New Age: ");
                    s.age = sc.nextInt();
                    System.out.println("Enter New Course: ");
                    s.course = sc.next();
                    System.out.println("Student Updated Successfully!");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Student Not Found!");
            }
        }
        if (choice == 5){
            System.out.println("Enter Student ID to Delete: ");
            int deletedId = sc.nextInt();
            boolean found = false;
            for(Student s : students){
                if(s.id == deletedId){
                    students.remove(s);
                    System.out.println("Student Deleted Successfully!");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Student Not Found!");
            }
        }
        if (choice == 6){
            System.out.println("Thank you for using Student Management System!");
        }
    }
}
}