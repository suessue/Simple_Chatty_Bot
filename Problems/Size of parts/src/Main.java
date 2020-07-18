import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.nextInt();
        int perfect = 0;
        int larger = 0;
        int smaller = 0;

        while(scan.hasNextInt()) {
            int code = scan.nextInt();
            if(code == 0) {
                perfect++;
            } else if(code == 1) {
                larger++;
            } else {
                smaller++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller + " ");
    }
}