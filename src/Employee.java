class Employee extends Person {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    // this is a constructor that takes 4 parameters(name,surname,salary,position),
    // the super class takes the first name,last name and salary and
    // which calculates the ID and when new data is entered there every time, the ID is taken away

    public Employee(String name, String surname,double salary,String position) {
        super(name,surname,salary);
        this.position = position;
        this.id = id_gen++;
    }

    //method overriding and additional information
    public String toString() {
        return super.toString() + "Salary: " + salary;
    }
    // This is getters and setters
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
    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary = salary;}
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}