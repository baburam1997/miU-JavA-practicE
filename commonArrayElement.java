public class commonArrayElement {
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

    public static int[] commonElement(int[] first, int[] second) {
        if ( first == null || second == null){
            return null;
        }else{

            int[] commonElem = new int[Math.min(first.length, second.length)];
            int resultIndex = 0;

            for (int i = 0; i < first.length; i++) {
                for (int j = 0; j < second.length; j++) {
                    if (first[i] == second[j]) {
                        commonElem[resultIndex] = first[i];
                        resultIndex++;
                        break;
                    }
                }
            }
            int[] commonElemArray = new int[resultIndex];
            System.arraycopy(commonElem, 0, commonElemArray, 0, resultIndex);
            return commonElemArray;
        }
    }

    public static void main(String[] args) {
        // int[] first = {1, 8, 3, 2};
        // int[] second = {4, 2, 6, 1};
        // int[] first = {1, 8, 3, 2, 6};
        // int[] second = {2, 6, 1};
        // int[] first = {1, 3, 7, 9};
        // int[] second = {7, 1, 9, 3};
        // int[] first = {1, 2};
        // int[] second = {3, 4};
        // int[] first = {};
        // int[] second = {1, 2, 3};
        // int[] first = {1, 2};
        // int[] second = {};
        // int[] first = {1, 2};
        // int[] second = null;
        // int[] first = null;
        // int[] second = {};
        int[] first = null;
        int[] second = null;

        int[] commonElem = commonElement(first, second);
        if (commonElem == null){
            System.out.println("null");
        }else{
            arrayPrint(commonElem);
        }
    }
}
