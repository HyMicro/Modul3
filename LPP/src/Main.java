/**
 * Kelas PersegiPanjang adalah representasi dari sebuah persegi panjang.
 * Kelas ini memiliki metode untuk menghitung luas dan keliling persegi panjang.
 * @author Ahyad Izzuddin S
 * @see Math
 */
public class PersegiPanjang {
    private double panjang;
    private double lebar;

    /**
     * Konstruktor untuk membuat objek PersegiPanjang dengan panjang dan lebar tertentu.
     * @param panjang Panjang dari persegi panjang.
     * @param lebar Lebar dari persegi panjang.
     */
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    /**
     * Menghitung luas dari persegi panjang.
     * @return Luas dari persegi panjang.
     */
    public double hitungLuas() {
        return panjang * lebar;
    }

    /**
     * Menghitung keliling dari persegi panjang.
     * @return Keliling dari persegi panjang.
     */
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    /**
     * Metode untuk mengatur panjang dari persegi panjang.
     * @param panjang Panjang yang akan diatur.
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * Metode untuk mengatur lebar dari persegi panjang.
     * @param lebar Lebar yang akan diatur.
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * Metode untuk mendapatkan panjang dari persegi panjang.
     * @return Panjang dari persegi panjang.
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * Metode untuk mendapatkan lebar dari persegi panjang.
     * @return Lebar dari persegi panjang.
     */
    public double getLebar() {
        return lebar;
    }

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5.0, 3.0);

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
    }
}
