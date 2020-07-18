import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        for(int i = 0 ; i <= n ; i++) {
            if(i * m == k) {
                System.out.println("YES");
                return;
            } else {
                for(int j = 0 ; j <= m ; j++) {
                    if(j * n == k) {
                        System.out.println("YES");
                        return;
                    }
                }

            }
        }

        System.out.println("NO");
    }
}