package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static String correctAnswer = "";

    public static String getWhatToDo() {
        return "What number is missing in the progression?";
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static String makeQuestion() {
        int start = Engine.getRandomNumber(20);
        int step = Engine.getRandomNumber(10);
        final int quantity = 10;
        int who = Engine.getRandomNumber(quantity);
        correctAnswer = "" + (start + (who - 1) * step);
        String result = "";
        for (int idx = 0; idx < quantity; idx++) {
            result += (idx == who - 1) ? ".." : "" + (start + idx * step);
            result += (idx == quantity - 1) ? "" : " ";
        }
        return result;
    }

    public static boolean isGuessed(String answer) {
        if (answer.equals(correctAnswer)) {
            return true;
        }
        return false;
    }

}
