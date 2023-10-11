public class nUpCount {
    public static int  nUpCounter(int[] array, int n){
        int upCount = 0;
        int partialSum = 0;
        for (int arrayElem : array){
            partialSum += arrayElem;
            if(partialSum > n){
                upCount++;
            }
            System.out.println(partialSum);
            
        }
        return upCount;
    }
    public static void main(String[] e){
        int[] array = {2, 3, 1, -6, 8, -3, -1, 2};
        int n = 5;
        System.out.println(nUpCounter(array, n));
    }
}
