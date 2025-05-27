public class Main {
    public static void main(String[] args) {
        // Creating the first student object
        Student s1 = new Student();
        s1.name = "Shradha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Using the shallow copy constructor to create s2 as a copy of s1
        Student s2 = new Student(s1); // Shallow copy
        s2.password = "xyz"; // Change password of s2

        // Print marks of s2 to verify shallow copy effect
        System.out.println("Shallow Copy:");
        for (int i = 0; i < 3; i++) {
            System.out.println("s2.marks[" + i + "] = " + s2.marks[i]);
        }

        // Changing s1's marks[2] to check if it affects s2
        s1.marks[2] = 100;

        System.out.println("\nAfter modifying s1's marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println("s2.marks[" + i + "] = " + s2.marks[i]);
        }

        // Using the deep copy constructor to create s3 as a deep copy of s1
        Student s3 = new Student(s1, true); // Deep copy
        s3.password = "abc123"; // Change password of s3

        // Changing s1's marks[2] again to check if it affects s3
        s1.marks[2] = 50;

        System.out.println("\nDeep Copy:");
        for (int i = 0; i < 3; i++) {
            System.out.println("s3.marks[" + i + "] = " + s3.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks = new int[3]; // Initialize marks array

    // Constructor to create a shallow copy
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        this.marks = s1.marks; // Shallow copy (references same marks array)
    }

    // Constructor to create a deep copy
    Student(Student s1, boolean deepCopy) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        if (deepCopy) {
            this.marks = new int[3]; // Allocate new array for deep copy
            for (int i = 0; i < s1.marks.length; i++) {
                this.marks[i] = s1.marks[i]; // Deep copy of marks
            }
        } else {
            this.marks = s1.marks; // Shallow copy
        }
    }

    // Default constructor
    Student() {
        System.out.println("Constructor is called...");
    }
}
