import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(scan.nextLine().trim().replace(" " , "")
                .equals(scan.nextLine().trim().replace(" " , "")));

    }
}