public class Main {

    public static void main(String[] args) {

        

    }

    private static long[] findEmirp(long n) {
        long below = 0;
        long largest = 0;
        long sum = 0;

        for (long i = 1; i < n; i += 2) {
            if (isPrime(i) && isPrime(revNum(i)) && i != revNum(i)) {
                below++;
                largest = i;
                sum = sum + i;
            }
        }
        long[] result = {below, largest, sum};
        return result;
    }

    private static long revNum(long number) {
        long normal = number;
        long reverse = 0;

        while (normal != 0) {
            long reminder = normal % 10;
            reverse = reverse * 10 + reminder;
            normal = normal / 10;
        }
        return reverse;
    }

    private static boolean isPrime(long number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}
