package franxx.code.generic.application;

import franxx.code.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> data = new MyData<>("Hilmi");
        MyData<? super String> myData = data;
        System.out.println(myData.getData());
        System.out.println(data.getData());

        process(myData);

        System.out.println(data.getData());
    }

    // tidak ada get data yg aman di contra variant
    public static void process(MyData<? super String> myData) {
        myData.setData("Minll");
    }
}
