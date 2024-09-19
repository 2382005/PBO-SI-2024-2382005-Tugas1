package Soal3;

public class WhileLoop {
    public static void main(String[] args) {
        String camelCaseString  = "saveChangesInTheEditor"; // camelCase

        int wordCount = 1; // Inisialisasi dengan 1 -> kata pertama dimulai dari huruf kecil
        int i = 0; // Indeks untuk mengatur karakter dalam string

        while (i < camelCaseString.length()) {
            char ch = camelCaseString.charAt(i);
            // Jika karakter huruf kapital, tambahkan hitungan kata
            if (Character.isUpperCase(ch)) {
                wordCount++;
            }
            i++;
        }

        System.out.println("Jumlah kata: " + wordCount);
    }
}
