public class StandonMeasure {
    public static int standonMeasure(int[] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        int countOne = 0;
        for (int arrayElem:array){
            if (arrayElem == 1){
                countOne++;
            }
        }
        int countOneNumber =0;
        for (int arrayElem:array){
            if (arrayElem == countOne){
                countOneNumber++;
            }
        }
        return countOneNumber;
    }

    public static void main(String[] args) {
        // int[] array = {1};
        // int[] array = {0};
        // int[] array = {9,-3,-3,-1,-1};
        // int[] array = {1,3,1,1,3,3,2,3,3,3,4};
        int[] array = {};
        System.out.println(standonMeasure(array));
    }
}
