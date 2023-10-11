public class IsFancy {
    public static int isFancy(int number) {
        if (number == 1) {
            return 1;
        }

        int firstFancy = 1;
        int secondFancy = 1;
        int currentFancy = 0;

        while (currentFancy < number) {
            currentFancy = 3 * secondFancy + 2 * firstFancy;

            if (currentFancy == number) {
                return 1;
            }

            firstFancy = secondFancy;
            secondFancy = currentFancy;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
    }
}
