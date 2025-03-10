import java.util.Scanner;
public class NestedCondition {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        boolean isWargaIndonesia;
        int penghasilan, umur, jumlahAnak;

        System.out.print("APAKAH WNI? (YA/TIDAK)");
        isWargaIndonesia = input.next().compareTo("YA" )==0;

        System.out.print("PENGHASILAN?");
        penghasilan = input.nextInt();

        System.out.print("UMUR?");
        umur = input.nextInt();

        System.out.print("JUMLAH ANAK?");
        jumlahAnak = input.nextInt();


        if(isWargaIndonesia){
            if (umur >=50) {
                if (penghasilan >= 4000000) {
                    if(jumlahAnak >=2){
                        System.out.println("Anda berhak mendapat bansos 2jt");
                    } else{
                        System.out.println("Anda berhak mendapat bansos 1 jt");
                    }
                
                }else{
                    System.out.println("Penghasilan Anda Melebihi");
                }
                
            }else{
                System.out.println("Umur Anda Belum Sesuai Menerima Bansos");
            }

        }else{
            System.out.println("Anda Bukan WNI");
        }

    }
}
