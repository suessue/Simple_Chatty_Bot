import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        long product = 1;

        for(int i = a ; i < b ; i++) {
            product *= i;

        }

        System.out.println(product);
    }
}
