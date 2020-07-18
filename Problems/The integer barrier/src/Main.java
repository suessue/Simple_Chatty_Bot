import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;

        while((n = sc.nextInt()) != 0) {
            sum += n;
            if(sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);
    }
}
