import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String n = scanner.next();
//        if(n.length() == 4) {
//            System.out.println(n.charAt(0) == n.charAt(3) && n.charAt(1) == n.charAt(2) ? "1" : "25");
//        } else {
//            if(n.length() == 3) {
//                System.out.println(n.charAt(3) == n.charAt(1)
//                        || n.charAt(3) == 0 && n.charAt(1) == n.charAt(0) ? "1" : "25");
//            } else {
//                if(n.length() == 2) {
//                    System.out.println(n.charAt(0) == n.charAt(1) ? "1" : "25");
//
//                } else {
//                    System.out.println("25");
//                }
//            }
//
//        }


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int d1 = n / 1000;
        int d2 = n % 1000 / 100;
        int d3 = n % 100 / 10;
        int d4 = n % 10;

        System.out.println(d1 == d4 && d2 == d3 ? "1" : "0");

    }
}