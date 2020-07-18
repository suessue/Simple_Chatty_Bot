import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            System.out.println(n % 2 == 0 ? "even" : "odd");
        }
    }
}