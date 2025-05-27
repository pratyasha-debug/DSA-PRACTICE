public class OOPS {
    public static void main(String args[]) {
        // Creating the first student object
        Student s1 = new Student();
        s1.name = "Shradha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Using the copy constructor to create s2 as a copy of s1
        Student s2 = new Student(s1);

        // Changing the password for s2
        s2.password = "xyz";

        // Print marks of s2 to verify deep copy
        for (int i = 0; i < 3; i++) {
            System.out.println("s2.marks[" + i + "] = " + s2.marks[i]);
        }

        // Changing s1's marks[2] to check if it affects s2
        s1.marks[2] = 100;
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // Default constructor
    Student() {
        marks = new int[3];  // Initializing array to hold marks
        System.out.println("Constructor is called...");
    }

    // Parameterized constructor
    Student(String name) {
        marks = new int[3];  // Initializing array to hold marks
        this.name = name;
    }

    // Another parameterized constructor
    Student(int roll) {
        marks = new int[3];  // Initializing array to hold marks
        this.roll = roll;
    }

    // Copy constructor (deep copy)
    Student(Student s1) {
        marks = new int[3];  // Allocate a new array for deep copy
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;

        // Deep copy of marks array
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
