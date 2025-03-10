import java.util.Scanner;

public class LatihanJava3 {
    public static void main(String[] args){


        double beratBadan = 0,tinggiBadanMeter = 0,tinggiBadanSenti, indexBMI;


        Scanner input = new Scanner(System.in);

        // Input Awal

        System.out.print("Masukkan Nama Anda = ");
        String namaLengkap = input.next();

        System.out.print("Masukkan Berat Badan Anda (kg) = ");
        beratBadan = input.nextInt();

        System.out.print("Masukkan Tinggi Badan Anda (cm) = ");
        tinggiBadanSenti = input.nextInt();

        //  Rumus Menghitung BMI

        tinggiBadanMeter = tinggiBadanSenti/100;
        indexBMI = beratBadan/(tinggiBadanMeter * tinggiBadanMeter);

        // Condition

        String status = null;

        if (indexBMI > 30.0) {
            status = "Obesitas";
        } else if (indexBMI > 25.0) {
            status = "Kelebihan Berat Badan";
        }else if (indexBMI > 18.5){
            status = "Normal ";
        }else if (indexBMI <= 18.5){
            status = "Kurus";
        }

        // Output
        System.out.println("Nama = " + namaLengkap);
        System.out.println("Berat Badan = " + beratBadan);
        System.out.println("Tinggi Badan = " + tinggiBadanSenti);
        System.out.println("Indeks BMI = " + indexBMI );
        System.out.println(status);
    }
}
