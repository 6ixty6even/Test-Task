public class LessonStr2 {
    public static void main(String[] args) {
        String s1 = "Чтоб мудро жизнь прожить, знать надобно не мало,Два важных правила запомни для начала: Ты" + "лучше голодай, чем что попало есть,И лучше будь один, чем вместе с кем попало.";
        String s2 = s1.toUpperCase();

        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();

        String x = "privet";
        String y = "privet".trim();//метод trip повертає новий обєкт тоді коли уберає пробіли, а коли не уберає томущо пробілів не має то не робить новий обєет

        System.out.println(x == y);
        email("kdsfgl@gmail.com;");
    }

    public static void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() -1){
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }
}
class L222f{
    LessonStr2 str2 = new LessonStr2();
    LessonStr2 str3 = new LessonStr2();
        }

