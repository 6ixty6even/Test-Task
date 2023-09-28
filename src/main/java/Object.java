public class Object {
    int id;
    String name;
    String surname;
    double health; //читається хелф
    double stamina;
    double eye;
}

    class ObjectTest {

        static double average(Object ob) {
            double serednya = (ob.health + ob.stamina + ob.eye) / 3;
            System.out.println("name surname id :" + " " + ob.name + " " + ob.surname + " " + ob.id + " " + "Average grade health-stamina-eye" + " " + serednya);
            return serednya;
        }

        public static void main(String[] args) {
            Object obj = new Object();
            obj.id = 2;
            obj.name = "Jack";
            obj.surname = "Jackson";
            obj.health = 7.5;
            obj.stamina = 11.3;
            obj.eye = 15.7;

//            ObjectTest obT = new ObjectTest();
//            obT.average(obj);
//            double ggg = obT.average(obj);
            System.out.println(average(obj));
        }


        int sum(short a, short b) {
            int result2 = a+b;
            System.out.println(result2);
            return result2;
        }

        int sum(short a, short b,short c) {
            int result3 = a+b+c;
            System.out.println(result3);
            return result3;
        }
        int sum(short a, short b, short c, short d) {
            int result4 = a+b+c+d;
            System.out.println(result4);
            return result4;
        }
    }



