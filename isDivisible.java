public class isDivisible {
    public static int isDivisibleByNumber(int[] array, int number) { 
        int len = array.length;
        if (len == 0){
            return 1;
        }
        for (int i= 0; i < len; i++) {
            if (array[i] % number == 0){
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        // int[] array = {3, 3, 6, 36};
        // int number = 3;
        // int[] array = {4};
        // int number = 2;
        // int[] array = {3, 4, 3, 6, 36};
        // int number = 3;
        // int[] array = {3, 4, 3, 6, 36};
        // int number = 12;
        int[] array = {};
        int number = 3;
        System.out.println(isDivisibleByNumber(array, number));
    }
}