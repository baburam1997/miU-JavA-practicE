public class IsGuthrieSequence {
    public static int isGuthrieSequence(int[] array){
        int len = array.length;
        if (array[len-1] != 1){
            return 0;
        }
        int isGutherie = 1 ;
        for (int i = 0; i<len-1;i++){
            if(array[i]%2 == 0){
                if(array[i]/2 != array[i+1]){
                    isGutherie = 0;
                }
            }else{
                if(array[i+1] != array[i]*3 + 1){
                    isGutherie = 0;
                }
            }
        }
        return isGutherie;
    }
    public static void main(String args[]) {
        // int[] array = {8,4,1};
        // int[] array = {8,17,4,1};
        int[] array = {8,4,2,1};
        // int[] array = {8,4,2};
        System.out.println(isGuthrieSequence(array));
    } 
}
