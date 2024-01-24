class Employee extends Person {
    private static int id_gen = 1;
    private int id;
    private String position;
    private double salary;
    public Employee(String name, double salary) {
        super(name, "", salary);
        this.id = id_gen++;
    }
    public Employee(String name, String surname, double salary) {
        super(name, surname, salary);
        this.id = id_gen++;
    }

    public Employee(String name, String surname, double salary, String position) {
        super(name, surname, salary);
        this.position = position;
        this.id = id_gen++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + getPaymentAmount() +
                '}';
    }

    public String toString(int id, String name, String surname) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        return "Employee: " + id + ". " + name  + " " + surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}