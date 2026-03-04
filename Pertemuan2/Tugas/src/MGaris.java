/*  Nama File       : MGaris.java
    Deskripsi       : berisi main class Garis
    Pembuat         : Syifa Aeni Mudrikah - 24060124120043
    Tanggal         : 26/02/2026
*/

public class MGaris {
    public static void main(String[] args){
        Titik T1 = new Titik(2, 0); // Membuat objek Titik T1 dengan koordinat (2,0)
        Titik T2 = new Titik(0, 4); // Membuat objek Titik T2 dengan koordinat (0,4)

        Titik T3 = new Titik (1,1); // Membuat objek Titik T3 dengan koordinat (1,1)
        Titik T4 = new Titik (3,5); // Membuat objek Titik T4 dengan koordinat (4,5)

        Garis G1 = new Garis(T1, T2); // Membuat objek Garis G1 dari T1 ke T2
        Garis G2 = new Garis(T3, T4); // Membuat objek Garis G1 dari T3 ke T4

        System.out.println("==Garis 1==");
        G1.printGaris(); // Menampilkan titik awal dan titik akhir G1
        System.out.println("Panjang Garis : " + G1.getPanjang()); // Menampilkan panjang G1
        System.out.println("Gradien : " + G1.getGradien()); // Menampilkan nilai gradien G1
        System.out.println("Persamaan : " + G1.getPersamaanGaris()); // Menampilkan persamaan garis G1

        // Menampilkan titik tengah G1
        System.out.println("Titik Tengah : (" + G1.getTitikTengah().getAbsis() + "," + G1.getTitikTengah().getOrdinat() + ")");

        System.out.println("==Garis 2==");
        G2.printGaris(); // Menampilkan titik awal dan titik akhir garis G2
        System.out.println("Panjang Garis : " + G2.getPanjang()); // Menampilkan panjang G2
        System.out.println("Gradien : " + G2.getGradien()); // Menampilkan gradien G2
        System.out.println("Persamaan : " + G2.getPersamaanGaris()); // Menampilkan persamaan garis G2

        // Menampilkan titik tengah G2
        System.out.println("Titik Tengah : (" + G2.getTitikTengah().getAbsis() + "," + G2.getTitikTengah().getOrdinat() + ")");

        System.out.println("Apakah garis tersebut sejajar? : " + G1.isSejajar(G2)); // Mengecek apakah G1 dan G2 sejajar
        System.out.println("Apakah garis tersebut tegak lurus? : " + G1.isTegakLurus(G2)); // Mengecek apakah G1 dan G2 tegak lurus

        System.out.println("Jumlah garis : " + Garis.getCounterGaris()); // Menampilkan jumlah objek Garis yang telah dibuat


    }
}
