package franxx.code.generic.application;

import franxx.code.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
          new Person("Hilmi", "Bogor"),
          new Person("Arip", "Bogor"),
          new Person("Torik", "Bogor")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
