import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;


public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 50000);
        Teacher melissa = new Teacher(2, "Melissa", 60000);
        Teacher brandon = new Teacher(3, "Brandon", 55000);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lizzy);
        teachers.add(melissa);
        teachers.add(brandon);

        
        Student tamara = new Student(1, "Tamara", 4);
        Student jake = new Student(2, "Jake", 12);
        Student john = new Student(3, "John", 5);
        List<Student> students = new ArrayList<>();
        students.add(tamara);
        students.add(jake);
        students.add(john);


        School lakeside = new School(teachers, students);
       

        Teacher megan = new Teacher(5, "Megan", 90000);

        lakeside.addTeacher(megan);
        
        tamara.payFees(5000);
        john.payFees(6000);

        
        System.out.println("Lakeside has earned $" + lakeside.getTotalMoneyEarned());

        System.out.println("-----Making Lakeside Pay A Salary-----");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Lakeside has spent for salary to " + lizzy.getName()
         + " and now has $" + lakeside.getTotalMoneyEarned());

         brandon.receiveSalary(brandon.getSalary());
         System.out.println("Lakeside has spent for salary to " + brandon.getName()
         + " and now has $" + lakeside.getTotalMoneyEarned());

         System.out.println(john);
         System.out.println(brandon);
    }
}