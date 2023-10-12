public class IsMeera {
    static int isMeera(int[] array) {
        boolean bool_1 = false;
        boolean bool_9 = false;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] == 1)
                bool_1 = true;
            if (array[i] == 9)
                bool_9 = true;
        }
        if (bool_1 == bool_9)
            return 1;

        return 0;
    }

    public static void main(String args[]) {
        // int[] array = { 7, 0, 1, 8, 9, 10 };
        // int[] array = {6,10,8};
        // int[] array = {7,6,1};
        int[] array = {9,10,0};
        // int[] array = {1,1,0,8,0,9,9,1};
        System.out.println(isMeera(array));
    }
}
