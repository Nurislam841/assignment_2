import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John Lennon", 27045.78));
        people.add(new Employee("George Harrison", 50000.00));
        people.add(new Student("Ringo Starr", 0.00, 2.5));
        people.add(new Student("Paul McCartney", 36660.00, 3.5));

        Collections.sort(people);

        printData(people);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earn " + person.getPaymentAmount() + " tenge");
        }
    }
}