public class IsBean {
    static int isBean(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int num = array[i];
                int temp = array[j];
                if (num == 2 * temp || num == 2 * temp + 1 || num == temp / 2) {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int[] array =  {4,9,8};
        System.out.println(isBean(array));
    }
}