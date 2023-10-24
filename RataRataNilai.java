import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         String namaMatkul;
         int [] nilaiMhs = new int [10];
         double totalNilai = 0;
         double rataNilai;
         int jmlNilai = 0;
         int countLulus = 0;


         System.out.print("Masukkan nama mata kuliah: ");
         namaMatkul = sc.nextLine();

         System.out.print("Masukkan jumlah nilai: ");
         jmlNilai = sc.nextInt();

         for (int i = 0; i < jmlNilai; i++){
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70){
                totalNilai += nilaiMhs[i];
                countLulus++;
        
            }
         }

         if (countLulus > 0){
            rataNilai = totalNilai / countLulus;
            System.out.println("Rata-rata nilai yang lulus: "+rataNilai);
         }else{
            System.out.println("Tidak ada mahasiswa yang lulus");
         }
       
         }
    }