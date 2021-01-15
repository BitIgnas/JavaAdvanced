package encapsulation.example1;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Lebron", "James", 35, 76, 193);
        System.out.println(person);

        System.out.println(person.getFirstName() + " " + person.getLastName());

        Person anotherPerson = new Person("Kobe", "Bryant", 36, 70, 198 );
        System.out.println(anotherPerson);

        anotherPerson.setAge(40);
        System.out.println(anotherPerson);
    }
}
