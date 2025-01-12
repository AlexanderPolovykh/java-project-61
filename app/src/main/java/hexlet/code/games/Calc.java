package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static String correctAnswer = "";

    public static String getWhatToDo() {
        return "What is the result of the expression?";
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static String makeQuestion() {
        int num1 = Engine.getRandomNumber(50);
        int num2 = Engine.getRandomNumber(50);
        String op = "";
        switch (Engine.getRandomNumber(1, 3)) {
            case 1:
                op = " + ";
                correctAnswer = "" + (num1 + num2);
                break;
            case 2:
                op = " - ";
                correctAnswer = "" + (num1 - num2);
                break;
            case 3:
                op = " * ";
                num2 = Engine.getRandomNumber(10);
                correctAnswer = "" + (num1 * num2);
                break;
            default:
                break;
        }
        return num1 + op + num2;
    }

    public static boolean isGuessed(String answer) {
        if (answer.equals(correctAnswer)) {
            return true;
        }
        return false;
    }

}
