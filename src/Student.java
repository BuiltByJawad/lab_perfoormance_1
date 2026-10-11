public class Student {
    private int id;
    private String name;
    private Department department;
    private double CSEMarks;
    private double EEEMarks;
    private double BBAMarks;

    public Student(int id, String name, Department department,
                   double CSEMarks, double EEEMarks,
                   double BBAMarks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.CSEMarks = CSEMarks;
        this.EEEMarks = EEEMarks;
        this.BBAMarks = BBAMarks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public double getCSEMarks() {
        return CSEMarks;
    }

    public double getEEEMarks() {
        return EEEMarks;
    }

    public double getBBAMarks() {
        return BBAMarks;
    }
}