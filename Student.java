public class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Monika";
        s.rollNo = 106;
        s.display();
    }
}
