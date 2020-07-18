import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int counter = 0;
        double sum = 0;

        for(int i = a ; i <= b ; i++) {
            if(i % 3 == 0) {
                sum += i;
                counter++;
            }
        }
        double average = sum / counter;

        System.out.println(average);

    }
}