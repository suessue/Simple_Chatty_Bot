import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if(isWeekend) {
            System.out.println(numberOfCups >= 15 && numberOfCups <= 25);
        } else {
            System.out.println(numberOfCups >= 10 && numberOfCups <= 20);
        }
    }
}