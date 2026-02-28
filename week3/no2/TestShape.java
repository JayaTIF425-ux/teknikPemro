package week3.no2;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("=== Menguji Class Shape ===");
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("blue", false);
        System.out.println(s2.toString());
        System.out.println();

        System.out.println("=== Menguji Class Circle ===");
        Circle c1 = new Circle(5.5, "yellow", true);
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println();

        System.out.println("=== Menguji Class Rectangle ===");
        Rectangle r1 = new Rectangle(2.0, 4.0, "pink", true);
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println();

        System.out.println("=== Menguji Class Square ===");
        Square sq1 = new Square(5.0);
        System.out.println(sq1.toString());
        System.out.println("Area: " + sq1.getArea());
        
        // Menguji sinkronisasi lebar dan panjang pada Square
        System.out.println("--- Mengubah lebar Square menjadi 10.0 ---");
        sq1.setWidth(10.0);
        System.out.println("Lebar baru: " + sq1.getWidth());
        System.out.println("Panjang baru: " + sq1.getLength()); // Seharusnya ikut berubah
        System.out.println(sq1.toString());
    }
}
