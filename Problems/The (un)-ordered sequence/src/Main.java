import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascending = 0;
        int descending = 0;
        int counter = 0;
        int n = sc.nextInt();

        while(sc.hasNextInt()) {

            int nextN = sc.nextInt();

            if(nextN == 0 || counter != ascending && counter != descending) {
                break;
            }

            counter++;

            if(n >= nextN) {
                ascending++;
            }

            if(n <= nextN) {
                descending++;
            }

            n = nextN;

        }

        System.out.println(counter == ascending || counter == descending);
    }
}