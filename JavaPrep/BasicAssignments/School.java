package basicAssignment;

import java.util.Scanner;

class Subject 
{
	    String name;
	    int marks;

	    public Subject(String name) 
	    {
	        this.name = name;
	        this.marks = 0;
	    }
}

class Student 
{
	    String name;
	    String rollNumber;
	    Subject[] subjects;

	    public Student(String name, String rollNumber) 
	    {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.subjects = new Subject[]{new Subject("Maths"), new Subject("English")};
	    }
}

class Teacher 
{
	    Scanner scanner = new Scanner(System.in);

	    void setMarks(Student student, int subjectIndex, int marks) 
	    {
	        student.subjects[subjectIndex].marks = marks;
	    }

	    double calculateAverage(Student student) 
	    {
	        int totalMarks = 0;
	        for (Subject subj : student.subjects) 
	        {
	            totalMarks += subj.marks;
	        }
	        return (double) totalMarks / student.subjects.length;
	    }

	    void findMaxMin(Student student) 
	    {
	        int maxMarks = Integer.MIN_VALUE;
	        int minMarks = Integer.MAX_VALUE;

	        for (Subject subj : student.subjects) 
	        {
	            maxMarks = Math.max(maxMarks, subj.marks);
	            minMarks = Math.min(minMarks, subj.marks);
	        }

	        System.out.println("Max marks for " + student.name + ": " + maxMarks);
	        System.out.println("Min marks for " + student.name + ": " + minMarks);
	    }
}

public class School 
{
		public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        Teacher teacher = new Teacher();
	        Student[] students = new Student[10];

	        for (int i = 0; i < 10; i++) 
	        {
	            String studentName = "Student" + (i + 1);
	            String rollNumber = "Roll" + (i + 1);
	            students[i] = new Student(studentName, rollNumber);
	        }

	        for (Student student : students) 
	        {
	        	for (int subjIndex = 0; subjIndex < student.subjects.length; subjIndex++) {
	                System.out.print("Enter marks for " + student.name + " in " + student.subjects[subjIndex].name + ": ");
	                int marks = scanner.nextInt();
	                teacher.setMarks(student, subjIndex, marks);
	            }
	        }

	        while (true) 
	        {
	            System.out.println("\nTeacher Menu:");
	            System.out.println("a> Find average of marks");
	            System.out.println("b> Find Max and Min marks");
	            System.out.println("q> Quit");

	            String choice = scanner.next();

	            if (choice.equals("a")) 
	            {
	                for (Student student : students) 
	                {
	                    double average = teacher.calculateAverage(student);
	                    System.out.println("Average marks for " + student.name + ": " + average);
	                }
	            } 
	            else if (choice.equals("b")) 
	            {
	                for (Student student : students) 
	                {
	                    teacher.findMaxMin(student);
	                }
	            } 
	            else if (choice.equals("q")) 
	            {
	                System.out.println("Exiting...");
	                break;
	            } 
	            else 
	            {
	                System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }
	        scanner.close();
	   }
}


