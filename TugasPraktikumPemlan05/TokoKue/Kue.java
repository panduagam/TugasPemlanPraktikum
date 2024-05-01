package TokoKue;

public abstract class Kue{
    private String nama;
    private double harga;

    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString(){
        return "Nama Kue\t: " + nama + "\nHarga Kue\t: " + harga;
    }
}

class KuePesanan extends Kue{
    private double berat;

    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat(){
        return berat;
    }

    @Override
    public double hitungHarga(){
        return getHarga() * berat;
    }

    @Override
    public String toString(){
        return super.toString() + "\nJenis Kue\t: Kue Pesanan \nBerat Kue\t: " + berat + " KG\nTotal Harga\t: " + hitungHarga() + "\n";
    }
}

class KueJadi extends Kue{
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga(){
        return getHarga() * jumlah * 2;
    }

    public String toString(){
        return super.toString() + "\nJenis Kue\t: Kue Jadi \nJumlah Kue\t: " + jumlah + " Buah\nTotal Harga\t: " + hitungHarga() + "\n";
    }
}