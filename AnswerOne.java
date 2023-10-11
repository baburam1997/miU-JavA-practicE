public class AnswerOne {
    static String answerOne(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (n == i * i + j * j)
                    return n + " = " + i + "^2" + " + " + j + "^2";
            }
        }
        return n + "cannot be expressed as a sum of two squares.";
    }

    public static void main(String args[]) {
        System.out.println(answerOne(50));
    }
}
