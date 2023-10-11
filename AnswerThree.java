public class AnswerThree {
    static int answerThree(int[] arr) {
        if (arr.length % 2 != 0)
            return 0;

        int midInd = arr.length / 2;
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < midInd) {
                leftSum = leftSum + arr[i];
            } else {
                rightSum = rightSum + arr[i];
            }

        }
        if (leftSum == rightSum)
            return 1;
        return 0;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 4, 3, 2, 3, 4, 6, 1 };
        System.out.println(answerThree(arr));
    }
}
