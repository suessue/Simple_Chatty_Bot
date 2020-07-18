class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();

        int n = 45;
        int steps = 0;

        System.out.print(n + " ");

        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            steps++;
            System.out.print(n + " ");

        }

        System.out.println("\nNumber of steps = " + steps);
    }
}