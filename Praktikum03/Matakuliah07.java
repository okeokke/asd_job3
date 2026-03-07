package asd_job3.Praktikum03;
import java.util.Scanner;
public class Matakuliah07 {
  public String kode;
  public String nama;
  public int sks;
  public int jumlahJam;

  public Matakuliah07(String kode, String nama, int sks, int jumlahJam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
  }

  public static Matakuliah07 tambahData(Scanner sc) {
    String kode, nama;
    int sks, jumlahJam;
    String dummy;
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

    return new Matakuliah07(kode, nama, sks, jumlahJam);
  }

  public void cetakInfo() {
    System.out.println("Kode \t: "+this.kode);
    System.out.println("Nama \t: "+this.nama);
    System.out.println("SKS \t: "+this.sks);
    System.out.println("Jumlah Jam : "+this.jumlahJam);
  }
}