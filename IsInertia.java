import java.util.ArrayList;
import java.util.Collections;

public class IsInertia {
    static int isInertial(int[] arr) {
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> evenArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // add to odd array and even array
            if (arr[i] % 2 == 0) {
                evenArray.add(arr[i]);
            } else {
                oddArray.add(arr[i]);
            }
        }

        // check the length of odd array
        // sort the arrays
        // save the max and second max value of the even array
        // compare the min value of odd array with all items in even array
        // so that it proves each odd value is greater than even value other than max even value
        // check if the max value in the whole array is even

        if (oddArray.size() == 0) {
            return 0;
        }

        // sorting odd and even array
        Collections.sort(evenArray);
        Collections.sort(oddArray);

        // finding max and second max value in the even array
        int maxEvenValue = evenArray.get(evenArray.size() - 1); // max even value in the array

        // finding min and max odd value in the odd array
        int minOddValue = oddArray.get(0); // min odd value
        int maxOddValue = oddArray.get(oddArray.size() - 1); //max odd value

        // compare each item in even array except max value with the least odd item
        for( int i = 0; i < evenArray.size()-2; i++) {
            if (evenArray.get(i) > minOddValue) {
                return 0;
            }
        }

        // check if the even max value is the greater than max odd value
        if (maxOddValue > maxEvenValue){
            return 0;
        }

        return 1;
    }

    public static void main(String args[]) {
        int[] arr = {2,12,12,4,6,8,11}  ;
        System.out.println(isInertial(arr));
    }

}
