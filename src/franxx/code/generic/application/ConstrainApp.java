package franxx.code.generic.application;

public class ConstrainApp {
    public static void main(String[] args) {
        NumberData<Integer> data = new NumberData<>(122);
        NumberData<Long> longNumberData = new NumberData<>(1929L);

        // NumberData<String> stringNumberData = new NumberData<String>("Hell"); // ERRORS
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
