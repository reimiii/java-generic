package franxx.code.generic.application;

import franxx.code.generic.MyData;

public class TypeErasureApp {
    MyData myData = new MyData<>("Hello");

    MyData<Integer> integerMyData = (MyData<Integer>) myData;
//    integerMyData.setData(1000);

}
