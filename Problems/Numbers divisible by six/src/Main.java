import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        //ignores first input, which won't be used.
        scan.nextInt();

        while(scan.hasNextInt()) {
            int n = scan.nextInt();
            sum += (n % 6 == 0) ? n : 0;
        }

        System.out.println(sum);
    }
}