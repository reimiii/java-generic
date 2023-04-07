package franxx.code.generic.application;

import franxx.code.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("MEe");
        process(data);
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
        // myData.setData("Hilmi"); tidak boleh
    }
}
