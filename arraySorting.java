public class arraySorting {
    public static int[] arraySortAscending(int[] array) { // For Ascending Order
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) { // For Ascending Order
                    // Swap elements if they are out of order
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    public static int[] arraySortDescending(int[] array) { // for Descending Order
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array[j - 1]) { // For Descending Order
                    // Swap elements if they are out of order
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    public static void arrayPrint(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 5, 6, 8, 3, -3, 9 };

        // Call the methods with arguments for ascending order
        System.out.println("Array in Ascending Order :");
        int[] sortedArrayAsc = arraySortAscending(array);
        arrayPrint(sortedArrayAsc);
        // smallest Element in Array
        System.out.println(sortedArrayAsc[0]);
        // Second smallest Element in Array
        System.out.println(sortedArrayAsc[2]);

        // Call the methods with arguments for descending order
        System.out.println("Array in Descending Order :");
        int[] sortedArrayDes = arraySortDescending(array);
        arrayPrint(sortedArrayDes);
        // Largest Element in Array
        System.out.println(sortedArrayDes[0]);
        // Second Largest Element in Array
        System.out.println(sortedArrayDes[2]);
    }
}