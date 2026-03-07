package asd_job3;
import java.util.Scanner;
public class DosenDemo07 {
  static String kode, nama, dummy;
  static Boolean jenisKelamin;
  static int usia;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah dosen: ");
    int n = sc.nextInt();
    sc.nextLine();

    Dosen07[] arrayOfDosen07 = new Dosen07[n];

    for (int i = 0; i < n; i++) {
      System.out.println("-------------------------------");
      System.out.print("Masukkan kode dosen ke-"+(i+1)+": ");
      kode = sc.nextLine();
      System.out.print("Masukkan nama dosen ke-"+(i+1)+": ");
      nama = sc.nextLine();
      boolean k=false;
      do {
        System.out.print("Masukkan jenis kelamin dosen ke-"+(i+1)+" (L/P): ");
        dummy = sc.nextLine();
        if (dummy.equalsIgnoreCase("L")) {
          jenisKelamin=true;
          k=false;
        } else if (dummy.equalsIgnoreCase("P")) {
          jenisKelamin=false;
          k=false;
        } else {
          System.out.println("Input jenis kelamin tidak valid. Harap masukkan 'L' untuk laki-laki atau 'P' untuk perempuan.");
          k=true;
        }
      } while (k);
      System.out.print("Masukkan usia dosen ke-"+(i+1)+": ");
      usia = sc.nextInt();
      sc.nextLine();

      arrayOfDosen07[i] = new Dosen07(kode, nama, jenisKelamin, usia);
      System.out.println("-------------------------------");
    }

    System.out.println("\nData Dosen:");
    System.out.printf("%-20s %-20s %-15s %-5s", "Kode", "Nama", "Jenis Kelamin", "Usia");
    System.out.println("\n-------------------------------------------------------------");
    for (Dosen07 dosen : arrayOfDosen07) {
      String jk = dosen.jenisKelamin ? "Laki-laki" : "Perempuan";
      System.out.printf("%-20s %-20s %-15s %-5d\n", dosen.kode, dosen.nama, jk, dosen.usia);
    }
    sc.close();
  }
}
