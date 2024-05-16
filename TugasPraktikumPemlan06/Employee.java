package TugasPraktikumPemlan06;

public class Employee implements Payable{
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double total = 0;
        for (int i = 0; i < invoices.length; i++) {
            total += invoices[i].getPayableAmount();
        }     
        return total;
    }

    @Override
    public String toString() {
        return "Nama\t: " + name +
                "\nNomor Registrasi\t: " + registrationNumber +
                "\nGaji per Bulan\t: " + salaryPerMonth + "\n";  
    }

}
