package Soal2;

public class ForLoop {
    public static void main(String[] args) {
        int n = 4;

        // Menggunakan Loop untuk mencetak tangga
        for (int i = 1; i <= n; i++) {
            // Mencetak "#"
            for (int j = 1; j <= i; j++) {
                System.out.println("#");
            }

            System.out.println();
        }
    }
}
