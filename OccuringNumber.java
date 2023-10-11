public class OccuringNumber {
    static int occuranceNumber(int[] arr) {
        int maxNum = 0, maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
        }

        return maxNum;
    }

    public static void main(String args[]) {
        int[] arr = { 6, 8, 1, 8,9,8,6 };
        System.out.println(occuranceNumber(arr));
    }
}
