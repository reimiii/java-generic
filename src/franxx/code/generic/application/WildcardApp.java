package franxx.code.generic.application;

import franxx.code.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        writeLn(new MyData<>(112));
        writeLn(new MyData<>("String"));
        writeLn(new MyData<>(true));
    }

    public static void writeLn(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
