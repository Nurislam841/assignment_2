class Student extends Person {
    private static int id_gen = 1;
    private String name;
    private String surname;
    private int id;
    private double gpa;
    // this is a constructor that takes 4 parameters(name,surname,stipend,gpa),
    // the super class takes the first name,last name,stipend and gpa
    // which calculates the ID and when new data is entered there every time, the ID is taken away

    public Student(String name,String surname, double stipend, double gpa) {
        super(name,surname , gpa > 2.67 ? stipend : 0.0);
        this.gpa = gpa;
        this.id = id_gen++;
    }
    //method overriding and additional information
    @Override
    public String toString() {
        return super.toString() + "GPA: " + gpa;
    }
    //  This is getters and setters
    public String getName() {
        return name;
    }
    public void setName(String surname) {
        this.name = surname;
    }
    public String getSurname() {
        return name;
    }
    public void setSurname(String surname) {
        this.name = surname;
    }
    public int getId(){return id; }
    public void setId(int id) {
        this.id = id;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
