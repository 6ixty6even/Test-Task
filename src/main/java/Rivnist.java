public class Rivnist {
    boolean ravnist(StringBuilder a, StringBuilder b) {
        if (a.equals(b)) {
            System.out.println("2 object are equal");
            return true;
        } else {
            System.out.println("2 object not equal");
            return false;

        }
    }

    static boolean compare(StringBuilder sb1, StringBuilder sb2) {//порівнює два обєкта класа стрінгбілдер чи їхні стрінги однакові
        boolean result = true;                                      // оєбкти
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)){
                    result = false;
                    break;
                }
            }
        }else {
            return false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("Good day");
        StringBuilder st2 = new StringBuilder("Hello friend");
        Rivnist rivnist = new Rivnist();
        rivnist.ravnist(st1, st2);
    }

}
