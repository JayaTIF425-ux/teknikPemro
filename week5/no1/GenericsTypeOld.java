package week5.no1;

public class GenericsTypeOld {

    private Object t; // Menggunakan object sebagai penampung, t bersifat universal

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
    }
}

