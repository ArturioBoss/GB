package Lession2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        // Задание 1
        inversion();

        // Задание 2
        numberDаy();

        // Задание 3
        count();

        // Задание 4
        cubeArray();

        // Задание 5
        minMax();

        // Задание 6
        System.out.println( balanse(array));

        // Задание 7
        moveArray(array, 3);

    }

    public static void inversion() {
        int[] number = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(number));
        for (int i =0; i<number.length;i++){
            if (number[i]==0){
                number[i]=1;
            }else {
                number[i]=0;
            }
        }
        System.out.println(Arrays.toString(number));

    }

    public static void numberDаy() {
        int[] numberDаy = new int[8];
        for (int i = 0; i < numberDаy.length; i++){
            numberDаy[i] = i*3;
        }
        System.out.println(Arrays.toString(numberDаy));

    }

    public static void count(){
        int[] numberCount = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numberCount.length; i++){
            if ( numberCount[i]<6){
                numberCount[i] = numberCount[i]*2;
            }
        }
        System.out.println(Arrays.toString(numberCount));
    }

    public static void cubeArray(){
        int[][] numberCube = new int[5][5];
        for (int i = 0; i<numberCube.length;i++){
            numberCube[i][i] =1;
            numberCube[i][5-1-i]=1;
            System.out.println(Arrays.toString(numberCube[i]));

        }
    }

    public static void minMax(){
        int[] minMax = {2,6,54,-8,-9,34,26};
        int min = minMax[0];
        int max = minMax[0];
        for (int i=0; i<minMax.length;i++){
            if ( minMax[i]<min){
                min = minMax[i];
            }
            if ( minMax[i]>max){
                max = minMax[i];
            }
        }
        System.out.println("В массиве min ="+min+" max = "+max);
    }

    public static boolean balanse(int[] arr){
        int sum =0;
        int sum2 = 0;
        for (int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        for (int i =0;i<arr.length;i++){
            sum2 +=arr[i];
            if (sum2*2 == sum){
                return true;
            }
            if (sum2*2 > sum){
                return false;
            }
        }
        return false;
    }

    public static void moveArray(int[] move, int n){
        System.out.println(Arrays.toString(move));
        n = n % move.length;
        if (n < 0){
            n = move.length+n;
        }
        for (int i = 0;i<n; i++){
            int temp = move[move.length-1];
            for (int q = move.length-1; q>=1;q--){
                move[q] = move[q-1];

            }
            move[0]=temp;
        }
        System.out.println(Arrays.toString(move));
    }

}
