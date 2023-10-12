public class SumFactor {
    public static int sumFactor(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int sum = 0;
        int sumFactor = 0;
        for (int num : a) {
            sum += num;
        }
        for (int num : a) {
            if (num == sum) {
                sumFactor++;
            }
        }
        return sumFactor;
    }

    public static void main(String[] args) {
        // int[] array = {1, -1, 1, -1, 1, -1, 1};
        // int[] array = {3,0,2,-5,0};
        // int[] array = {9,-3,-3,-1,-1};
        int[] array = {1};
        // int[] array = {0,0,0};
        System.out.println(sumFactor(array));
    }
}
