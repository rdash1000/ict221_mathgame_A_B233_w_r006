import java.util.Random;
import java.util.Scanner;

public class Main {
    static void playGame() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int count = 1;

        for (int i = 0; i < 10; i++) {
            int y = rand.nextInt(12 - 1);
            int x = rand.nextInt(12 - 1);
            int operatorId = rand.nextInt(4);
            String operator;

            switch (operatorId) {
                default:
                case 0:
                    operator = "+";
                    break;
                case 1:
                    operator = "-";
                case 2:
                    operator = "*";
                    break;
                case 3:
                    operator = "/";
                    break;
            }

            Question question = new Question(x, y, operator);
            question.showQuestion();

            int response = input.nextInt();
            if (question.checkAnswer(response)) {
                System.out.println("Congratulations, your answer is correct! " +" score = " + count);
                count++;
            } else {
                System.out.println("sorry your answer is inocrrect!");
            }

            if (count == 8) {
                System.out.println("Congraulations on making it this far!");
            }
        }
    }
    }

