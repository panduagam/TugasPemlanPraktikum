package filkomub;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        if (lamaKerja <= 5) {
            return gaji * 0.05;
        } else if (lamaKerja <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString() {
        String formatTahunMasuk = tahunMasuk.format(DateTimeFormatter.ofPattern("d M yyyy"));
        return super.toString() +
                "Tahun Masuk\t: " + formatTahunMasuk + "\n" +
                "Jumlah Anak\t: " + jumlahAnak + "\n" +
                "Gaji\t\t: $" + gaji + "\n";
    }
}