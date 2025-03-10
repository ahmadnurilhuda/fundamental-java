import java.util. Scanner;

public class LatihanJava2 {
    
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);


        int jamKerjaReguler = 0, jamKerjaLembur = 0;
        int tarifJamReguler = 0, tarifJamlembur = 0;
        int tunjanganTetap = 0;
        double bonus;
        double gajiReguler, gajiLembur, totalGaji, totalGajiAkhir;


        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = input.next();

        System.out.print("Masukkan Jumlah Jam Kerja Reguler Dalam Sebulan: ");
        jamKerjaReguler = input.nextInt();

        System.out.print("Masukkan Jumlah Jam Lembur Dalam Sebulan: " );
        jamKerjaLembur = input.nextInt();       

        System.out.print("Masukkan Tarif Per Jam Reguler: " );
        tarifJamReguler = input.nextInt(); 
        
        System.out.print("Masukkan Tarif Per Jam Lembur: " );
        tarifJamlembur = input.nextInt(); 

        System.out.print("Masukkan Tunjangan Tetap: " );
        tunjanganTetap = input.nextInt(); 


        gajiReguler = jamKerjaReguler * tarifJamReguler;
        gajiLembur = jamKerjaLembur * tarifJamlembur;
        totalGaji = gajiReguler + gajiLembur + tunjanganTetap;
        bonus = totalGaji * 0.05;
        totalGajiAkhir = totalGaji+bonus;


        System.out.println("Gaji Karyawan Atas Nama " + namaKaryawan);
        System.out.println("--------------------------------");
        System.out.println("Gaji Reguler = Rp" + gajiReguler);
        System.out.println("Gaji Lembur = Rp" + gajiLembur);
        System.out.println("Tunjagan Tetap = Rp" + tunjanganTetap);
        System.out.println("Total Gaji = Rp" + totalGaji);
        System.out.println("Bonus = Rp" + bonus);
        System.out.println("Total Gaji Akhir = Rp" + totalGajiAkhir);

        // ini contoh merubah isi file untuk tracking perubahan menggunakan git



        
        


    }
}
