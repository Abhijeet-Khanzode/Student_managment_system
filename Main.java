import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sms.addStudent(new Student(roll, name, course, marks));
                    break;

                case 2:
                    sms.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll No: ");
                    int searchRoll = sc.nextInt();
                    Student found = sms.searchStudent(searchRoll);
                    if (found != null) {
                        System.out.println("✅ Student Found: " + found);
                    } else {
                        System.out.println("❌ Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to update: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();
                    boolean updated = sms.updateStudent(updateRoll, newName, newCourse, newMarks);
                    if (updated) {
                        System.out.println("✅ Student Updated Successfully!");
                    } else {
                        System.out.println("❌ Student Not Found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRoll = sc.nextInt();
                    boolean deleted = sms.deleteStudent(deleteRoll);
                    if (deleted) {
                        System.out.println("✅ Student Deleted Successfully!");
                    } else {
                        System.out.println("❌ Student Not Found.");
                    }
                    break;

                case 6:
                    System.out.println("👋 Exiting System. Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("⚠️ Invalid Choice. Try again.");
            }
        }
    }
}
