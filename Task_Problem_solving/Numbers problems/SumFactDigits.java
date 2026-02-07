import java.util.Scanner;

class SumFactDigits {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER A NUMBERS :");
        int n = sc.nextInt(), sum = 0, temp = n;

        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        System.out.println(sum);
    }
}
