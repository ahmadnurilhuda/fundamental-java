import java.util.Scanner;

public class Array3d {
    public static void main(String[] args) {

    // //for khusus output
        
    //     String [][] itemsTanaman ={
    //         {"Apel", "Pisang"},
    //         {"Kangkug", "Bayam"}
    //     };
            
    //     for (String[]items : itemsTanaman){
    //         for (String item :items){
    //         System.out.println(item);
    //         }
            
    //     }

    Scanner input = new Scanner(System.in);

    // Input jumlah kelas, mahasiswa per kelas, dan mata pelajaran
    System.out.print("Masukkan jumlah kelas: ");
    int jumlahKelas = input.nextInt();

    System.out.print("Masukkan jumlah mahasiswa per kelas: ");
    int jumlahMahasiswa = input.nextInt();

    System.out.print("Masukkan jumlah mata pelajaran: ");
    int jumlahMataPelajaran = input.nextInt();

    // Deklarasi array 3D
    int[][][] nilaiMahasiswa = new int[jumlahKelas][jumlahMahasiswa][jumlahMataPelajaran];

    // Input nilai untuk setiap mahasiswa di setiap mata pelajaran
    for (int indexKelas = 0; indexKelas < jumlahKelas; indexKelas++) {
        System.out.println("Nilai Kelas " + (indexKelas + 1) + ":");

        for (int indexMahasiswa = 0; indexMahasiswa < jumlahMahasiswa; indexMahasiswa++) {
            System.out.println("  Mahasiswa ke-" + (indexMahasiswa + 1) + ":");

            for (int indexMataPelajaran = 0; indexMataPelajaran < jumlahMataPelajaran; indexMataPelajaran++) {
                System.out.print("    Nilai mata pelajaran ke-" + (indexMataPelajaran + 1) + ": ");
                nilaiMahasiswa[indexKelas][indexMahasiswa][indexMataPelajaran] = input.nextInt();
            }
        }
    }

    int urutanKelas = 1;
    int urutanMahasiswa = 1;
    int urutanPelajaran = 1;

    for (int[][] daftarKelas : nilaiMahasiswa){
        System.out.println("Kelas " + (urutanKelas));

        for (int[] daftarSiswa : daftarKelas){
            
            for (int mataPelajaran : daftarSiswa){
                System.out.println("Mahasiswa Ke - "+(urutanMahasiswa)+ " Dari Kelas "+(urutanKelas) +
                " Untuk Mata Pelajaran " +(urutanPelajaran)+ " Nilainya Adalah = " + mataPelajaran);
                urutanPelajaran++;
            }
            urutanPelajaran = 1;
            urutanMahasiswa = 1;
    
        }
        urutanMahasiswa = 1;
        urutanKelas = 1;

    }
    
    }
}
