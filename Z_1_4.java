import java.util.Scanner;

public class Z_1_4 {
    public static void Z_1_4(String[] args) {
        Scanner var = new Scanner(System.in);
        int chislo1 = var.nextInt();
        int chislo2 = var.nextInt();
        int chislo3 = var.nextInt();
        if (chislo2 > chislo1 && chislo1 > chislo3 || chislo1 < chislo3 && chislo1 > chislo2) {
            System.out.print(chislo1);
        } else if (chislo2 > chislo1 && chislo2 < chislo3 || chislo2 < chislo1 && chislo2 > chislo3 ) {
            System.out.print(chislo2);
        } else if (chislo3 > chislo1 && chislo3 < chislo2 || chislo3 < chislo1 && chislo3 > chislo2) {
            System.out.print(chislo3);
        } else {
            System.out.print("Не существует такого числа");
        }
    }
}
