public class ArraySortAscending {
    public static void main(String[] args) {
        int n = 6; // Specify the size of the array
        int[] array = {2, 3, 5, 5, 7, 3};
    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    // Swap elements if they are out of order
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
