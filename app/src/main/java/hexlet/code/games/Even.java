package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    static String correctAnswer = "";

    public static String getWhatToDo() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static String makeQuestion() {
        int number = Engine.getRandomNumber(100);
        correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return "" + number;
    }

    public static boolean isGuessed(String answer) {
        if (answer.equals(correctAnswer)) {
            return true;
        }
        return false;
    }

}
