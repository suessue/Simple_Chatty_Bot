import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int busHeight = sc.nextInt();
        int numOfBridges = sc.nextInt();
        int counter = 0;

        while(counter < numOfBridges) {
            counter++;
            int bridgeHeight = sc.nextInt();
            if(bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + counter);
                break;
            }
            if(counter == numOfBridges) {
                System.out.println("Will not crash");
            }
        }

    }

}
