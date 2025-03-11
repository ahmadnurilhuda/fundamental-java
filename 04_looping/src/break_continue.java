import java.util.Scanner;
public class break_continue {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

// Break
// Kegiatan = Menebak Angka
// Angka yang harus ditebak adalah 12
// User input angka tebakkan
// Loop meminta user untuk menebak angka sampai benar
// User hanya bisa menebak sebanyak 5x

        int randomNumbers = 12;
        int inputNumbers = 0;

        for (int index = 1 ; index <= 5 ; index++) {
            if (inputNumbers == randomNumbers) {
                System.out.print("Anda Berhasil Menebak Angka");
                break;
            }
            System.out.print("Tebak Angka = ");
            inputNumbers = input.nextInt();

            if(index ==5){
                System.out.println("Anda Sudah Menebak 5x, silahkan re run code ini.");

            }
        }
        System.out.print("Terimakasih Sudah Bermain");
        
        

        
        
    }
}
