import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {


        //first task
        int[] arr = {1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));


        newLine();
        //second task
        int[] arr2 = new int[8];

        int x = 0;

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = x;
            x += 3;
        }
        System.out.println(Arrays.toString(arr2));


        newLine();
        //third task
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++){
         if(arr3[i]<6){
             arr3[i]*=2;
         }
        }
        System.out.println(Arrays.toString(arr3));


        newLine();
        //fourth task
        int[][] arr4 = new int[5][5];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++){
                if ((i == j) || ((arr4.length - i) - 1 == j)) {
                    arr4[i][j] = 1;
                } else arr4[i][j] = 0;
            }
        }

            for (int i = 0; i < arr4.length; i++) {
                System.out.println(Arrays.toString(arr4[i]));
        }


        newLine();
        //fifth task
        int[] arr5 = new int[10];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int) (Math.random() * 100);
        }

            System.out.print(Arrays.toString(arr5));

        int min = arr5[0];
        int max = arr5[0];

            for(int i = 0; i < arr5.length; i++){
                if(arr5[i] < min){
                    min = arr5[i];
                }
            }

            for(int i = 0; i < arr5.length; i++){
                if(arr5[i] > max){
                    max = arr5[i];
                }
            }
        newLine();
        System.out.println("Максимальное значение - " + max);
        System.out.println("Минимальное значение - " + min);


        newLine();
        //sixth task
        int[] arr6 = new int[6];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int) (Math.random() * 10);
        }










    }

    public static void newLine(){
        System.out.println();
    }

    public boolean hasSimpleSides(int[]){

    }

}

