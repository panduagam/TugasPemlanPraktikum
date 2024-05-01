package TokoKue;

public class MainKue {
    public static void main(String[] args) {
        Kue[] ListKue = new Kue[20]; 

        ListKue[0] = new KuePesanan("Kue Lumpur", 20000.0, 1);
        ListKue[1] = new KueJadi("Kue Klepon", 1000.0, 10);
        ListKue[2] = new KuePesanan("Kue Lumpur Ketan", 25000.0, 2);
        ListKue[3] = new KueJadi("Kue Lumpur Mangkok", 1500.0, 20);
        ListKue[4] = new KuePesanan("Kue Putu", 20000.0, 3);
        ListKue[5] = new KueJadi("Kue Lapis Legit", 2000.0, 25);
        ListKue[6] = new KuePesanan("Kue Serabi", 22000.0, 4);
        ListKue[7] = new KueJadi("Kue Apem", 2500.0, 10);
        ListKue[8] = new KuePesanan("Kue Talam", 26000.0, 5);
        ListKue[9] = new KueJadi("Kue Lapis Surabaya", 3000, 100);
        ListKue[10] = new KuePesanan("Kue Nagasari", 21500, 4);
        ListKue[11] = new KueJadi("Kue Dadar Gulung", 3500, 40);
        ListKue[12] = new KuePesanan("Kue Bolu Kukus", 30000, 3);
        ListKue[13] = new KueJadi("Kue Bingka", 4000, 35);
        ListKue[14] = new KuePesanan("Kue Pancong", 22000, 2);
        ListKue[15] = new KueJadi("Kue Bingka Ambon", 4500, 40);
        ListKue[16] = new KuePesanan("Kue Gethuk", 25000, 4);
        ListKue[17] = new KueJadi("Mendut", 5000, 30);
        ListKue[18] = new KuePesanan("Kue Wajik", 15000, 1);
        ListKue[19] = new KueJadi("Kue Kucur", 2000, 45);

        for (int i = 0; i < ListKue.length; i++) {
            Kue kue = ListKue[i];
            System.out.println(kue);
        }
        
        double totalHargaSemua = 0;
        for (int i = 0; i < ListKue.length; i++) {
            Kue kue = ListKue[i];
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("Total Harga Semua Kue\t: " + totalHargaSemua + "\n");

        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (int i = 0; i < ListKue.length; i++) {
            if(ListKue[i] instanceof KuePesanan) {
                KuePesanan kuePesanan = (KuePesanan) ListKue[i];
                totalHargaPesanan += kuePesanan.hitungHarga();
                totalBeratPesanan += kuePesanan.getBerat();
            }
        }
        System.out.println("Total Harga Semua Kue Pesanan\t: " + totalHargaPesanan);
        System.out.println("Total Berat Semua Kue Pesanan\t: " + totalBeratPesanan + "\n");

        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (int i = 0; i < ListKue.length; i++) {
            if(ListKue[i] instanceof KueJadi) {
                KueJadi kueJadi = (KueJadi) ListKue[i];
                totalHargaJadi += kueJadi.hitungHarga();
                totalJumlahJadi += kueJadi.getJumlah();
            }
        }
        System.out.println("Total Harga Semua Kue Jadi\t: " + totalHargaJadi);
        System.out.println("Total Jumlah Semua Kue Jadi\t: " + totalJumlahJadi);

        double hargaMaksimum = Double.MIN_VALUE;
        Kue hargaKueTerbesar = null;
        for (int i = 0; i < ListKue.length; i++) {
            if(ListKue[i].hitungHarga() > hargaMaksimum) {
                hargaMaksimum = ListKue[i].hitungHarga();
                hargaKueTerbesar = ListKue[i];
            }
        }
        System.out.println("\nKue dengan harga akhir terbesar\n" + hargaKueTerbesar);

    }

}
