import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        System.out.println(s.toUpperCase().charAt(0) == 'J');

    }
}