import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean output = n > - 15 && n <= 12 || n > 14 && n < 17 || n >= 19;

        System.out.println(output ? "True" : "False");
    }
}