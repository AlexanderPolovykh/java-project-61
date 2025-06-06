package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Engine {

    public static int getRandomNumber(int low, int high) {
        return (int) Math.round(Math.random() * (high - low) + low);
    }

    public static int getRandomNumber(int high) {
        return (int) Math.round(Math.random() * (high - 1.0) + 1.0);
    }

    public static void makeGame(String name, int game) {
        var in = new Scanner(System.in);
        var youWin = true;
        String answer = "";
        String whatToDo = "";
        if (game == 2) {
            whatToDo = Even.getWhatToDo();
        } else if (game == 3) {
            whatToDo = Calc.getWhatToDo();
        } else if (game == 4) {
            whatToDo = GCD.getWhatToDo();
        } else if (game == 5) {
            whatToDo = Progression.getWhatToDo();
        } else if (game == 6) {
            whatToDo = Prime.getWhatToDo();
        }
        System.out.println(whatToDo);
        for (int idx = 0; idx < 3; idx++) {
            String question = "";
            if (game == 2) {
                question = Even.makeQuestion();
            } else if (game == 3) {
                question = Calc.makeQuestion();
            } else if (game == 4) {
                question = GCD.makeQuestion();
            } else if (game == 5) {
                question = Progression.makeQuestion();
            } else if (game == 6) {
                question = Prime.makeQuestion();
            }
            System.out.printf("Question: %s\n", question);
            System.out.print("Your answer: ");
            answer = in.next();
            boolean guessed = false;
            if (game == 2) {
                guessed = Even.isGuessed(answer);
            } else if (game == 3) {
                guessed = Calc.isGuessed(answer);
            } else if (game == 4) {
                guessed = GCD.isGuessed(answer);
            } else if (game == 5) {
                guessed = Progression.isGuessed(answer);
            } else if (game == 6) {
                guessed = Prime.isGuessed(answer);
            }
            if (!guessed) {
                youWin = false;
                break;
            }
            System.out.println("Correct!");
        }
        in.close();
        if (youWin) {
            System.out.printf("Congratulations, %s!\n", name);
        } else {
            String corrAnswer = "";
            if (game == 2) {
                corrAnswer = Even.getCorrectAnswer();
            } else if (game == 3) {
                corrAnswer = Calc.getCorrectAnswer();
            } else if (game == 4) {
                corrAnswer = GCD.getCorrectAnswer();
            } else if (game == 5) {
                corrAnswer = Progression.getCorrectAnswer();
            } else if (game == 6) {
                corrAnswer = Prime.getCorrectAnswer();
            }
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, corrAnswer);
            System.out.printf("Let's try again, %s!\n", name);
        }
//        return;
    }

}
