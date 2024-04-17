package filkomub;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Integer.parseInt(nim.substring(6, 7));
        String[] listProdi = {"Teknik Informatika", "Teknik Komputer", "Sistem Informasi", "Pendidikan Teknologi Komputer", 
        "Teknologi Komputer"};
        return listProdi[prodi - 2] + ", " + (2000 + angkatan);
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
      return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() +
                "NIM\t\t: " + nim + "\n" +
                "IPK\t\t: " + ipk + "\n" +
                "Status\t\t: " + getStatus() + "\n";}

}