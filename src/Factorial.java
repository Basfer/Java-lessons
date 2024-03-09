public class Factorial {
    public static void main(String[] args) {
        int f = factorial(10);
        System.out.println(f);
        System.out.println(sumDigits(f));
    }

    public static int factorial(int i) {
        if(i == 0) return 1;
        return i*factorial(i-1);
    }

    public static int sumDigits(int num) {
        if(num == 0) return 0;
        return num%10 + sumDigits(num/10);
    }
}
