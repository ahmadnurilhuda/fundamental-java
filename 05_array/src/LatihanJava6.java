import java.util.Scanner;

public class LatihanJava6 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

// Prepare
    int jumlahKelas, jumlahSiswa, jumlahMataPelajaran;

// Input
    // Input Jumlah Kelas
    System.out.print("Masukkan Jumlah Kelas = ");
    jumlahKelas = input.nextInt();

    // Input Jumlah Siswa
    System.out.print("Masukkan Jumlah Siswa = ");
    jumlahSiswa = input.nextInt();

    // Input Jumlah Mata Pelajaran
    System.out.print("Masukkan Jumlah Mata Pelajaran = ");
    jumlahMataPelajaran = input.nextInt();

// Prepare
    // Deklarasi Array 3D
    int [][][] nilaiSiswa = new int [jumlahKelas][jumlahSiswa][jumlahMataPelajaran];

// Input
    // Input Nilai Siswa

//Looping / Decision
    for (int indexKelas = 0; indexKelas < jumlahKelas; indexKelas++) {
    System.out.println("Kelas %s = ".formatted(indexKelas + 1));

        for (int indexSiswa = 0; indexSiswa < jumlahSiswa; indexSiswa++) {
            System.out.println("    Siswa Ke - %s = ".formatted(indexSiswa + 1));

            for (int indexMataPelajaran = 0; indexMataPelajaran < jumlahMataPelajaran; indexMataPelajaran++) {
                System.out.print("      Nilai Mata Pelajaran %s = ".formatted(indexMataPelajaran + 1)); 
                nilaiSiswa[indexKelas][indexSiswa][indexMataPelajaran] = input.nextInt();
            }
        }
    }

// prepare
    int totalLulus = 0,totalRemedial = 0,totalTidakLulus = 0;
    

// Looping / Decision

     for (int indexKelas = 0; indexKelas < jumlahKelas; indexKelas++) {
        System.out.println("Kelas %s".formatted(indexKelas + 1));

        for (int indexSiswa = 0; indexSiswa < jumlahSiswa; indexSiswa++) {
            
            int totalNilai = 0;

            for (int indexMataPelajaran = 0; indexMataPelajaran < jumlahMataPelajaran; indexMataPelajaran++) { 
               totalNilai = nilaiSiswa [indexKelas][indexSiswa][indexMataPelajaran] + totalNilai;  
            }

// Prepare
            double avarage  = 0;
            avarage = totalNilai / jumlahMataPelajaran;

// Decision / Looping
            String keterangan;

                if(avarage >= 90){
                    keterangan = "Lulus";
                    totalLulus++;

                }else if(avarage >70) {
                    keterangan = "Remedial";
                    totalRemedial++;
                }else if(avarage <= 70 ){
                    keterangan = "Tidak Lulus";
                    totalTidakLulus++;
                }
// Output
            System.out.println("Siswa Ke-%s: Rata-rata nilai = %.2f".formatted(indexSiswa + 1, avarage));
        }
     }
        System.out.println("Total Siswa Lulus       : " + totalLulus);
        System.out.println("Total Siswa Remedial    : " + totalRemedial);
        System.out.println("Total Siswa Tidak Lulus : " + totalTidakLulus);
}    
}

