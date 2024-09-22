
class Student {
    String name = "Tushar";

    // Constructor
    Student() {
        System.out.println("Calling constructor on its own during object creation...");
    }
}

public class A_Constructor_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
