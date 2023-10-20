package LessonArray;

public class MaxMin {
    public static void maxMin(double[] array){
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++){

            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Maximum element array " + max + " Minimum element array " + min);
    }
}
