import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {

    public static void main(String[] args) throws IOException {
        /*1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

        startGame();
    }

/* У меня такая проблема, я начал делать с BufferedReader, смотрел в интернете как с ним работать с исключениями, так и не понял.
Если делать через сканнер, то представляю немного как работает hasNextInt(попробовал в другом проекте), переделывать все уже было лень.
В некоторых местах получились повторы кода, но я не смог вынести это в отдельный метод.
Скорее всего я просто что-то не понимаю, но идея жаловалась, что нужно инициализировать переменные. А при инициализации начинается хаос...
 */


    public static void startGame() throws IOException {
            int newGame = 0;

            do {
                game();
                System.out.println("Wanna try it again?");
                System.out.println("Write: 1 - to repeat, 0 - end it");


                do {
                    BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
                    newGame = Integer.parseInt(x.readLine());
                    if (newGame > 1 || newGame < 0) {
                        System.out.println("Write: 1 - to repeat, 0 - end it");
                    }
                } while (newGame > 1 || newGame < 0);

            } while (newGame == 1);

            System.out.println("Thx for game!");
        }



        public static void game () throws IOException {

            int gameNum = (int) (Math.random() * 10);
            int countAnswers = 0;
            int answer = 0;
            System.out.println("Lets play a Number Game. U must choose correct number from 0 to 9. You have 3 attempts.");
            System.out.print("Write it here:");

            do {

                do {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    answer = Integer.parseInt(reader.readLine());

                    if(answer>9||answer<1){
                        System.out.println("U must choose correct number from 0 to 9");
                    }

                }while(answer>9||answer<1);


                if (answer > gameNum) {
                    countAnswers++;
                    System.out.println("your answer is higher then need. Attempts left - " + (3 - countAnswers));

                } else if (answer < gameNum) {
                    countAnswers++;
                    System.out.println("your answer is lower then need. Attempts left - " + (3 - countAnswers));

                } else if (answer == gameNum) {
                    System.out.println("Congratulations! You did it!");
                    countAnswers = 3;
                }
            } while (countAnswers != 3);
        }
    }