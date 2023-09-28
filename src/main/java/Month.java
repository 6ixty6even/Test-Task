public class Month {

    public static void months(int a) {

        switch (a) {//2024 year
            case 1:
                System.out.println("January 31");//Дженьюарі
                break;
            case 2:
                System.out.println("February 29");//Фебруарі
                break;
            case 3:
                System.out.println("March 31");//Марч
                break;
            case 4:
                System.out.println("April 30");//Ейпріл
                break;
            case 5:
                System.out.println("May 31");//Мей
            case 6:
                System.out.println("June 30");//Джун
                break;
            case 7:
                System.out.println("July 31");//Джулай
                break;
            case 8:
                System.out.println("August 31");//Огест
                break;
            case 9:
                System.out.println("September 30");//Септембе
                break;
            case 10:
                System.out.println("October 31");//Октобе
            case 11:
                System.out.println("November 30");//Новембе
            case 12:
                System.out.println("December 31");//Десембе
            default:
                System.out.println("Please input correct number month");
        }
    }

    public static void main(String[] args) {



            for (int a = 0; ; a=a+2000000000) {
                System.out.println(a);
            }
    }

}
