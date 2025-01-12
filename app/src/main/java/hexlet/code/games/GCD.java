package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static String correctAnswer = "";

    public static String getWhatToDo() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    private static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static String makeQuestion() {
        int num1 = Engine.getRandomNumber(100);
        int num2 = Engine.getRandomNumber(100);
        correctAnswer = "" + gcdByBruteForce(num1, num2);
        return num1 + " " + num2;
    }

    public static boolean isGuessed(String answer) {
        if (answer.equals(correctAnswer)) {
            return true;
        }
        return false;
    }

}
