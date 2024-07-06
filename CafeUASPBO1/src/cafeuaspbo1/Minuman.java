
package cafeuaspbo1;


public class Minuman extends MenuItem {
    private String ukuran; // ukuran minuman (misalnya, kecil, sedang, besar)

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga); // Memanggil constructor kelas induk
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran: " + ukuran);
    }
}

