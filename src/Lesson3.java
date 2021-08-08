import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        changeOfArrElement();
        arrayOneHundred();
        multiplicationOfElem();
        diagonalsOfArray();
        createArray();
        MaxMinElem();
        System.out.println(LeftRightSum());
    }

    public static void changeOfArrElement() {
        int[] array1 = {1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < array1.length; i++ ) {
            array1[i] = (array1[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(array1));
    }

    public static void arrayOneHundred () {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++){
            array2[i] = i + 1;
        }
        System.out.println(Arrays.toString(array2));
    }

    public static void multiplicationOfElem() {
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array3.length; i++){
            array3[i] = (array3[i] < 6) ? (array3[i] * 2) : array3[i];
        }
        System.out.println(Arrays.toString(array3));
    }

    public static void diagonalsOfArray() {
        int[][] array4 = new int[6][6];
        for (int i = 0; i < array4.length; i++){
            array4[i][i] = 1;
            array4[i][array4[i].length - 1 - i] = 1;
        }
        for (int i =0; i < array4.length; i++){
            System.out.println(Arrays.toString(array4[i]));
        }
    }

    public static void createArray() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int initialValue = scanner.nextInt();
        int[] array5 = new int[len];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = initialValue;
        }
        System.out.println(Arrays.toString(array5));
    }

    public static void MaxMinElem() {
        int[] array6 = { 1, 12, 34, 72, 2, 13, 16, 7, 8, 3, 4, 125 };
        int min = array6[0];
        int max = array6[0];
        for (int i = 1; i < array6.length; i++) {
            if (array6[i] > max) {
                max = array6[i];
            }
            if (array6[i] < min) {
                min = array6[i];
            }
        }
        System.out.println(Arrays.toString(array6));
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }

    public static boolean LeftRightSum() {
        int[] array7 = { 2, 2, 2, 1, 2, 2, 10, 1 };
        int leftSum = 0;
        for (int i = 0; i < array7.length; i++) {
            leftSum = leftSum + array7[i];
            int rightSum = 0;
            for (int j = (i + 1); j < array7.length; j++) {
                rightSum = rightSum + array7[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

}


//DONE