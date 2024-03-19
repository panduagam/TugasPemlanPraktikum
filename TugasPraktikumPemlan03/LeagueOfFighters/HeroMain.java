package LeagueOfFighters;
 
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Welcome to the League of Fighters!\n");

        System.out.print("Anda akan diminta untuk memilih dua nama Champion yang akan bertarung.\n"
                        + "Berikan juga nilai HP (Health Point), Attack, dan Defense untuk kedua Champion.\n"
                        + "Untuk bagian angka, dana hanya bisa memasukkan angka antara 0 hingga 1000.\n"
                        + "===================================================================================\n");

        Hero champion1 = new Hero();
        System.out.println("Player 1 \t: Silahkan masukkan Champion!");
        System.out.print("Name \t\t: ");
        champion1.setName(scn.nextLine());

        double hp1;
        do {
            System.out.print("HP \t\t: ");
            hp1 = scn.nextDouble();
            if (hp1 < 0 || hp1 > 1000) {
                System.out.println("Invalid input! HP harus di antara 0 dan 1000.");
            }
        } while (hp1 < 0 || hp1 > 1000);
        champion1.setHp(hp1);

        double attack1;
        do {
            System.out.print("Attack \t\t: ");
            attack1 = scn.nextDouble();
            if (attack1 < 0 || attack1 > 1000) {
                System.out.println("Invalid input! Attack harus di antara 0 dan 1000.");
            }
        } while (attack1 < 0 || attack1 > 1000);
        champion1.setAttack(attack1);

        double defense1;
        do {
            System.out.print("Defense \t: ");
            defense1 = scn.nextDouble();
        } while (defense1 < 0 || defense1 > 1000);
        champion1.setDefense(defense1);

        System.out.println("\nPlayer 2 \t: Silahkan masukkan Champion!");
        System.out.print("Name \t\t: ");
        String name2 = scn.next();
        
        double hp2;
        do {
            System.out.print("HP \t\t: ");
            hp2 = scn.nextDouble();
            if (hp2 < 0 || hp2 > 1000) {
                System.out.println("Invalid input! HP harus di antara 0 dan 1000.");
            }
        } while (hp2 < 0 || hp2 > 1000);

        double attack2;
        do {
            System.out.print("Attack \t\t: ");
            attack2 = scn.nextDouble();
            if (attack2 < 0 || attack2 > 1000) {
                System.out.println("Invalid input! Attack harus di antara 0 dan 1000.");
            }
        } while (attack2 < 0 || attack2 > 1000);

        double defense2;
        do {
            System.out.print("Defense \t: ");
            defense2 = scn.nextDouble();
            if (defense2 < 0 || defense2 > 1000) {
                System.out.println("Invalid input! Defense harus di antara 0 dan 1000.");
            }
        } while (defense2 < 0 || defense2 > 1000);

        Hero champion2 = new Hero(name2, hp2, attack2, defense2);
        System.out.print("===================================================================================\n");
        
        System.out.println("Bersiaplah!\n" 
                        + "Pertarungan antara " + champion1.getName() + " VS  " + champion2.getName() + " akan dimulai!\n"
                        + "1\n"
                        + "2\n" 
                        + "3\n");
        
        int round = 1;
        double damage = 0;
        while(champion1.getHp() > 0 && champion2.getHp() > 0){
            System.out.println("Round " + round + "\nFight!\n");
            System.out.println(champion1.getName() + " menyerang " + champion2.getName());
            System.out.println(champion1.getName() + " menyerang sebesar " + champion1.getAttack());
            System.out.println(champion2.getName() + " memiliki pertahanan sebesar " + champion2.getDefense());
            damage = champion1.getAttack() - champion2.getDefense();
            champion2.setHp(champion2.getHp() - damage);
            System.out.println("Health " + champion2.getName() + " saat ini " + champion2.getHp() + "\n");

            System.out.println(champion2.getName() + " menyerang " + champion1.getName());
            System.out.println(champion2.getName() + " menyerang sebesar " + champion2.getAttack());
            System.out.println(champion1.getName() + " memiliki pertahanan sebesar " + champion1.getDefense());
            damage = champion2.getAttack() - champion1.getDefense();
            champion1.setHp(champion1.getHp() - damage);
            System.out.println("Health " + champion1.getName() + " saat ini " + champion1.getHp());

            System.out.println("===================================================================================");
            round++;
        }

        if(champion1.getHp() <= 0){
            System.out.printf("Pertarungan telah usai!\n"
                            + "Champion %s telah kalah!\n"
                            + "Champion %s adalah pemenangnya!\n", champion1.getName(), champion2.getName());            
        }
        else if(champion2.getHp() <= 0){
            System.out.printf("Pertarungan telah usai!\n"
                            + "Champion %s telah kalah!\n"
                            + "Champion %s adalah pemenangnya!\n", champion2.getName(), champion1.getName());
        }
        
        scn.close();
    }
}
