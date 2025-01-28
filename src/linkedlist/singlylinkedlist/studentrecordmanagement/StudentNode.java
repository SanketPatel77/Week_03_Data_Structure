package linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentNode {
    public int rollNumber;
    public String name;
    public int age;
    public String grade;
    public StudentNode next;

    // Constructor
    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
