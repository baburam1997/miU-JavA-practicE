public class evenOddInArray {
    public static void arrayPrint(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("}");
    }

    public static int[] evenOddSum(int[] array){
        int evenSum = 0;
        int oddSum = 0;
        int[] evenOddSumArray = {0, 0};
        for (int arrayElem : array) {
            if (arrayElem % 2 == 0) {
                evenSum += arrayElem;
            } else {
                oddSum += arrayElem;
            }
        }
        evenOddSumArray[0] = evenSum;
        evenOddSumArray[1] = oddSum;
        return evenOddSumArray;
    }

    public static int[] evenOddCount(int[] array){
        int evenCount = 0;
        int oddCount = 0;
        int[] evenOddCountArray = {0, 0};
        for (int arrayElem : array) {
            if (arrayElem % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        evenOddCountArray[0] = evenCount;
        evenOddCountArray[1] = oddCount;
        return evenOddCountArray;
    }

    public static int[][] evenOdd(int[] array) {
        // Count the number of even and odd elements
        int evenCounts = 0;
        int oddCounts = 0;
    
        for (int arrayElem : array) {
            if (arrayElem % 2 == 0) {
                evenCounts++;
            } else {
                oddCounts++;
            }
        }
        // 2 rows for even and odd array
        int[][] evenOddArray = new int[2][];
        
        evenOddArray[0] = new int[evenCounts];
        evenOddArray[1] = new int[oddCounts];

        int evenIndex = 0;
        int oddIndex = 0;

        // Populate even and odd arrays
        for (int arrayElem:array) {
            if (arrayElem % 2 == 0) {
                evenOddArray[0][evenIndex] = arrayElem;
                evenIndex++;
            } else {
                evenOddArray[1][oddIndex] = arrayElem;
                oddIndex++;
            }
        }
        return evenOddArray;
    }
    public static int evenDiffOdd(int[] array){
        int evenSum = 0;
        int oddSum = 0;
        for(int arrayElem:array){
            if (arrayElem % 2 == 0){
                evenSum += arrayElem;
            } else {
                oddSum += arrayElem;
            }
        }
        return (evenSum - oddSum);
    }

    public static int[][] posNeg(int[] array) {
        // Count the number of even and odd elements
        int posCounts = 0;
        int negCounts = 0;
    
        for (int arrayElem : array) {
            if (arrayElem > 0) {
                posCounts++;
            } else {
                negCounts++;
            }
        }
        // 2 rows for even and odd array
        int[][] posNegArray = new int[2][];
        
        posNegArray[0] = new int[posCounts];
        posNegArray[1] = new int[negCounts];

        int posIndex = 0;
        int negIndex = 0;

        // Populate even and odd arrays
        for (int arrayElem:array) {
            if (arrayElem > 0) {
                posNegArray[0][posIndex] = arrayElem;
                posIndex++;
            } else {
                posNegArray[1][negIndex] = arrayElem;
                negIndex++;
            }
        }
        return posNegArray;
    }


    public static int posDiffNeg(int[] array){
        int posSum = 0;
        int negSum = 0;
        for(int arrayElem:array){
            if (arrayElem > 0){
                posSum += arrayElem;
            } else {
                negSum += arrayElem;
            }
        }
        return (posSum - negSum);
    }
    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 5, 6, 8, 7, -3, 9, -5 };
        
        int[] evenOddSumArray = evenOddSum(array);
        System.out.println("Sum of Even Number: " + evenOddSumArray[0]);
        System.out.println("Sum of Odd Number: " + evenOddSumArray[1]);

        int[] evenOddCountArray = evenOddCount(array);
        System.out.println("Number  of Even Number: " + evenOddCountArray[0]);
        System.out.println("Number of Odd Number: " + evenOddCountArray[1]);
        
        int[][] evenOddArray = evenOdd(array);

        int[] evenArray = evenOddArray[0];
        System.out.print("Even Array: ");
        arrayPrint(evenArray);
    
        int[] oddArray = evenOddArray[1];
        System.out.print("Odd Array: ");
        arrayPrint(oddArray);

        int diff = evenDiffOdd(array);
		System.out.println("Sum(even numbers) - Sum(odd numbers): " + diff);

        int[][] posNegArray = posNeg(array);

        int[] posArray = posNegArray[0];
        System.out.print("Positive Array: ");
        arrayPrint(posArray);
    
        int[] negArray = posNegArray[1];
        System.out.print("Negative Array: ");
        arrayPrint(negArray);

        int diff1 = posDiffNeg(array);
		System.out.println("Sum(positive numbers) - Sum(negatve numbers): " + diff1);
    }
}
