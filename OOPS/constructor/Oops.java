public class Oops {
    public static void main(String args[]) {
        // Create an object of Student class
        Student s1 = new Student("John");
        
        // Print the name of the student
        System.out.println(s1.name);
    }
}

// Define the Student class
class Student {
    String name;
    int roll;

    // Parameterized constructor
    Student(String name) {
        this.name = name;
        System.out.println("Constructor is called, name set to: " + name);
    }
}
