package filkomub;

public class TestCase {
    public static void main(String[] args) {
        Manusia lakilakiMenikah = new Manusia("Shinichi Kudo", "4868", true,true);
        System.out.println(lakilakiMenikah);
        Manusia perempuanMenikah = new Manusia("Ran Mouri", "4867", false,true);
        System.out.println(perempuanMenikah);
        Manusia belumMenikah = new Manusia("Conan", "4869", true,false);
        System.out.println(belumMenikah);

        MahasiswaFILKOM ipkRendah = new MahasiswaFILKOM("235150400111102", 2.3, "Gibran", "0002", 
        true, false);
        System.out.println(ipkRendah);
        MahasiswaFILKOM ipkSedang = new MahasiswaFILKOM("235150400111100", 3.2, "Bahlil", "0202", 
        false, false);
        System.out.println(ipkSedang);
        MahasiswaFILKOM ipkTinggi = new MahasiswaFILKOM("235150400111101", 3.9, "Anies", "0001", 
        true, false);
        System.out.println(ipkTinggi);

        Pekerja junior = new Pekerja(1000, 2022, 4, 15, 2, "Ahri", "1234", false, true);
        System.out.println(junior);
        Pekerja senior = new Pekerja(3000, 2015, 4, 12, 0, "Kaisa", "4567", false, false);
        System.out.println(senior);
        Pekerja sepuh = new Pekerja(5000, 2004, 4, 10, 10, "Kayn", "7890", true, true);
        System.out.println(sepuh);

        Manager pro = new Manager("HRD", 10000, 2009, 4, 9, 3, "Ezreal", "9999", true, 
        true);
        System.out.println(pro);
    }
}