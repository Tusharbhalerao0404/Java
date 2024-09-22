class Student {
    String name;
    int marks;

    // Parameterized constructor
    Student(String fullname, int marks) {
        this.name = fullname;
        this.marks = marks;
        System.out.println("Calling constructor on its own during object creation...");
    }
}

public class A_Parameterized_Constructor_3  {
    public static void main(String[] args) {
        Student s1 = new Student("Rohan", 12);
        System.out.println(s1.name + " " + s1.marks);

        Student s2 = new Student("Mohan", 15);
        System.out.println(s2.name + " " + s2.marks);
    }
}
