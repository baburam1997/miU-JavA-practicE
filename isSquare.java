public class isSquare {
    public static int isSquareNumber(int n){
        if (n < 0){
            return 0;
        }
        int sqrt = (int) Math.sqrt(n);
        if(sqrt * sqrt == n){
            return 1;
        }
        return 0;

        // int sqrt = 0;
        // while (sqrt * sqrt <= n) {
        //     if (sqrt * sqrt == n) {
        //         return 1;
        //     }
        //     sqrt++;
        // }
        // return 0;
    }
    public static void main(String[] e){
        // int number = 4;
        // int number = 25;
        // int number = -4;
        // int number = 8;
        int number = 0;
        System.out.println(isSquareNumber(number));
    }
    
}
