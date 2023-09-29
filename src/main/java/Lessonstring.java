public final class Lessonstring {
//        int a = 0;
//        while (a <=10) {
//            System.out.println(a);
//            a++;
//        }


//        int adc ( int a){
//            int result = a % 2;
//            return result;
//        }

    int i = 1;
    int d = 0;

    //
//        //void gfgf () {
//            do {
//                System.out.println(i);
//                i++;
//            } while (i <= 10);
    // }
    void fff() {
        for (; d <= 10; ++d) {
            System.out.println(d);
        }
    }


    public static void main(String[] args) {

        String s = new String("abcdefgabcd");

        boolean b5 = s.contains("defg");// метод виводить true or false чи містить в собі стрінга стрінгу з параметру
        System.out.println(b5);

        int a = s.length();//метод виводить кількість символів стрінги
        System.out.println(a);

        System.out.println(s.charAt(2)); // метод виводить символ за вказаним індексом

        int i1 = s.indexOf('a');// Виводить індекс за вказаним символом 'a' або стрінгом "a"
        System.out.println(i1);

        int i2 = s.indexOf('a', 5);// шукає символ 'а' або стрінги "a" з 5 індекса
        System.out.println(i2);

        boolean b = s.startsWith("abc");// чи наченаєть стрінг з вказаное в методі стрінги  true or false
        System.out.println(b);

        boolean b1 = s.startsWith("abc", 7);// чи наченаєть стрінг з 7 індексу
        System.out.println(b1);

        boolean b2 = s.endsWith("abcd");// чи кінчається стрінг на в казаний в параметрі
        System.out.println(b2);

        String s10 = s.substring(3);// виводить стрінг з вказаного індексу //не один метод викликаний на стрінгу цого не міняє
        System.out.println(s10);
        // стрінг є імьютебл але ми можемо присвоїти результат другій стрінзі

        String s12 = s.substring(3,7);// виводить стрінг з вказаного індексу по вказаний але 7 індекс не буде включений
        System.out.println(s12);

        System.out.println(s.trim());// уберає пробіли по бокам

        String s13 = s.replace("a","Q");// міняє символ або стрінг 2 на 1 параметр
        System.out.println(s13);

        String s2 = "Privet";
        String s3 = "Poka";
        System.out.println(s2.concat(s3));// метод складає 2 стрінги в 1, як +

        System.out.println(s2.toLowerCase());//повертає всю стрінгу з маленькой букви
        System.out.println(s3.toUpperCase());//повертає всю стрінгу з великой букви

    }


}
