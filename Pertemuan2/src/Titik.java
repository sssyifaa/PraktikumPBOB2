/*  Nama File       : Titik.java
    Deskripsi       : berisi atribut dan method dalam class titik 
    Pembuat         : Syifa Aeni Mudrikah - 24060124120043
    Tanggal         : 25/02/2026
*/

public class Titik {
    /**************ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /**************METHOD ***************/
    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat nilai absis dengan ordinat tertentu
    public Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }
    
    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengembalikan nilai kuadran
    public int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat< 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    // mengembalikan nilai jarak ke titik pusat
    public double getJarakPusat(){
        return Math.sqrt (absis * absis + ordinat * ordinat);
    }
    
    // mengembalikan nilai jarak dua titik
    public double getJarak (Titik T){
        double dx = absis - T.getAbsis();
        double dy = ordinat - T.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    // Merefleksikan titik terhadap sumbu X
    public void refleksiX(){
        ordinat = -ordinat;
    }

    // Merefleksikan titik terhadap sumbu Y
    public void refleksiY (){
        absis = -absis;
    }

    // Menghasilkan titik hasil refleksi terhadap sumbu X
    public Titik getRefleksiX(){
        return new Titik (absis, -ordinat);
    }

    // Menghasilkan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY(){
        return new Titik (-absis, ordinat);
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik (){
        return counterTitik;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} 


