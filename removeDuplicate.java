public class removeDuplicate {
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

    public static int[] dropDuplicate(int[] array){
        int size = array.length;
        if (size == 1 || array == null){
            return array;
        }
        int[] cleanedArray = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            boolean isUnique = true;
            for (int j = 0; j < i; j++){
                if (array[i]== array[j]){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                cleanedArray[index] = array[i];
                index++;
            }
        }
        int[] resultArray = new int[index];
        System.arraycopy(cleanedArray, 0, resultArray, 0, index);
        return resultArray;

    }
    public static void main(String[] args) {
        // int[] array = {1, 2, 3, 4, 5,6,7};
        // int[] array = {1, 2, 1, 2, 3, 4, 5};
        int[] array = {12, 31, 1, 3, 6, 12, 3, 1, 2};
        int[] arrayCleaned = dropDuplicate(array);
        arrayPrint(arrayCleaned);
    }
}
