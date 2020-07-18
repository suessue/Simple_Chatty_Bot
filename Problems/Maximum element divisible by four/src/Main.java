import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            max = n % 4 == 0 && n > max ? n : max;
        }

        System.out.println(max);
    }
}