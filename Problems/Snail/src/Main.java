import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = 0;
        int totalDistance = 0;


        while(totalDistance < h) {
            days++;
            totalDistance += a;
            if(totalDistance >= h) {
                break;
            }
            totalDistance += - b;

        }

        System.out.println(days);

    }
}
