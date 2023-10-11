public class reverseNumber {
    public static int reverseNum(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        // int number = 12324;
        // int number = 12005;
        // int number = 1;
        // int number = 1000;
        // int number = 0;
        int number = -12345;
        int reversed = reverseNum(number);
        System.out.println(reversed);
    }
}
