import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
        System.out.println("✅ Student added successfully!");
    }

    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("⚠️ No students found.");
        } else {
            System.out.println("\n📋 Student List:");
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    public Student searchStudent(int rollNo) {
        for (Student s : studentList) {
            if (s.getRollNumber() == rollNo) {
                return s;
            }
        }
        return null;
    }

    public boolean deleteStudent(int rollNo) {
        Student s = searchStudent(rollNo);
        if (s != null) {
            studentList.remove(s);
            return true;
        }
        return false;
    }

    public boolean updateStudent(int rollNo, String name, String course, double marks) {
        Student s = searchStudent(rollNo);
        if (s != null) {
            s.setName(name);
            s.setCourse(course);
            s.setMarks(marks);
            return true;
        }
        return false;
    }
}
