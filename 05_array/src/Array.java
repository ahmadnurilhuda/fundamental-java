import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws Exception {

        
        // int[] nilai = new int[3];
        
        // nilai [0] = 1;
        // nilai [1] = 10;
        // nilai [2] = 100;

        // for (int index = 0 ; index < 3; index++){
        //     System.out.println(nilai[index]);
        // }


        // String[] mahasiswa = new String[5];
        // mahasiswa[0] = "Bambang";
        // mahasiswa[1] = "Bambang";
        // mahasiswa[2] = "Bambang";
        // mahasiswa[3] = "Bambang";
        // mahasiswa[4] = "Bambang";

        // for (int index = 0 ; index < 5; index++){
        //     System.out.println(mahasiswa[index]);
        // }


// Contoh Penggunaan Array
// Mengihitung Rata-Rata, Tertinggi dan Terendedah Nilai Mahasiswa
// Input Jumlah Banyaknya Mahasiswa
// Output Nilai rata - rata, tertinggi, terendah dari Daftar Nilai Mahasiswa

        int jumlahMahasiswa, avarage = 0, nilaiMax = 0, nilaiMin = 0, totalNilai = 0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa = ");
        jumlahMahasiswa = input.nextInt();

        //Deklarasi array sesuai dengan input User
        int[] daftarNilaiMahasiswa = new int[jumlahMahasiswa];

        //Untuk Menerima Input Nilai
        for (int i = 0 ; i < jumlahMahasiswa; i++){

            // (i+1) dibeli tanda () agar prioritaskan supaya output mulai dari 1 bukan 0 karena Array itu mulai dari 0.
            System.out.print("(Input) Nilai Mahasiswa ke - %s =".formatted((i + 1)));
            int nilaiMahasiswa = input.nextInt();
            daftarNilaiMahasiswa[i]= nilaiMahasiswa;
        }

        //Untuk Menghitung
        for (int i = 0 ; i < daftarNilaiMahasiswa.length; i++){
            //Akumulasi Nilai
            totalNilai = daftarNilaiMahasiswa[i] + totalNilai;

            //Rata-rata Nilai
            avarage = totalNilai / daftarNilaiMahasiswa.length;

            //Nilai MAX
            if(nilaiMax < daftarNilaiMahasiswa[i]){
                nilaiMax = daftarNilaiMahasiswa[i];
            }

            //Nilai MIN
            if(nilaiMin > daftarNilaiMahasiswa[i] || nilaiMin == 0){
                nilaiMin = daftarNilaiMahasiswa[i];
            }
        }

        input.close();

        System.out.println("Nilai Tertinggi = " + nilaiMax);
        System.out.println("Nilai Terendah = " + nilaiMin);
        System.out.println("Nilai Rata-rata = " + avarage);
    }
}
