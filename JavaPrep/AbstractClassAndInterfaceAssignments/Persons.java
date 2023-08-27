package abstractClassAndInterfaceAssignment;

interface Person {
    void speak();
}

class Student implements Person {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Student " + name + " speaks: Hello, I'm a student.");
    }
}

class Teacher implements Person {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Teacher " + name + " speaks: Good day, I'm a teacher.");
    }
}

public class Persons {
    public static void main(String[] args) {
        Student student = new Student("Advika");
        Teacher teacher = new Teacher("Mamta Madam");

        student.speak(); // Call the speak method from the Student class
        teacher.speak(); // Call the speak method from the Teacher class
    }
}
