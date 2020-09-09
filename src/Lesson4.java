import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    public static class MainClass {
        public static int SIZE = 3;
        public static int DOTS_TO_WIN = 3;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static boolean checkWin(char symb) {
            int countV;
            int countH;
            int countDiagonalA = 0;
            int countDiagonalB = 0;
            for (int i = 0; i <= SIZE - 1; i++) {
                countH = 0;
                countV = 0;
                for (int j = 0; j <= SIZE - 1; j++) {
                    //проверка горизонтали
                    if (map[i][j] == symb) {
                        countH++;
                        if (countH == SIZE) return true;
                    }

                    //проверка вертикали
                    if (map[j][i] == symb) {
                        countV++;
                        if (countV == SIZE) return true;
                    }
                }

                // проверка диагонали  A "\"
                if (map[i][i] == symb) {
                    countDiagonalA++;
                    if (countDiagonalA == SIZE) return true;
                } else countDiagonalA = 0;

                // проверка диагонали B "/"
                if (map[i][SIZE - 1 - i] == symb) {
                    countDiagonalB++;
                    if (countDiagonalB == SIZE) return true;
                } else countDiagonalB = 0;
            }
            return false;
        }

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[x][y] = DOT_O;
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[x][y] = DOT_X;
        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[x][y] == DOT_EMPTY) return true;
            return false;
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}