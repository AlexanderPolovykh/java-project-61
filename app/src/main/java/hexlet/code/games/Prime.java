package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static String correctAnswer = "";

    public static String getWhatToDo() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    private static boolean isPrime(int n) {
        // Corner case
        if (n <= 1) {
            return false;
        }
        // Check from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String makeQuestion() {
        int number = Engine.getRandomNumber(100);
        correctAnswer = (isPrime(number)) ? "yes" : "no";
        return "" + number;
    }

    public static boolean isGuessed(String answer) {
        if (answer.equals(correctAnswer)) {
            return true;
        }
        return false;
    }

}
