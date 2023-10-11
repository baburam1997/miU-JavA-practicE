public class AnserTwo {
    static int answerTwo(int[] array) {
        if (array == null || array.length == 0){
            return 0; 
        }
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int[] array = {6,8,1,8,2};
        // int[] array = {6, 8, 1, 8, 6};
        System.out.println(answerTwo(array));
    }
}