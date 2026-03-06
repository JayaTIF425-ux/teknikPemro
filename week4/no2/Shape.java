package week4.no2;

public abstract class Shape {
    // Variabel instansi untuk menyimpan nama bentuk
    protected String shapeName; 

    // Konstruktor untuk mengatur nama bentuk
    public Shape(String name) {
        shapeName = name;
    }

    // Metode abstrak untuk menghitung luas (harus diimplementasikan oleh anak kelas)
    public abstract double area(); 

    // Metode toString yang mengembalikan nama bentuk
    @Override
    public String toString() {
        return shapeName; 
    }
}
