package franxx.code.generic.application;

import franxx.code.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("Mee");
//        doIt(data); ERROR

    }

    public static void doIt(MyData<Object> data) {
        // do nothing
    }
}
