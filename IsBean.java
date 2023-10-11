public class IsBean {
    static int isBean(int[] array) {
        int len = array.length;
        int beanFlag = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int num = array[i];
                int temp = array[j];
                if (num == 2 * temp || num == 2 * temp + 1 || num == temp / 2) {
                    beanFlag = 1;
                    break;
                } else {
                    beanFlag = 0;
                }
            }
            if (beanFlag == 0)
                return beanFlag;

        }
        return beanFlag;
    }

    public static void main(String args[]) {
        int[] array = { 2, 2, 5, 11, 2 };
        System.out.println(isBean(array));
    }
}
