
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            n = scanner.nextInt();
            sum += n;
        }
        while(n != 0);

        System.out.println(sum);

    }
}