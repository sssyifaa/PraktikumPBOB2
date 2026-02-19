/*  Nama File   : Titik.java 
    Deskripsi   : Berisi atribut dan method dalam class Titik 
    Pembuat     : Syifa Aeni Mudrikah - 24060124120043
    Tanggal     : 19 Febaruari 2026                                    */

public class MTitik {
    public static void main(String[] args){
    Titik T1 = new Titik();
    T1.setAbsis(3);
    T1.setOrdinat(5);
    T1.printTitik();
    T1.geser(2, 7);
    T1.printTitik();
    }
}