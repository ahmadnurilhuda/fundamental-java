import java.util.Scanner;

public class input {
    public static void main (String [] args) {


//Penggunaan Scanner untuk menerima Input

        // ini awalan untuk memulai input
        Scanner input = new Scanner(System.in) ;



// // ini penggunaan input tipe data String

        // System.out.print("Ketik Nama Anda: ");

        // // masukkan tipe data String untuk menyimpan inputan
        // String namaLengkap = input.next();

        // System.out.print("halo nama saya " + namaLengkap);
      

 // ini penggunaan input tipe data Integer

        int harga, kuantitas, total;

        System.out.print("Harga Barang: ");
        harga = input.nextInt();

        System.out.print("Jumlah Barang: ");
        kuantitas = input.nextInt();

        total = harga*kuantitas;


        System.out.println("--------------------------------");
        System.out.println("Harga Barang = Rp" + harga);
        System.out.println("Jumlah Barang = " + kuantitas);
        System.out.println("Total = Rp" + total);

    }
    
}
