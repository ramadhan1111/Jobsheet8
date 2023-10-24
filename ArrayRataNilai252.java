import java.util.Scanner;
public class ArrayRataNilai252 {
 public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int[] nilaiMhs = new int[5];
    double rata1,rata2;
    double total1=0;
    double total2 = 0;;
    int jmlMhs;
    int jmllulus=0;
    int jmltdklulus =0;
    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    }  
    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i] > 70){
            total1 += nilaiMhs[i];
            jmllulus++;
        }else{
            total2 += nilaiMhs[i];
            jmltdklulus++;
        }
    } 
    rata1= total1/jmllulus;
    rata2= total2/jmltdklulus;

    System.out.println("Rata-rata nilai lulus : "+rata1);
    System.out.println("rata rata nilai tidak lulus: " +rata2);
    }

}