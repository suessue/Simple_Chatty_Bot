import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        while(scan.hasNextInt()) {
            int grade = scan.nextInt();
            if(grade == 5) {
                a++;
            } else if(grade == 4) {
                b++;
            } else if(grade == 3) {
                c++;
            } else {
                d++;
            }

        }

        System.out.println(d + " " + c + " " + b + " " + a);

    }
}