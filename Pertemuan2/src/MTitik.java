/*  Nama File   : MTitik.java 
    Deskripsi   : Berisi main dari class Titik 
    Pembuat     : Syifa Aeni Mudrikah - 24060124120043
    Tanggal     : 26 Febaruari 2026                                    */

public class MTitik {
    public static void main (String[] args){
        Titik T1 = new Titik (); // membuat objek titik T1 (0,0)
        Titik T2 = new Titik(); // membuat objek titik T2 (0,0)
        
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(5); //mengubah ordinat T1 dengan nilai 5
        T2.setAbsis(5); //mengubah absis T2 dengan nilai 5
        T2.setOrdinat(2); //mengubah ordinat T2 dengan nilai 2
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T2.printTitik(); // mencetak koordinat T2 ke layar

        T1.geser(2, 3); //menggeser T1 sejauh (2,3)
        System.out.println("T1 setelah digeser (2,3) : "); 
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        System.out.println("Kuadran T1: " + T1.getKuadran()); // menampilakn kuadran T1
        System.out.println("Kuadran T2: " + T2.getKuadran());  // menampilkan kuadran T2
        System.out.println("Jarak T1 ke pusat : " + T1.getJarakPusat()); // menampilkan jarak T1 terhadap titik pusat (0,0)
        System.out.println("Jarak T1 ke T2 : " + T1.getJarak(T2)); // menampilkan jarak antara T1 dan T2

        T1.refleksiX(); // merefleksikan T1 terhadap sumbu X
        System.out.println("T1 setelah refleksi X : ");
        T1.printTitik(); // menampilkan koordinat T1 setelah refleksi sumbu x

        T1.refleksiY(); // merefleksikan T1 terhadap sumbu Y
        System.out.println("T1 setelah refleksi Y : ");
        T1.printTitik(); // menampilkan koordinat T1 setelah refleksi sumbu Y


        Titik T3 = T2.getRefleksiX(); // membuat obje baru T3 yang merupakan hasil refleksi T2 terhadap sumbu X
        System.out.println("Refleksi X dari T2  : ");
        T3.printTitik(); // menampilkan koordinat hasil refleksi T2

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik()); // Menampilkan jumlah objek Titik yang telah dibuat
    }
}
