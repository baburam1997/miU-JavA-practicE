// public class IsSym {
//     public static boolean isEven(int num) {
//         return num % 2 == 0;
//     }

//     public static int isSym(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {  // Change the loop condition to handle odd-sized arrays
//             if (isEven(arr[start]) != isEven(arr[end]))
//                 return 0;
//             start = start + 1;
//             end = end - 1;
//         }

//         return 1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 7, 9, 10, 11, 5, 8};
//         System.out.println(isSym(arr));
//     }
// }

public class IsSym {
    public static int isSym(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            boolean startIsEven = arr[start] % 2 == 0;
            boolean endIsEven = arr[end] % 2 == 0;

            if (startIsEven != endIsEven) {
                return 0;
            }

            start++;
            end--;
        }

        return 1;
    }

    public static void main(String[] args) {
        // int[] array = {2, 7, 9, 10, 11, 5, 8};
        // int[] array = {9, 8, 7, 13, 14, 17};
        int[] array = {2, 7, 8, 9, 11, 13, 10};
        System.out.println(isSym(array)); // Output: 0
    }
}
