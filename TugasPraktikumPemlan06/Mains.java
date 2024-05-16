package TugasPraktikumPemlan06;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        
        System.out.println("Selamat datang di program catatan tagihan!");
        System.out.println("\n======================================\n");
        System.out.println("Masukkan identitas Anda!");
        System.out.print("Masukkan nama Anda\t\t: ");
        String name = sc.nextLine();
        System.out.print("Masukkan nomor registrasi Anda\t: ");
        int registrationNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan gaji per bulan Anda\t: ");
        int salaryPerMonth = sc.nextInt();
        sc.nextLine();

        employee = new Employee(registrationNumber, name, salaryPerMonth, null);

        System.out.println("\nDetail identitas Anda \t: ");
        System.out.println(employee);        
        System.out.println("\n======================================\n");

        System.out.print("Berapa barang yang ingin Anda beli? ");
        int n = sc.nextInt();
        sc.nextLine();
        employee.setInvoices(new Invoice[n]);

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan detail produk yang Anda beli!");
            System.out.print("Masukkan nama produk\t\t: ");
            String productName = sc.nextLine();
            System.out.print("Masukkan jumlah produk\t\t: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan harga satuan produk\t: ");
            int pricePerItem = sc.nextInt();
            sc.nextLine();

            employee.getInvoices()[i] = new Invoice(productName, quantity, pricePerItem);

            System.out.println("\nDetail produk \t: ");
            System.out.println(employee.getInvoices()[i]);
        }

        System.out.println("\n======================================\n");
        System.out.println("Detail tagihan Anda : \n");
        for (int i = 0; i < n; i++) {
            System.out.println(employee.getInvoices()[i] + "\n");
        }

        int remainingSalary = employee.getSalaryPerMonth() - employee.getPayableAmount();
        System.out.println("\n======================================\n");
        System.out.println("Total tagihan Anda\t: " + employee.getPayableAmount());
        System.out.println("Sisa gaji Anda\t\t: " + remainingSalary);
        System.out.println("\nTerima kasih telah menggunakan program ini!");
        System.out.println("\n======================================\n");
        sc.close();
        
        
    }
}
