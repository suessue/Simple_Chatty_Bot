import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt() + 1;

        System.out.println(s.substring(start , end));

    }
}