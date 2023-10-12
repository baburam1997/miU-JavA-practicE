public class IsMadhavArray{
    public static int isMadhavArray(int[] arr) {
        int n = 1;  // Initialize n to 1
        int index = 0;
        
        while (index < arr.length) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (index >= arr.length) {
                    return 0;
                }
                sum += arr[index];
                index++;
            }
            
            if (sum != arr[0]) {
                return 0;
            }
            
            n++;
        }
        
        return 1;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 1, 1};
        int[] array2 = {2, 1, 1, 4, -1, -1};
        int[] array3 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int[] array4 = {18, 9, 10, 6, 6, 6};
        int[] array5 = {-6, -3, -3, 8, -5, -4};
        int[] array6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        int[] array7 = {3, 1, 2, 3, 0};
        
        System.out.println(isMadhavArray(array1)); // Should return 1
        System.out.println(isMadhavArray(array2)); // Should return 1
        System.out.println(isMadhavArray(array3)); // Should return 1
        System.out.println(isMadhavArray(array4)); // Should return 0
        System.out.println(isMadhavArray(array5)); // Should return 0
        System.out.println(isMadhavArray(array6)); // Should return 1
        System.out.println(isMadhavArray(array7)); // Should return 0
    }
}
