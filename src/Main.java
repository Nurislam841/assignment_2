import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //this is body
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        //creat object "Person" and including both Employee and Student classes
        people.add(new Employee("John ","Lennon",27045.78, ""));
        people.add(new Employee("George ", "Harrison",50000.00,""));
        people.add(new Student("Ringo ", "Starr",0.00, 2.5));
        people.add(new Student("Paul McCartney", "McCartney",36660.00, 3.5));

        Collections.sort(people); // this is sord metods use compare in person class;

        printData(people);
    }
    //method for displaying data about people and their income
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earn " + person.getPaymentAmount() + " tenge");
        }
    }
}