package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

//        //Function interface
//        Function<Person, String> getName = person -> person.name;
//
//        //Function interface
//        ToIntFunction<String> findLength = l -> l.length();
//
//        //Consumer interface
//        IntConsumer print = x -> System.out.println(x);
//
//        people.stream()
//                .map(getName)
//                .mapToInt(findLength)
//                .forEach(print);

        people.stream()
                .map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        boolean allFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.println("All female? " + allFemales);

        boolean anyMale = people.stream()
                .anyMatch(person -> MALE.equals(person.gender));
        System.out.println("Any Male? " + anyMale);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
