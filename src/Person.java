class Person implements Comparable<Person>, Payable {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private double paymentAmount;
    //This is a constructor that takes 3 parameters(name,surname,money)
    public Person(String name, String surname, double paymentAmount) {
        this.name = name;
        this.surname = surname;
        this.paymentAmount = paymentAmount;
        this.id = id_gen++;
    }
    // This is a method that compares Person their money by using Double.compare
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.paymentAmount, other.paymentAmount);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
    // This is getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getPaymentAmount() {
        return paymentAmount;
    }
}
