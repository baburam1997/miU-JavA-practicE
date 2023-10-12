public class IsEvenSpaced {
public static int isEvenSpaced(int[] a) {
        if (a.length < 2) {
            return 0; 
        }
        int min = a[0];
        int max = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int diff = max - min;
        if (diff % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] evenSpacedArray = {4, 10, 2, 8, 6};
        // int[] evenSpacedArray = {3, 9, 11, 7};

        System.out.println(isEvenSpaced(evenSpacedArray));
    }
}
