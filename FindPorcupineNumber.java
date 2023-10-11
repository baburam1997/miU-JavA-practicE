public class FindPorcupineNumber {
    static boolean isPrime(int n){
        for(int i = 2; i<n/2; i++){
            if(n%i == 0){
                return false; // return zero if it is divisible other than 1 and itself
            }
        }
        return true;
    }

    static int findPorcupineNumber(int n){

        int firstNum;
        boolean flag = true;

        while(flag){
            n = n+1;
            if(isPrime(n)){
                if(n%10 == 9){
                    firstNum = n;
                    n=n+1;
                    while(!isPrime(n)){
                        n=n+1;
                    }
                    if(n%10 == 9){
                        return firstNum;
                    }
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(139));
    }
}
