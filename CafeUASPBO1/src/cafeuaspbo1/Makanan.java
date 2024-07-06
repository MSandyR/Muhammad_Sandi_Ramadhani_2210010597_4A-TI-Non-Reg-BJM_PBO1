
package cafeuaspbo1;


public class Makanan extends MenuItem {
    private boolean isVegetarian;

    public Makanan(String nama, double harga, boolean isVegetarian) {
        super(nama, harga); // Memanggil constructor kelas induk
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vegetarian: " + (isVegetarian ? "Ya" : "Tidak"));
    }
}
