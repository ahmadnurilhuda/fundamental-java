import java.util.Scanner;

public class looping {
    public static void main(String[] args) throws Exception {

        // int index = 1;
        // String nama = "Nuril";

// For Loop (index sejajar dengan condiotion) | for (insialisasi, condition, increament)
        // for (int index = 1 ; index <= 10; index++) // Condition
        // {
        //     System.out.println(index + " " + nama);
        // }
    

// While (index harus di luar scoop) | while = condition
//         while (index <= 10) //condition
//         {
//             System.out.println(index + " " + nama);
//             index++;
//         }

// // Do While | while = condition
//         do {
//             System.out.println(index + " " + nama);
//             index++;
//         } while (index <= 10);


// contoh kasus penggunaan looping
// kegiatan = Kasir menginput barang secara terus menerus " sesuai dengan jumlah barangnya"
// lakukan Input Jumlah Barang
// for loop sesuai input jumlah barang
// lakukan input harga barang
// outputnya adalah total harga barang yang perlu dibayar

    Scanner input = new Scanner (System.in);

    int totalBayar = 0, jumlahBarang = 0;

    // kasir menginput jumlah barang
    System.out.print("Masukkan Jumlah Barang : ");
    jumlahBarang = input.nextInt();

    for(int index = 1 ; index <= jumlahBarang; index++){
        System.out.print("Masukkan Harga Barang " + index + ": Rp");
        totalBayar = totalBayar + input.nextInt();
    }

    System.out.println("Total Pembayaran : Rp" + totalBayar);




    

    


    }


}
