package week7.no3;

class SumWorker extends Thread {
    private int start;
    private int end;
    private long partialSum = 0;

    public SumWorker(int start, int end, String name) {
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        // Menampilkan tugas yang dikerjakan thread ini
        System.out.println(getName() + " mengerjakan rentang: " + start + " - " + end);
        
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        
        // Menampilkan hasil parsial setelah selesai menghitung
        System.out.println(getName() + " selesai. Hasil parsial: " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}


