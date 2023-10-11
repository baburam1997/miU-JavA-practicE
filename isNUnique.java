public class isNUnique {
    public static int isNUniqueNumber(int[] array, int uniqueNumber) { 
        int n = array.length;
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] + array[j] == uniqueNumber) {
                    uniqueCount++;
                }
            }
        }
        if (uniqueCount == 1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // int[] array = {7,3,3,2,4};
        // int uniqueNumber = 6;
        // int[] array = {7,3,3,2,4};
        // int uniqueNumber = 10;
        // int[] array = {7,3,3,2,4};
        // int uniqueNumber = 11;
        int[] array = {7,3,3,2,4};
        int uniqueNumber = 8;
        System.out.println(isNUniqueNumber(array,uniqueNumber));
    }
}
