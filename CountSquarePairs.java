import java.lang.Math;

public class CountSquarePairs {

    public static boolean isPerfectSquare(int sum){
        double sqrtValue = Math.sqrt(sum);

        if(sqrtValue - Math.floor(sqrtValue) == 0) return true;

        return false;
    }
    public static int countSquarePairs(int [] arr){
        int count = 0;

        for(int i=0; i<arr.length ; i++){
            int x = arr[i];
            for(int j=0; j<arr.length; j++){
                if(i!=j) {
                    int y = arr[j];
                    // check the conditions
                    if (x > 0 && y > 0 && x < y) {

                        if (isPerfectSquare(x + y)) {
                            count = count + 1;
                        }
                    }
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        // -- Return how many pairs in an array satisfies the condition:
                    // x and y are both non-zero and positive integers
                    // x<y
                    // x+y is a perfect square
        int[] arr = {9,0,2,-5,7};
        System.out.println(countSquarePairs(arr));
    }
}
