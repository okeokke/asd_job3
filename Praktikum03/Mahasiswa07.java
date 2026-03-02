package asd_job3.Praktikum03;
public class Mahasiswa07 {
  public String nim;
  public String nama;
  public String kelas;
  public float ipk;  

  public void cetakInfo(Mahasiswa07[] arrayOfMahasiswa, int index) {
      System.out.println("Data mahasiswa ke-" + (index+1));
      System.out.println("NIM\t: "+arrayOfMahasiswa[index].nim);
      System.out.println("Nama\t: "+arrayOfMahasiswa[index].nama);
      System.out.println("Kelas\t: "+arrayOfMahasiswa[index].kelas);
      System.out.println("IPK\t: "+arrayOfMahasiswa[index].ipk);
      System.out.println("-----------------------------------");
  }
}