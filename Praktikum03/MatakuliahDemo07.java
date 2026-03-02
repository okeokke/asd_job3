package asd_job3.Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Matakuliah07[] arrayOfMatakuliah07 = new Matakuliah07[3];
    String kode, nama, dummy;
    int sks, jumlahJam;

    for (int i = 0; i < arrayOfMatakuliah07.length; i++) {
      System.out.println("Masukkan data Matakuliah ke-"+(i+1));
      System.out.print("Kode \t: ");
      kode = sc.nextLine();
      System.out.print("Nama \t: ");
      nama = sc.nextLine();
      System.out.print("SKS \t: ");
      dummy = sc.nextLine();
      sks = Integer.parseInt(dummy);
      System.out.print("Jumlah Jam : ");
      dummy = sc.nextLine();
      jumlahJam = Integer.parseInt(dummy);
      System.out.println("------------------------------");

      arrayOfMatakuliah07[i] = new Matakuliah07(kode, nama, sks, jumlahJam);
    }

    System.out.println("----------------------------------------");
    
    for (int i = 0; i < arrayOfMatakuliah07.length; i++) {
      System.out.println("Data Matakuliah ke-"+(i+1));
      System.out.println("Kode \t: "+arrayOfMatakuliah07[i].kode);
      System.out.println("Nama \t: "+arrayOfMatakuliah07[i].nama);
      System.out.println("SKS \t: "+arrayOfMatakuliah07[i].sks);
      System.out.println("Jumlah Jam : "+arrayOfMatakuliah07[i].jumlahJam);
      System.out.println("----------------------------------------");
    }
  }
}