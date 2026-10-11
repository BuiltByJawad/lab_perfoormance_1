public class TotalMarksThread extends Thread {
    private Student student;

    public TotalMarksThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        double total = student.getCSEMarks()
                + student.getEEEMarks()
                + student.getBBAMarks();

        System.out.println("Total marks of the student");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Total Marks: " + total);
    }
}