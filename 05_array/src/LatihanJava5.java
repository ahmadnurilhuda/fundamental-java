import java.util.Scanner;

public class LatihanJava5 {
    public static void main(String[] args) throws Exception {

    int jumlahKelas, jumlahMahasiswa, totalNilai = 0, avarage = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Kelas = ");
        jumlahKelas = input.nextInt();

    System.out.print("Masukkan Jumlah Mahasiswa Tiap Kelas = ");
        jumlahMahasiswa = input.nextInt();


    int [][] daftarNilaiMahasiswa = new int[jumlahKelas][jumlahMahasiswa];


    // Input nilai mahasiswa untuk setiap kelas
    for (int indexDimensiKelas = 0; indexDimensiKelas < jumlahKelas; indexDimensiKelas++) {
        System.out.println("Nilai Kelas " + (indexDimensiKelas + 1));

    // Input untuk setiap mahasiswa di kelas
        for (int indexDimensiMashasiswa = 0; indexDimensiMashasiswa < jumlahMahasiswa; indexDimensiMashasiswa++) { 
            System.out.print("Mahasiswa " + (indexDimensiMashasiswa + 1) + " dari Kelas " + (indexDimensiKelas + 1) + " adalah " + "= ");
            daftarNilaiMahasiswa[indexDimensiKelas][indexDimensiMashasiswa] = input.nextInt();
        }
    }

    // Menghitung
    for (int indexDimensiKelas = 0 ; indexDimensiKelas < daftarNilaiMahasiswa.length; indexDimensiKelas++){
        for (int indexDimensiMashasiswa = 0 ; indexDimensiMashasiswa < daftarNilaiMahasiswa [indexDimensiKelas].length; indexDimensiMashasiswa++){
        //Akumulasi Nilai
        totalNilai = daftarNilaiMahasiswa[indexDimensiKelas][indexDimensiMashasiswa] + totalNilai;

        //Rata-rata Nilai
        avarage = totalNilai / (jumlahKelas*jumlahMahasiswa);
    }

    }
        input.close();

        System.out.println("Nilai Rata-Rata Keseluruhan Mahasiswa = " + avarage);        
    }
}