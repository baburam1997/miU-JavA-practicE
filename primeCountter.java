public class primeCountter {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
            i += 6;
        }

        return true;
    }

    public static int primeCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int start = 10;
        // int end = 30;
        // int start = 11;
        // int end = 29;
        // int start = 20;
        // int end = 22;
        // int start = 1;
        // int end = 1;
        // int start = 5;
        // int end = 5;
        // int start = 6;
        // int end = 2;
        int start = -10;
        int end = 6;
        System.out.println(primeCount(start, end));
    }
}

