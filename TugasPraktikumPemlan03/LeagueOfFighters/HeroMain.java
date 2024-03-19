package LeagueOfFighters;
 
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Welcome to the League of Fighters!");

        System.out.print("Anda akan diminta untuk memilih dua nama Champion yang akan bertarung.\n"
                        + "Berikan juga nilai HP (Health Point), Attack, dan Defense untuk kedua Champion.\n"
                        + "Untuk bagian angka, Anda hanya bisa memasukkan angka antara 100 hingga 1000.\n"
                        + "===================================================================================\n");
        
        Hero champion1 = new Hero();
        System.out.println("Player 1 \t: Silahkan masukkan Champion!");
        System.out.print("Name \t\t: ");
        champion1.setName(scn.nextLine());
        System.out.print("HP \t\t: ");
        champion1.setHp(scn.nextDouble());
        System.out.print("Attack \t\t: ");
        champion1.setAttack(scn.nextDouble());
        System.out.print("Defense \t: ");
        champion1.setDefense(scn.nextDouble());
        
        System.out.println("Player 2 \t: Silahkan masukkan Champion!");
        System.out.println("Name \t\t: ");
        String name2 = scn.nextLine();
        System.out.println("HP \t\t: ");
        double hp2 = scn.nextDouble();
        System.out.println("Attack \t\t: ");
        double attack2 = scn.nextDouble();
        System.out.println("Defense \t: ");
        double defense2 = scn.nextDouble();
        Hero champion2 = new Hero(name2, hp2, attack2, defense2);

        
    }
}
