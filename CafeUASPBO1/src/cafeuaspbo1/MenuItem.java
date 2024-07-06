
package cafeuaspbo1;


public class MenuItem {
    // Atribut
    private String nama;
    private double harga;

    // Constructor
    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }
}

