public class Student {
    private int rollNumber;
    private String name;
    private String course;
    private double marks;

    public Student(int rollNumber, String name, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Getters and Setters
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Course: " + course + ", Marks: " + marks;
    }
}
