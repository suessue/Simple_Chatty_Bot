import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String reverse = "";

        for(int i = num.length() - 1 ; i >= 0 ; i--) {

            reverse += num.charAt(i);
        }

        System.out.println(Integer.parseInt(reverse));
    }
}
