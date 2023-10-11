public class isCentered {
    public static int isCenteredArray(int[] array){
        int size = array.length;
        if (size == 0 || size % 2 == 0){
            return 0;

        }
        int mid = size / 2;
        for (int i = 0; i < size; i++){
            if (i != mid && array[i] <= array[mid]){
                return 0;
            }
        }
        return 1;

    }
    public static void main(String[] args) {
        // int[] array = {1, 2, 3, 4, 5};
        // int[] array = {3, 2, 1, 4, 5};
        // int[] array = {3, 2, 1, 4, 1};
        // int[] array = {1, 2, 3, 4};
        // int[] array = {};
        int[] array = {10};
        // Call the methods with arguments 
        int isCentered = isCenteredArray(array);
        System.out.println(isCentered);
    }
}
