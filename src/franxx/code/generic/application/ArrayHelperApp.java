package franxx.code.generic.application;

import franxx.code.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Arip", "Hilmi", "Miggers"};
        Integer[] numbers = {99, 98, 97, 91};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.<Integer>count(numbers));
    }
}
