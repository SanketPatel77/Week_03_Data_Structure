package linkedlist.singlylinkedlist.studentrecordmanagement;

/**
 * Represents the linked list for managing student records.
 * Contains methods for adding, deleting, searching, updating, and displaying student records.
 */
public class Student {
    private StudentNode head; // Head of the linked list

    // Add a new student at the beginning of the list
    public void addAtBeginning(StudentNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    // Add a new student at the end of the list
    public void addAtLast(StudentNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            StudentNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Add a new student at a specific position (1-based index)
    public void addAtMiddle(StudentNode newNode, int position) {
        if (position == 1) {
            addAtBeginning(newNode);
            return;
        }

        StudentNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Delete a student record by Roll Number
    public void deleteNodeByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Record with Roll Number " + rollNumber + " deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Record with Roll Number " + rollNumber + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Record with Roll Number " + rollNumber + " deleted.");
        }
    }

    // Search for a student record by Roll Number
    public void searchNodeByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student found:");
                System.out.println("Roll Number: " + temp.rollNumber);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade + "\n");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Update a student's grade by Roll Number
    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Display all student records
    public void displayAllRecord() {
        if (head == null) {
            System.out.println("No record found.");
            return;
        }

        StudentNode temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println("Node: " + i++);
            System.out.println("Roll Number: " + temp.rollNumber);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade + "\n");
            temp = temp.next;
        }
    }
}
