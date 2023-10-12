public class NextPerfectSquare {
    public static int nextPerfectSquare(int n) {
        int root = 0;
        if (n>=0){
            root = (int) Math.floor(Math.sqrt(n));
        }else{
            root = -1;
        }
        return (root + 1) * (root + 1);
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 36;
        int n3 = 0;
        int n4 = -5;

        System.out.println("Next perfect square for " + n1 + " is " + nextPerfectSquare(n1));
        System.out.println("Next perfect square for " + n2 + " is " + nextPerfectSquare(n2));
        System.out.println("Next perfect square for " + n3 + " is " + nextPerfectSquare(n3));
        System.out.println("Next perfect square for " + n4 + " is " + nextPerfectSquare(n4));
    }
}