class Student extends Person {
    private static int id_gen = 1;
    private String name;
    private String surname;
    private int id;
    private double gpa;

    public Student(String name, double stipend, double gpa) {
        super(name, "", gpa > 2.67 ? stipend : 0.0);
        this.gpa = gpa;
        this.id = id_gen++;
    }

    @Override
    public String toString() {
        return super.toString() + "GPA: " + gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
