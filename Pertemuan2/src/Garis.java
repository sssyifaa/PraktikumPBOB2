/*  Nama File   : Garis.java 
    Deskripsi   : Berisi atribut dan method dalam class Garis 
    Pembuat     : Syifa Aeni Mudrikah - 24060124120043
    Tanggal     : 26 Febaruari 2026                                    */

public class Garis {
    /**************ATRIBUT ***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /**************KONSTRUKTOR***************/
    // kosntruktor tanpa parameter : titikAwal (0,0) dan titikAkhir (1,1)
    public Garis (){
        titikAwal = new Titik (0,0);
        titikAkhir = new Titik (1,1);
        counterGaris++;
    }

    // Konstruktor dengan parameter titik awal dan titik akhir
    public Garis (Titik t1, Titik t2){
        this.titikAwal = t1;
        this.titikAkhir = t2;
        counterGaris++;
    }

    /**************GETTER***************/
    // Mengembalikan titik awal garis
    public Titik getTitikAwal(){
        return titikAwal;
    }

    // Mengembalikan titik akhir garis
    public Titik getTitikAkhir (){
        return titikAkhir;
    }

    // Mengembalikan jumlah objek Garis yang dibuat
    public static int getCounterGaris(){
        return counterGaris;
    }

    /**************SETTER***************/
    // Mengubah titik awal garis
    public void setTitikAwal(Titik t){
        this.titikAwal = t;
    }

    // Mengubah titik akhir garis
    public void setTitikAkhir(Titik t){
        this.titikAkhir = t;
    }

    /**************METHOD***************/
    // Mengembalikan panjang garis
    public double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    // Mengembalikan nilai gradien garis
    public double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        // kalau garis vertikal 
        if (dx == 0) {
            return Double.POSITIVE_INFINITY; 
        }
<<<<<<< HEAD
=======
        
>>>>>>> 5f6f91955efd5d3514622ec9ddbe169a33c0e5f2
        return dy/dx;
    }

    // Mengembalikan titik tengah garis
    public Titik getTitikTengah(){
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2;
        return new Titik(x,y);
    }

    // Mengecek apakah garis ini sejajar dengan garis G
    public boolean isSejajar (Garis G){
        return this.getGradien() == G.getGradien();
    }

    // Mengecek apakah garis ini tegak lurus dengan garis G
    public boolean isTegakLurus (Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir garis ke layar
    public void printGaris(){
        System.out.println("Titik awal : (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("Titik akhir : (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    // Mengembalikan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris(){
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        // Jika garis vertikal
        if (x1 == x2) {
            return "x = " + x1;
        }

        double m = (y2 - y1) / (x2 - x1);
        double c = y1 - m * x1;

        return "y = " + m + "x + " + c;
    }

}
