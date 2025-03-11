import java.util.Random;
import java.util.Scanner;
public class LatihanJava4 {
    public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int jumlahSoal = 0, jawabanUser = 0, hasilSoal = 0, totalBenar = 0, totalSalah = 0 ;

    

// input soal yang diinginkan
    System.out.println("Mari kita main hitung-hitungan");
    System.out.print("Pilih Jumlah Soal Yang Ingin Anda Kerjakan (1-5)= ");
    jumlahSoal = input.nextInt();
    
//condition

    for(int i = 1 ; i <=jumlahSoal ; i++) {

        int angkaAcak1 = random.nextInt(100);
        int angkaAcak2 = random.nextInt(100);

        System.out.print("Berapa Hasil dari %s + %s ?".formatted(angkaAcak1,angkaAcak2));
        jawabanUser = input.nextInt();

        hasilSoal = angkaAcak1 + angkaAcak2;

        if (jawabanUser == hasilSoal){
            System.out.println("Jawaban Anda Benar!");
            totalBenar++;
    

        } if(jawabanUser != hasilSoal) {
                System.out.println("Jawaban Anda Salah! Jawabannya yang benar adalah %s".formatted(hasilSoal));
                totalSalah++;
            }
        }
        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("Total Jawaban Benar : " + totalBenar);
        System.out.println("Total Jawaban Salah : " + totalSalah);
    }
        
    }

