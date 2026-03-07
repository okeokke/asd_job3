package asd_job3;

public class DataDosen07 {
  public static void dataSemuaDosen07(Dosen07[] arrayOfDosen07) {
    System.out.println("Data Semua Dosen:");
    for (Dosen07 dosen : arrayOfDosen07) {
      String jenisKelamin = dosen.jenisKelamin ? "Laki-laki" : "Perempuan";
      System.out.println("Kode: " + dosen.kode);
      System.out.println("Nama: " + dosen.nama);
      System.out.println("Jenis Kelamin: " + jenisKelamin);
      System.out.println("Usia: " + dosen.usia + " tahun");
      System.out.println("-------------------------");
    }
  }

  public static void jumlahDosenPerJeniskelamin07(Dosen07[] arrayOfDosen07) {
    int Laki = 0;
    int Perempuan = 0;
    for (Dosen07 dosen : arrayOfDosen07) {
      if (dosen.jenisKelamin) {
        Laki++;
      } else {
        Perempuan++;
      }
    }
    System.out.println("Jumlah Dosen Laki-Laki: " + Laki);
    System.out.println("Jumlah Dosen Perempuan: " + Perempuan);
  }

  public static void rerataUsiaDosenPerJenisKelamin07(Dosen07[] arrayOfDosen07) {
    int totalUsiaLaki = 0;
    int totalUsiaPerempuan = 0;
    int jumlahLaki = 0;
    int jumlahPerempuan = 0;

    for (Dosen07 dosen : arrayOfDosen07) {
      if (dosen.jenisKelamin) {
        totalUsiaLaki += dosen.usia;
        jumlahLaki++;
      } else {
        totalUsiaPerempuan += dosen.usia;
        jumlahPerempuan++;
      }
    }

    double rerataUsiaLaki = (jumlahLaki > 0) ? (double) totalUsiaLaki / jumlahLaki : 0;
    double rerataUsiaPerempuan = (jumlahPerempuan > 0) ? (double) totalUsiaPerempuan / jumlahPerempuan : 0;

    System.out.printf("Rerata Usia Dosen Laki-Laki: %.2f\n", rerataUsiaLaki);
    System.out.printf("Rerata Usia Dosen Perempuan: %.2f\n", rerataUsiaPerempuan);
  }

  void infoDosenPalingTua07(Dosen07[] arrayOfDosen07) {
    Dosen07 tua = arrayOfDosen07[0];
    for (Dosen07 d : arrayOfDosen07) {
      if (d.usia > tua.usia) tua = d;
    }
    String jk = tua.jenisKelamin ? "Laki-laki" : "Perempuan";
    System.out.println("\nDosen Paling Tua:");
    System.out.println("Kode\t\t: " + tua.kode);
    System.out.println("Nama\t\t: " + tua.nama);
    System.out.println("Jenis Kelamin\t: " + jk);
    System.out.println("Usia\t\t: " + tua.usia);
  }

  void infoDosenPalingMuda07(Dosen07[] arrayOfDosen07) {
    Dosen07 muda = arrayOfDosen07[0];
    for (Dosen07 d : arrayOfDosen07) {
      if (d.usia < muda.usia) muda = d;
    }
    String jk = muda.jenisKelamin ? "Laki-laki" : "Perempuan";
    System.out.println("\nDosen Paling Muda:");
    System.out.println("Kode\t\t: " + muda.kode);
    System.out.println("Nama\t\t: " + muda.nama);
    System.out.println("Jenis Kelamin\t: " + jk);
    System.out.println("Usia\t\t: " + muda.usia);
  }
}
