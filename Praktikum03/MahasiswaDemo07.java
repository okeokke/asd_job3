package asd_job3.Praktikum03;
import java.util.Scanner;
public class MahasiswaDemo07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Mahasiswa07[] arrayOfMahasiswa = new Mahasiswa07[3]; 
    for (int i = 0; i < arrayOfMahasiswa.length; i++) {
      arrayOfMahasiswa[i] = new Mahasiswa07();
      System.out.println("Masukkan data mahasiswa ke-" + (i+1));
      System.out.print("NIM\t: ");
      arrayOfMahasiswa[i].nim = sc.nextLine();
      System.out.print("Nama\t: ");
      arrayOfMahasiswa[i].nama = sc.nextLine();
      System.out.print("Kelas\t: ");
      arrayOfMahasiswa[i].kelas = sc.nextLine();
      System.out.print("IPK\t: ");
      arrayOfMahasiswa[i].ipk = sc.nextFloat();
      sc.nextLine();
      System.out.println("-----------------------------------");
    }

    System.out.println("=================================");

    for (int i = 0; i < arrayOfMahasiswa.length; i++) {
      System.out.println("Data mahasiswa ke-" + (i+1));
      System.out.println("NIM\t: "+arrayOfMahasiswa[i].nim);
      System.out.println("Nama\t: "+arrayOfMahasiswa[i].nama);
      System.out.println("Kelas\t: "+arrayOfMahasiswa[i].kelas);
      System.out.println("IPK\t: "+arrayOfMahasiswa[i].ipk);
      System.out.println("-----------------------------------");
    }
  }
}