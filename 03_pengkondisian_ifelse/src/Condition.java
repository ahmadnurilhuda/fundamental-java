import java.util.Scanner;

public class Condition {
    public static void main(String[] args) throws Exception {



        // int umur = 15;70

        // if (umur>=20) {
        //     System.out.println("anda sudah dewasa");
        // } else {
        //     System.out.println("belum dewasa");
        // }
        

    // Nest Condition (&&(dan) || (atau))
    // && menghasilkan true jika 22 nya benar2 true
    // || menghasilkan true jika salah satunya ada yang true

        //  int umur = 15;
        //  boolean isMan = true;

        // if (umur >=20 && isMan) {
        //     System.out.println("anda sudah dewasa");
        // } else {
        //     System.out.println("belum dewasa");
        // }        

        Scanner input = new Scanner(System.in);

        int nilai = input.nextInt();

        if(nilai > 100 || nilai <= 0){
            System.out.println("Nilai Tidak Valid, Harus 0-100");
        } else if (nilai > 80) {
            System.out.println("Grade A");
        } else if (nilai > 70){
            System.out.println("Grade B");
        } else if (nilai > 60) {
            System.out.println("Grade C");
        } else if ( nilai <= 60){
            System.out.println("Grade E");
        }

        String keterangan;

        // if(nilai >= 80){
        //     keterangan = "Lulus";
        // }else if (nilai > 70){
        //     keterangan ="remedia";
        // }else{
        //     keterangan = "Tidak Lulus"
        // }

        // cara lain menulis IF ELSE

        keterangan = nilai >= 80? "Lulus" : nilai >= 70? "Remedial" : "Tidak Lulus";

    }
}
