package LessonArray;

import java.util.Arrays;

public class ArrayMethods {


    public static void main(String[] args) {

        int[] array = {6, 4, -1, 5, -9, 8, 13, 17, 12, 100};

        Arrays.sort(array);// мотод сортирує масив від меншого до більшого числа

        for (int a = 0; a < array.length; a++){
            System.out.print(array[a]+ " ");
        }
        System.out.println();

        System.out.println(Arrays.binarySearch(array,100));//метод нормально робить коли масив відсортирований; вертає індекс value в масиві

        int [] ar = {1,2,3,4,5};
        int [] ar2 = {1,2,3,4};                 //якшо 1 то 2 масив первий по алфавіту
        System.out.println(Arrays.compare(ar,ar2));//якшо -1 то первий масив іде першим по алфавіту (aб першиі чим ав),також з цифрами
        System.out.println(Arrays.mismatch(ar,ar2));// виводить індекс на якому масиви перестають збігатися
    }
}
