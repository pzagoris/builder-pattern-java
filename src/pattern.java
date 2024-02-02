
interface PersonBuilder {
    PersonBuilder name(String name);
    PersonBuilder age(int age);
    PersonBuilder email(String email);
    PersonBuilder address(String address);
    Person build();
}

class Person {
    private String name;
    private int age;
    private String email;
    private String address;

    // Private constructor to prevent instantiation from outside
    private Person() {}

    public static PersonBuilder builder() {
        return new PersonBuilderImpl();
    }

    private static class PersonBuilderImpl implements PersonBuilder {
        private String name;
        private int age;
        private String email;
        private String address;

        @Override
        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        @Override
        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        @Override
        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        @Override
        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            person.email = this.email;
            person.address = this.address;
            return person;
        }
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Getters and setters (same as previous)
    // toString method (same as previous)
}

public class pattern {
	public static void main(String[] args) {
	    // Creating a Person object using the builder pattern
        Person person = Person.builder()
            .name("John Doe")
            .email("john.doe@example.com")
            .address("123 Main St, City")
            .build();
        // Printing out the details of the person
        System.out.println(person);
	}

   
}