import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



    class FirstLesson {
        public static void main(String[] args) throws IOException {
            byte a = 1;
            short b = 123;
            int c = 12345678;
            long d = 123456789123L;
            float e = 1.1f;
            double f = 22.22;
            char g = 'g';
            boolean h = true;
            String i = "text";

            someNums(1, 0, 10, 3);
            System.out.println(from10to20(1, 2));

            System.out.println("write a num to know, if it is positive or negative");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int keybord = Integer.parseInt(reader.readLine());

            posNeg(keybord);

            System.out.println("your num is negative " + negNum(keybord));

            sayHello("Alexey");

            year(2020);
        }
        //3ed task

        public static void  someNums(double a, double b, double c, double d){
            double x = a * (b + (c / d));
            System.out.println(x);
        }

        //4th task

        public static boolean from10to20(int x, int y){
            int xySum = x + y;
            if(xySum >= 10 && xySum <= 20)
                return true;
            else
                return false;
        }

        //5th task

        public static void posNeg(int x){
            if (x >= 0)
                System.out.println("num is positive");
            else
                System.out.println("num is negative");
        }

        //6th task

        public static boolean negNum(int x){
            if(x < 0)
                return true;
            else
                return false;
        }

        //7th task

        public static void sayHello(String name){
            System.out.println("Hello, " + name);
        }

        //8th task

        public static void year(int x){
            if (x % 4 == 0 && x % 100 != 0|| x % 400 == 0)
                System.out.println("year is leap");
            else
                System.out.println("year is not leap");
        }
    }
