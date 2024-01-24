class Person implements Comparable<Person>, Payable {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private double paymentAmount;

    public Person(String name, String surname, double paymentAmount) {
        this.name = name;
        this.surname = surname;
        this.paymentAmount = paymentAmount;
        this.id = id_gen++;
    }

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
