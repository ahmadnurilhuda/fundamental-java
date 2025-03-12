import java.util.ArrayList;
import java.util.Scanner;

public class LatihanJava7 {
    public static void main(String[] args) {


// 1. List Produk
// 2. Tambah Produk
// 3. Edit Produl
// 4. Cari Produk
// 5. Hapus Produk
// 6. Clear Data Produk


// Masukkan Pilihan Menu : 
    ArrayList <String> listProduk = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    int pilihanMenu = 0;

    
    System.out.println("1. List Produk");
    System.out.println("2. Tambah Produk");
    System.out.println("3. Edit Produk");
    System.out.println("4. Cari Produk");
    System.out.println("5. Hapus Produk");
    System.out.println("6. Clear Data Produk");
    System.out.println("");
    

    while (pilihanMenu != 7) {
        System.out.print("");
        System.out.print("Masukkan Pilihan Menu = ");
        pilihanMenu = input.nextInt();
        System.out.println();

        if (pilihanMenu == 1) {
            // Lihat Produk
            System.out.println(listProduk);
            System.out.println("");
            System.out.println("1. List Produk");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Edit Produk");
            System.out.println("4. Cari Produk");
            System.out.println("5. Hapus Produk");
            System.out.println("5. Clear Data Produk");
            System.out.println("");
            System.out.print("Masukkan Pilihan Menu = ");

        } else if (pilihanMenu == 2) {
            System.out.print("Nama Produk Baru = ");
            listProduk.add(input.next());

        } else if (pilihanMenu == 3){
            int pilihIndex ;
            String isiNamaProduk;

            System.out.println(listProduk);

            System.out.print("Masukkan Index Produk Yang Mau Diubah = ");
            pilihIndex = input.nextInt();

            System.out.print("Masukkan Perubahan Nama Produk = ");
            isiNamaProduk = input.next();

            listProduk.set(pilihIndex,isiNamaProduk);

        } else if (pilihanMenu == 4){
            System.out.print("Masukkan Nama Produk yang Ingin Dicari = ");
            String cariProduk = input.next();
    
            if (listProduk.contains(cariProduk)) {
            System.out.println(cariProduk + " ditemukan dalam daftar produk.");

            } else {
             System.out.println(cariProduk + " tidak ditemukan dalam daftar produk.");
            }


        } else if (pilihanMenu == 5){

            String namaProduk;
            System.out.print("Masukkan Nama Produk Yang Mau dihapus = ");
            namaProduk = input.next();
            listProduk.remove(namaProduk);
            System.out.println("Produk "+namaProduk +" berhasil dihapus");

        }else if (pilihanMenu == 6){
            listProduk.clear();
            System.out.println("Data Produk Sudah Dihapus Semua");
    }

    }
    
}
}
