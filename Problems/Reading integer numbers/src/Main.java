import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // put your code here
        while(input.hasNextInt()) {
            System.out.println(input.nextInt());
        }
    }
}
