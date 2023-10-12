public class SubArray {
public static int isSub(int[] a) {
        int sum = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int afterSum = 0;
            for (int j = i + 1; j < n; j++) {
                afterSum += a[j];
            }
            if (a[i] <= afterSum) {
                return 0;
            }

            sum += a[i];
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] subArray = {13, 6, 3, 2};
        int[] notSubArray = {11, 5, 3, 2};

        System.out.println(isSub(subArray)); 
        System.out.println(isSub(notSubArray));
    }
}
