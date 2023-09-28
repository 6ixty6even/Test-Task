import p1.p2.p3.C;

public class Car {
    String color;
    String motor;
    int door;

    Car(String a, String b, int c) {
        color = a;
        motor = b;
        door = c;
    }
}

class CarTest {
    static public void changeValueDoors(Car car, int Doorsgkhfb) {
        car.door = Doorsgkhfb;
    }

    static public void changeColorsCars(Car car1, Car car2) {
        String car3 = car1.color;
        car1.color = car2.color;
        car2.color = car3;
    }

    public static void main(String[] args) {
        Car car1 = new Car("blue", "v4", 4);
        Car car2 = new Car("white", "v12", 2);

        changeColorsCars(car1, car2);

        changeValueDoors(car1, 2);
        changeValueDoors(car2, 1);

        System.out.println("Кількість дверей " + car1.door + " колір " + car1.color);
        System.out.println("Кількість дверей " + car2.door + " колір " + car2.color);
        _maximum(12,13,14);

    }

    static void _maximum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("m   ax " + a);
        } else if (b > a && b > c) {
            System.out.println("max " + b);
        } else if (c > a && c > b) {
            System.out.println("max " + c);
        }
    }
}
