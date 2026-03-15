package week5.no24;

public class GenericsType<T> { // Menggunakan parameter tipe

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type = new GenericsType<>(); // Menentukan string dengan <String>, maka type hanya akan menerima string
        type.set("Java"); // valid

        GenericsType type1 = new GenericsType(); // raw type
        type1.set("Java"); // valid
        type1.set(10); // valid and autoboxing support
    }
}

