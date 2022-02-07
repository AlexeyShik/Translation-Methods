public class Check {

    class F {
        int value;
    }

    class E {
        int value;
    }

    void post(F f, E e) {
        f.value = (int) Math.sqrt((double) e.value);
    }
}
