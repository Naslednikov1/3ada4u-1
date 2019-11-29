import java.util.Scanner;

public class Z_1_5 {
    public static void Z_1_5(String[] args) {
        Scanner var = new Scanner(System.in);
        int count = 0;
        int chislo1 = var.nextInt();
        int chislo2 = var.nextInt();
        int chislo3 = var.nextInt();
        if (chislo1 >= chislo2 && chislo1 >= chislo3) {
            count++;
        }
        if (chislo2 >= chislo1 && chislo2 >= chislo3) {
            count++;
        }
        if (chislo3 >= chislo1 && chislo3 >= chislo2) {
            count++;
        }
        System.out.print(count);
    }
}
