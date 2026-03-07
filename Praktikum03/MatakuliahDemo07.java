package asd_job3.Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah Matakuliah : ");
    int jmlMK = Integer.parseInt(sc.nextLine());

    Matakuliah07[] arrayOfMatakuliah07 = new Matakuliah07[jmlMK];

    for (int i = 0; i < arrayOfMatakuliah07.length; i++) {
      System.out.println("Masukkan data Matakuliah ke-"+(i+1));
      arrayOfMatakuliah07[i] = Matakuliah07.tambahData(sc);
      System.out.println("------------------------------");
    }

    System.out.println("\n===============================\n");
    
    for (int i = 0; i < arrayOfMatakuliah07.length; i++) {
      System.out.println("Data Matakuliah ke-"+(i+1));
      arrayOfMatakuliah07[i].cetakInfo();
      System.out.println("----------------------------------------");
    }

    sc.close();
  }
}