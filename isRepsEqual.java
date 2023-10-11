public class isRepsEqual {
    public static int repsEqual(int[] array, int len, int number) { 
        if (len <= 0 || number == 0){
            return 0;
        }
        int arrayNumber = 0;
        for (int arrayElem : array) {
            arrayNumber = arrayNumber * 10 + arrayElem;
            }
        if (arrayNumber == number){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args){
        // int[] array = {3, 2, 0, 5, 3};
        // int number = 32053;
        // int[] array = {3, 2, 0, 5};
        // int number = 32053;
        // int[] array = {3, 2, 0, 5, 3, 4};
        // int number = 32053;
        // int[] array = {2, 3, 0, 5, 3, 4};
        // int number = 32053;
        int[] array = {9, 3, 1, 1, 2};
        int number = 32053;
        int len = array.length;
        System.out.println(repsEqual(array,len, number));
    }
}
