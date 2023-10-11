public class baseConversion {
    public static int baseToDecimal(String baseNumber,int base) {
        int decimal = 0;

        // Reverse the binary string for easier processing
        String reversedBaseNumber = new StringBuilder(baseNumber).reverse().toString();

        // Iterate through each digit of the reversed binary string
        for (int i = 0; i < reversedBaseNumber.length(); i++) {
            int digit = Character.getNumericValue(reversedBaseNumber.charAt(i));
            decimal += digit * Math.pow(base, i);
        }

        return decimal;
    }

    public static String decimalToBase(int decimal, int base) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % base;
            result.append(Integer.toString(remainder, base));
            decimal /= base;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        // String baseNumber = "11111"; // Binary number
        // int base = 2;
        // String baseNumber = "4444"; // Quinery number
        // int base = 5;
        // String baseNumber = "7777"; // Octal number
        // int base = 8;
        // String baseNumber = "FFFF"; // Hexadecimal number
        // int base = 16;
        // int decimalResult = baseToDecimal(baseNumber,base);
        // System.out.println(decimalResult);

        // int decimalNumber = 10;
        // int base = 16; // Hexadecimal number
        // int decimalNumber = 10;
        // int base = 8; // Octal number
        // int decimalNumber = 10;
        // int base = 5; // Hexadecimal number
        int decimalNumber = 10;
        int base = 2; // Binary number
        String baseResult = decimalToBase(decimalNumber, base);
        System.out.println(baseResult.toUpperCase());
        
    }
}
