package JavaProblems;

class Student {
    private int id;
    private String name;

    // Constructor untuk inisialisasi ID dan Nama
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter untuk ID
    public int getId() {
        return id;
    }

    // Getter untuk Nama
    public String getName() {
        return name;
    }

    // Method toString agar saat diprint hasilnya rapi (tidak muncul kode hash)
    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}
