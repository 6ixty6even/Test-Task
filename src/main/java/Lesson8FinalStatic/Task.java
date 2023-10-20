package Lesson8FinalStatic;

public class Task {
    int $ = 5;
    int f;
    int F;
    public static final double Pi = 3.14;

    // Множення 3 чисел
    static int mnojennya(int a, int b, int c) {
        int result = a * b * c;
        System.out.println(result);
        return result;
    }

    // Ділення 2 чисел
    static void dilyt(int a, int b) {
        System.out.println("Ціле число "+ a / b+" Залишок "+ a % b);
    }

    //ввести радіус круга, і отримати площину цього круга
    public static double areaCircle (double radius){
        double area = Pi * radius * radius;
        System.out.println("Площина круга " + area);
        return area;
    }

    // ввести радіус круга і отримати довжину круга
    public static double lengthCircle(double radius){
        double length =  2 * Pi * radius;
        System.out.println("Довжиина круга " + length);
        return length     ;
    }

    //Ввести радіус і отримати Радіус,Площу,Довжину і Кола
    public void showRadiusAreaLengthCircle(double radius12) {
        System.out.println("Радіус" + radius12);
        System.out.println("Площа Круга " + areaCircle(radius12));
        System.out.println("Довжина Круга " + lengthCircle(radius12) );
    }
}

class TaskTest {
    public static void main(String[] args) {
        Task.dilyt(1000,4);
        Task.mnojennya(100,100,100);

        Task task = new Task();
        System.out.println(1);

        task.areaCircle(1000);
        Task.lengthCircle(1000);
        System.out.println(1);
        task.showRadiusAreaLengthCircle(1000);

    }
}
