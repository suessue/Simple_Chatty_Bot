
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalChairs = 0;

        while(scanner.hasNextInt()) {
            List <Integer> groups = new ArrayList <>();
            groups.add(scanner.nextInt());

            for(int group : groups) {
                totalChairs += group / 2 + group % 2;
            }

        }

        System.out.println(totalChairs);

    }
}
