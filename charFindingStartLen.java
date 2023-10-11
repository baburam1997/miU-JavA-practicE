public class charFindingStartLen {
    public static char[] stringHandling(char[] charArray,int start, int len){
        if ( start <0 || start >= charArray.length){
            return null;
        }
        if (len < 0 || start + len > charArray.length){
            return null;
        }
        char[] result = new char[len];
        for (int i = 0; i < len; i++){
            result[i] = charArray[start+i];
        }
        return result;
    }
    public static void arrayPrint(char[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print("'" + array[i] + "'");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        // char[] charArray ={'a', 'b', 'c'};
        // int start = 0; 
        // int len = 4;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 0;
        // int len = 3;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 0;
        // int len = 2;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 0;
        // int len = 1;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 1;
        // int len = 3;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 1;
        // int len = 2;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 1;
        // int len = 1;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 2;
        // int len = 2;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 2;
        // int len = 1;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 3;
        // int len = 1;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= 1;
        // int len = 0;
        // char[] charArray= {'a', 'b', 'c'};
        // int start= -1;
        // int len = 2
        // char[] charArray= {'a', 'b', 'c'};
        // int start= -1;
        // int len = -2
        char[] charArray= {};
        int start = 0;
        int len = 1;

        char[] array = stringHandling(charArray,start,len);
        if ( array != null){
            arrayPrint(array);

        }else{
            System.out.println("null");
        }
    }
}
