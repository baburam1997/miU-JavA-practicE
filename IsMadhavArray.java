public class IsMadhavArray{
    public static int isMadhavArray(int[] arr) {
        int n = 1;  // Initialize n to 1
        int index = 0;
        
        while (index < arr.length) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (index >= arr.length) {
                    return 0;  // Array length is not valid for Madhav array
                }
                sum += arr[index];
                index++;
            }
            
            if (sum != arr[0]) {
                return 0;  // The sums are not equal
            }
            
            n++;
        }
        
        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 1};
        int[] arr2 = {2, 1, 1, 4, -1, -1};
        int[] arr3 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int[] arr4 = {18, 9, 10, 6, 6, 6};
        
        System.out.println(isMadhavArray(arr1)); // Output: 1
        System.out.println(isMadhavArray(arr2)); // Output: 1
        System.out.println(isMadhavArray(arr3)); // Output: 1
        System.out.println(isMadhavArray(arr4)); // Output: 0
    }
}
