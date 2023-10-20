package LessonArray;

import java.util.Arrays;

public class ArrayCreate {
    public static void main(String[] args) {

        int[] array1;//declaration

        array1 = new int[10];//allocation

        array1[0] = 98;//initialization

        int [] array2 = new int[7];// declaration and allocation

        int [] array3 = {5,8,3,0,6,9};//declaration allocation initialization

        String[] arr = new String[10];//декларація і алокація масива на 10 символ

        arr[0] = "hello";// присвоєння 0 індексу значення  "хело"

        String[] array10 = {"Hello", "World", "ok"};

        String [] array11 = new String[1];

        System.out.println(array1[2]);

        for (int a = 0; a<array10.length; a++) {
            System.out.println(array10[a]);
        }
        System.out.println(array10);
    }
    int[] sort(int []arr){//метод сортирує масів
        Arrays.sort(arr);
        return arr;
    }
}
