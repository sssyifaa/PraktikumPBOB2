/*  Nama File   : Titik.java 
    Deskripsi   : Berisi atribut dan method dalam class Titik 
    Pembuat     : Syifa Aeni Mudrikah - 24060124120043
    Tanggal     : 19 Februari 2026                                    */

public class Titik {
    /*          ATRIBUT          */
    double absis;
    double ordinat;

    /*          METHOD           */
    /* KONSTRUKTOR untuk membuat titik (0,0) */
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    /* FUNCTION mengembalikan nilai absis */
    double getAbsis(){
        return absis;
    }

    /* FUNCTION mengembalikan nilai ordinat */
    double getOrdinat(){
        return ordinat;
    }

    /* PROCEDURE mengeset absis titik dengan nilai baru x */
    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}