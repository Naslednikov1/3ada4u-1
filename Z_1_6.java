import java.util.Scanner;

public class Z_1_6 {
    public static void Z_1_6(String[] args) {
        Scanner var = new Scanner(System.in);
        double dist, coord = var.nextDouble();
        if (coord < 0) {
            dist = 0 - coord;
        } else if (coord > 1) {
            dist = coord - 1;
        } else {
            dist = 0;
        }
        System.out.print(dist);
    }
}