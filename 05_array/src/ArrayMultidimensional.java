public class ArrayMultidimensional {
    public static void main(String[] args) {
        // int[][] daftarNilaiMahasiswa = new int[2][4];
        int[][] daftarNilaiMahasiswa = {
            {3, 4, 2, 6},
            {9, 12, 15, 16}
        };
        
        // 3, 4, 2, 6
        // 9, 12, 15, 16
        
        // daftarNilaiMahasiswa[0][0] = 3;
        // daftarNilaiMahasiswa[0][1] = 4;
        // daftarNilaiMahasiswa[0][2] = 2;
        // daftarNilaiMahasiswa[0][3] = 6;

        // daftarNilaiMahasiswa[1][0] = 9;
        // daftarNilaiMahasiswa[1][1] = 12;
        // daftarNilaiMahasiswa[1][2] = 15;
        // daftarNilaiMahasiswa[1][3] = 16;

        for (int indexDimensiSatu = 0; indexDimensiSatu < daftarNilaiMahasiswa.length; indexDimensiSatu++) {
           for(int indexDimensiDua = 0; indexDimensiDua < daftarNilaiMahasiswa[indexDimensiSatu].length; indexDimensiDua++){
            System.out.println(daftarNilaiMahasiswa[indexDimensiSatu][indexDimensiDua]);
           }
        }
        
    }
}