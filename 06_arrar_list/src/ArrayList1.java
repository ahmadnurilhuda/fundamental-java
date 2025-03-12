import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
    public static void main(String[] args) throws Exception {

    // ArrayList<String> daftarSiswa = new ArrayList<>();

// //Method
//     // Tambah Element/item
//     daftarSiswa.add("Nuril");
//     daftarSiswa.add("Ahmad");
//     daftarSiswa.add("Huda");


//     // Hapus Element/Item
//         //dengan index
//     daftarSiswa.remove(0);
//         //dengan nilainya
//     daftarSiswa.remove("Ahmad");


//     // Set / Edit
//         // harus pakai index
//     daftarSiswa.set(0, "Kukuh");


//      // Clear
//         // Menghapus semua isi Array List
//     daftarSiswa.clear();



//     // indexOf
//         // Untuk mencari nilai dan mengembalikan sesuai index
//     System.out.println(daftarSiswa.indexOf("Nuril"));

//     // Contains
//         // Untuk Mencari Nilai dan Mengembalikan boolean
//     System.out.println(daftarSiswa.contains("Nuril"));

//     // isEmpty
//         // Untuk Check Arraylist Kosong atay tidak
//     System.out.println(daftarSiswa.isEmpty());

//     // Size
//         // Untuk Check Panjang Arraylist
//     System.out.println(daftarSiswa.size());


//     for(String nama : daftarSiswa)
//     System.out.println(nama);

//===================//===================//===================//===================//===================//===================//===================//===================

// Membuat Program ToDoList
// 1. Tambah Tugas
// 2. Edit tugas
// 3. Hapus Tugas
// 4. Tampilkan Tugas   

    ArrayList <String> taskList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    int pilihanMenu = 0;

    System.out.println("Daftar Tugas");
    System.out.println("1. Tambah Tugas");
    System.out.println("2. Hapus Tugas");
    System.out.println("3. Edit Tugas");
    System.out.println("4. Tampilkan Tugas");
    System.out.println("5. Exit");

    while (pilihanMenu != 5) {
        pilihanMenu = input.nextInt();

        if (pilihanMenu == 1) {
            //tambah tugas
            System.out.print("Nama Tugas = "); 
            taskList.add(input.next());

        } else if (pilihanMenu == 2){
            //edit tugas
            int pilihIndex ;
            String isiNama;

            System.out.println(taskList);

            System.out.print("Masukkan Tugas yang mau diubah");
            pilihIndex = input.nextInt();

            System.out.print("Masukkan Perubahan Nama Tugas = ");
            isiNama = input.next();

        } else if (pilihanMenu == 3){
            //hapus
            System.out.print("Masukkan index yang mau dihapus = ");
            taskList.remove(input.nextInt());

        } else if (pilihanMenu ==4){
            //Menampilkan Tugas
            System.out.println(taskList);
        }

        
    }

    


    }



   

    

}
