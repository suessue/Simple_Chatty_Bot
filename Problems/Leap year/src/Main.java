import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n % 4 == 0 && n % 100 != 0 || n % 400 == 0 ? "Leap" : "Regular");
    }
}