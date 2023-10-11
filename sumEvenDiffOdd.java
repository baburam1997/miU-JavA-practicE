public class sumEvenDiffOdd {
    public static int sumEvenDiffOddNumber(int[] array){
        int sumEven = 0;
        int sumOdd = 0;
        for (int arrayElem:array){
            if (arrayElem % 2 == 0){
                sumEven += arrayElem;
            }else{
                sumOdd += arrayElem;
            }
        }
        return sumEven - sumOdd;
    }

    public static void main(String[] args) {
        // int[] array = {1};
        // int[] array = {1, 2, 3};
        // int[] array = {1, 2};
        // int[] array = {1, 2, 3, 4};
        // int[] array = {3, 3, 4, 4};
        // int[] array = {3, 2, 3, 4};
        // int[] array = {4, 1, 2, 3};
        // int[] array = {1, 1};
        int[] array = {};
        int sumEvenDiffOdd = sumEvenDiffOddNumber(array);
        System.out.println(sumEvenDiffOdd);
    }
}
