package TugasPraktikumPemlan06;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        char konfirmasi;
        
        System.out.println("Selamat datang di program catatan tagihan!");
        do {
            System.out.println("\n======================================\n");
            System.out.println("Masukkan identitas Anda!");
            System.out.print("Masukkan nama Anda\t: ");
            String name = sc.nextLine();
            System.out.print("Masukkan nomor registrasi Anda\t: ");
            int registrationNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan gaji per bulan Anda\t: ");
            int salaryPerMonth = sc.nextInt();

            employee = new(registrationNumber, name, salaryPerMonth, null);

            System.out.println("Detail identitas Anda : ");
            System.out.println(employee);

            System.out.print("Apakah identitas Anda sudah benar? (y/n) ");
            konfirmasi = sc.next().charAt(0);
        } while (konfirmasi != 'y' && konfirmasi != 'Y');
        System.out.println("\n======================================\n");

        System.out.print("Berapa barang yang ingin Anda beli?");
        int n = sc.nextInt();
        employee.setInvoices(new Invoice[n]);

        for (int i = 0; i < n; i++) {
            System.out.println("/nMasukkan detail produk yang Anda beli!");
            System.out.print("Masukkan nama produk\t: ");
            String productName = sc.nextLine();
            System.out.print("Masukkan jumlah produk\t: ");
            int quantity = sc.nextInt();
            System.out.print("Masukkan harga satuan produk\t: ");
            int pricePerItem = sc.nextInt();

            employee.getInvoices()[i] = new Invoice(productName, quantity, pricePerItem);

            System.out.println("Detail produk : ");
            System.out.println(employee.getInvoices()[i]);
        }

        System.out.println("\n======================================\n");
        System.out.println("Detail tagihan Anda : ");
        for (int i = 0; i < n; i++) {
            System.out.println(employee.getInvoices()[i]);
        }

        int remainingSalary = employee.getSalaryPerMonth() - employee.getPayableAmount();
        System.out.println("\n======================================\n");
        System.out.println("Total tagihan Anda\t: " + employee.getPayableAmount());
        System.out.println("Sisa gaji Anda\t: " + remainingSalary);
        System.out.println("Terima kasih telah menggunakan program ini!");
        System.out.println("\n======================================\n");
        sc.close();
        
        
    }
}
