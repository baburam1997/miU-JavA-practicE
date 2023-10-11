public class pointOfEquilibrium {

    public static int pointOfEqui(int[] array) {
        int len = array.length;
        if ( len < 3){
            return -1;
        }
        int totalSum = 0;
        for (int arrayElem:array){
            totalSum += arrayElem;
        }
        int leftSum = 0;
        for (int idx = 0; idx < len; idx++){
            int rightSum = totalSum -leftSum -array[idx];

            if(leftSum == rightSum){
                return idx;
            }
            leftSum += array[idx];
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] array = {1, 8, 3, 7, 10, 2};
        // int[] array = {1, 5, 3, 1, 1, 1, 1, 1, 1};
        // int[] array = {2, 1, 1, 1, 2, 1, 7};
        // int[] array = {1, 2, 3};
        // int[] array = {3, 4, 5, 10};
        int[] array = {1, 2, 10, 3, 4};
        int idx = pointOfEqui(array);
        System.out.println(idx);
    }
}
