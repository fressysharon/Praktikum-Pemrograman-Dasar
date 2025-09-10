import java.util.Scanner;

public class laprak01 {

     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int a, b;
          int penjumlahan, pengurangan, perkalian;
          double pembagian;

          // input
          System.out.print("Masukkan operator pertama : ");
          a = input.nextInt();
          System.out.print("Masukkan operator kedua   : ");
          b = input.nextInt();

          // hitung
          penjumlahan = a + b;
          pengurangan = a - b;
          perkalian = a * b;
          pembagian = (double) a / b;

          // output
          System.out.println("Hasil penjumlahan : " + penjumlahan);
          System.out.println("Hasil pengurangan : " + pengurangan);
          System.out.println("Hasil perkalian   : " + perkalian);
          System.out.println("Hasil pembagian   : " + pembagian);
     }
}
