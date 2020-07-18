package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Tagarela" , "julio" , "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName , String birthMonth , String birthYear) {
        System.out.println("Hola! Me llamo " + assistantName + ".");
        System.out.println("Me crearon en " + birthMonth + " de " + birthYear + ".");
        System.out.println("Vós, como te llamás?");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Me gusta tu nombre, " + name + "!");
    }

    static void guessAge() {
        System.out.println("A ver si puedo adivinar tu edad...");
        System.out.println("Decíme el resto de la división de tu edad por 3, 5 y 7. (Separá cada número con un espacio, porfa.)");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Ya tenés " + age + " años! Me parece un excelente momento para empezar a programar.");
    }

    static void count() {
        System.out.println("Sabías que ya sé contar hasta el número que me digas? Dale, decíme un número!");
        int num = scanner.nextInt();
        if(num >= 0) {
            for(int i = 0 ; i <= num ; i++) {
                System.out.printf("%d!\n" , i);
            }
        } else {
            for(int j = 0 ; j >= num ; j--) {
                System.out.printf("%d!\n" , j);
            }

        }
    }

    static void test() {
        System.out.println("Ahora a ver tus conocimientos de programación!");
        System.out.println("Cual de las opciones abajo es un output de tipo booleano? (Ingresá solamente el número referente a la opción correcta.)");
        System.out.println("1. falsie");
        System.out.println("2. maybe");
        System.out.println("3. yes");
        System.out.println("4. true\n");

        int answer = scanner.nextInt();

        if(answer != 1 && answer != 2 && answer != 3 && answer != 4) {
            System.out.println("Ingresá solamente el número referente a la opción correcta. (1, 2, 3 o 4)");
            test();
        }

        if(answer == 1 || answer == 2 || answer == 3) {
            System.out.println("Uhh... La erraste feo!! Pero te dejo intentar otra vez.");
            test();
        }

    }


    static void end() {
        System.out.println("Bien ahiiii! Que tengas un buen día! "); // Do not change this text
    }
}
