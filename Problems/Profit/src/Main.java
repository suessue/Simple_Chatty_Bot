import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = sc.nextInt();
        double p = sc.nextInt();
        double k = sc.nextInt();
        int years = 0;

        while(m < k) {
            m += m * p / 100;
            years++;

        }
        System.out.println(years);

    }
}