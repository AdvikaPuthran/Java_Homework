package inheritanceAssignment;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("Advika", 21, "A+");

        student.speak(); // Call the speak method from the Person class
        student.study(); // Call the study method from the Student class
    }
}
