class Student {
    String studentName;
    int registerNumber;
    int[] marks = new int[5];
    int total;
    double average;

    public Student(String studentName, int registerNumber, int[] marks) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    private void calculateTotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 5.0;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92};
        Student student = new Student("John", 12345, marks);
        student.displayDetails();
    }
}
