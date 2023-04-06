package franxx.code.generic.application;

import franxx.code.generic.MyData;

public class MainGeneric {
    public static void main(String[] args) {
        MyData<String> data = new MyData<String>("It's String Man!!");
        MyData<Integer> integerMyData = new MyData<Integer>(911);

        String s = data.getData();
        Integer integer = integerMyData.getData();

        System.out.println(s);
        System.out.println(integer);
    }
}
