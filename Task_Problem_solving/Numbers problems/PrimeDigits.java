import java.util.Scanner;

class PrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBERS :");
        int n = sc.nextInt();
        boolean found = false;

        while (n > 0) {
            int d = n % 10;
            if (d == 2 || d == 3 || d == 5 || d == 7) {
                System.out.print(d + " ");
                found = true;
            }
            n /= 10;
        }
        if (!found)
            System.out.println("None");
    }
}
