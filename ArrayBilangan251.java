import java.util.Scanner;

public class ArrayBilangan251 {
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       int[] bil = new int[4];
       bil[0] = (int) 5.0;
       bil[1] = 12867;
       bil[2] = (int) 7.5;
       bil[3] = 2000000;

       for (int i = 0; i <= 4; i++){
            System.out.println(bil[i]);
       }
    }
}
