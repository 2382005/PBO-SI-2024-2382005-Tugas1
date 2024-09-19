package Soal1;

public class DoWhile {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        int sum = 0;
        int i = 0;

        do {
            sum += ar[i];
            i++;
        } while (i < ar.length);

        // Menampilkan hasil akhir
        System.out.println("Jumlah elemen array: " + sum    );
    }
}
