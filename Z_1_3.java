import java.util.Scanner;

public class Z_1_3 {
    public static void Z_1_3(String[] args) {
        Scanner var = new Scanner(System.in);
        int chislo1 = var.nextInt();
        int chislo2 = var.nextInt();
        int chislo3 = var.nextInt();
        if (chislo1 == chislo2 || chislo1 == chislo3 || chislo2 == chislo3 ) {
            System.out.print("Есть");
        } else {
            System.out.print("Нет");
        }
    }
}