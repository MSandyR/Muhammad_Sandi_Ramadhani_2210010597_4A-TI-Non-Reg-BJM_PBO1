
package cafeuaspbo1;


import java.util.Scanner;

public class CafeUASPBO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuItem[] menu = new MenuItem[10]; // Array untuk menyimpan menu
        int index = 0;

        while (true) {
            System.out.println("1. Tambah Minuman");
            System.out.println("2. Tambah Makanan");
            System.out.println("3. Tampilkan Menu");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            if (opsi == 4) {
                break;
            }

            try {
                switch (opsi) {
                    case 1:
                        System.out.print("Masukkan nama minuman: ");
                        String namaMinuman = scanner.nextLine();
                        System.out.print("Masukkan harga minuman: ");
                        double hargaMinuman = scanner.nextDouble();
                        scanner.nextLine(); // Membersihkan buffer
                        System.out.print("Masukkan ukuran minuman: ");
                        String ukuranMinuman = scanner.nextLine();
                        menu[index++] = new Minuman(namaMinuman, hargaMinuman, ukuranMinuman);
                        break;
                    case 2:
                        System.out.print("Masukkan nama makanan: ");
                        String namaMakanan = scanner.nextLine();
                        System.out.print("Masukkan harga makanan: ");
                        double hargaMakanan = scanner.nextDouble();
                        System.out.print("Apakah makanan vegetarian (true/false): ");
                        boolean isVegetarian = scanner.nextBoolean();
                        menu[index++] = new Makanan(namaMakanan, hargaMakanan, isVegetarian);
                        break;
                    case 3:
                        for (int i = 0; i < index; i++) {
                            menu[i].displayInfo();
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println("Opsi tidak valid");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Menu sudah penuh. Tidak dapat menambah item baru.");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

