import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        if(n.length() < 2) {
            System.out.println("0");

        } else {
            System.out.println(n.charAt(n.length() - 2));
        }

    }

}