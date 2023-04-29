import java.util.Scanner;

public class tugaspbo {
//method nonvoid dan void
    static Scanner input = new Scanner(System.in);
    
    // Method non-void 
    static double hitungLuasLingkaran(double r) {
        double luas = Math.PI * r * r;
        return luas;
    }
    
    // Method void 
    static void cetakLuasLingkaran(double r) {
        double luas = hitungLuasLingkaran(r);
        System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f\n", r, luas);
    }
    
    public static void main(String[] args) {
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();
        
        // Memanggil method void untuk mencetak luas lingkaran
        cetakLuasLingkaran(r);
        
        // Memanggil method non-void untuk menghitung dan mencetak luas lingkaran
        double luas = hitungLuasLingkaran(r);
        System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f\n", r, luas);
        
    }

}
//Keyword this
 class PemainBola {
    
    private String nama;
    private String posisi;
    private int nomorPunggung;
    private int usia;
    
    public PemainBola(String nama, String posisi, int nomorPunggung, int usia) {
        this.nama = nama;
        this.posisi = posisi;
        this.nomorPunggung = nomorPunggung;
        this.usia = usia;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    
    public void setNomorPunggung(int nomorPunggung) {
        this.nomorPunggung = nomorPunggung;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getPosisi() {
        return this.posisi;
    }
    
    public int getNomorPunggung() {
        return this.nomorPunggung;
    }
    
    public int getUsia() {
        return this.usia;
    }
    
    public static void main(String[] args) {
         
        PemainBola pemain1 = new PemainBola("Lionel Messi", "Penyerang", 10, 34);
        
        pemain1.setPosisi("Gelandang Serang");
        
        System.out.println("Nama: " + pemain1.getNama());
        System.out.println("Posisi: " + pemain1.getPosisi());
        System.out.println("Nomor Punggung: " + pemain1.getNomorPunggung());
        System.out.println("Usia: " + pemain1.getUsia());
    }

}
  // Overloading method 
 class KelilingTrapesium {

  
    public static double keliling(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    
    public static int keliling(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    public static void main(String[] args) {
        
        // Memanggil method keliling dengan tipe data double
        double keliling1 = keliling(10.5, 12.0, 8.0, 6.5);
        System.out.println("Keliling trapesium dengan tipe data double: " + keliling1);
        
        // Memanggil method keliling dengan tipe data int
        int keliling2 = keliling(10, 12, 8, 6);
        System.out.println("Keliling trapesium dengan tipe data int: " + keliling2);
    }
}
// overloading constructor
 class Segitiga {
    
    // Variabel
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    // Constructor tanpa parameter
    public Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
        this.sisi1 = 0;
        this.sisi2 = 0;
        this.sisi3 = 0;
    }
    
    // Constructor dengan parameter alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = 0;
        this.sisi2 = 0;
        this.sisi3 = 0;
    }
    
    // Constructor dengan parameter sisi1, sisi2, dan sisi3
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.alas = 0;
        this.tinggi = 0;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }
    
    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        return this.sisi1 + this.sisi2 + this.sisi3;
    }
    
    // Method untuk mencetak hasil perhitungan
    public void print() {
        if (this.alas != 0 && this.tinggi != 0) {
            System.out.println("Luas segitiga: " + hitungLuas());
        }
        if (this.sisi1 != 0 && this.sisi2 != 0 && this.sisi3 != 0) {
            System.out.println("Keliling segitiga: " + hitungKeliling());
        }
    }
    
    public static void main(String[] args) {
        // Membuat objek segitiga1 dengan parameter alas dan tinggi
        Segitiga segitiga1 = new Segitiga(10, 5);
        segitiga1.print();
        
        // Membuat objek segitiga2 dengan parameter sisi1, sisi2, dan sisi3
        Segitiga segitiga2 = new Segitiga(6, 8, 10);
        segitiga2.print();
    }
}


