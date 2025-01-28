package linkedlist.singlylinkedlist.studentrecordmanagement;

/**
 * Main class to test the Student Record Management system.
 */
public class StudentRecordManagement {
    public static void main(String[] args) {
        // Create the linked list object
        Student data = new Student();

        // Add sample student records
        data.addAtBeginning(new StudentNode(143, "Sanket", 20, "B"));
        data.addAtLast(new StudentNode(144, "Bhupendra", 21, "B+"));
        data.addAtLast(new StudentNode(145, "Uday", 22, "A"));
        data.addAtMiddle(new StudentNode(146, "Yogesh", 19, "A+"), 2);

        // Display all student records
        System.out.println("All Records:");
        data.displayAllRecord();

        // Search for a student by Roll Number
        data.searchNodeByRollNumber(144);

        // Update a student's grade
        data.updateGrade(145, "A+");

        // Delete a student record
        data.deleteNodeByRollNumber(146);

        // Display all records after deletion
        System.out.println("Records After Deletion:");
        data.displayAllRecord();
    }
}
