public class AverageMarksThread extends Thread {
    private Student student;

    public AverageMarksThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        double total = student.getCSEMarks()
                + student.getEEEMarks()
                + student.getBBAMarks();

        double average = total / 3.0;

        String letterGrade;
        double gradePoint;

        if (average >= 90 && average <= 100) {
            letterGrade = "A+";
            gradePoint = 4.00;
        } else if (average >= 85) {
            letterGrade = "A";
            gradePoint = 3.75;
        } else if (average >= 80) {
            letterGrade = "B+";
            gradePoint = 3.50;
        } else if (average >= 75) {
            letterGrade = "B";
            gradePoint = 3.25;
        } else if (average >= 70) {
            letterGrade = "C+";
            gradePoint = 3.00;
        } else if (average >= 65) {
            letterGrade = "C";
            gradePoint = 2.75;
        } else if (average >= 60) {
            letterGrade = "D+";
            gradePoint = 2.50;
        } else if (average >= 50) {
            letterGrade = "D";
            gradePoint = 2.25;
        } else {
            letterGrade = "F";
            gradePoint = 0.00;
        }

        System.out.println("Average Marks of the student");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.printf("Grade Point: %.2f%n", gradePoint);
    }
}