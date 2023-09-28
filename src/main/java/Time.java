public class Time {

    static void forLoop() {
        OUTER:
        for (int godyna = 0; godyna < 6; godyna++) {
            MEDDLE:
            for (int khvylyna = 0; khvylyna < 60; khvylyna++) {
                if (godyna > 1 && khvylyna % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int sekunda = 0; sekunda < 60; sekunda++) {
                    if (sekunda * godyna > khvylyna) {
                        continue MEDDLE;
                    }
                    System.out.println("година: " + godyna + " хвилина: " + khvylyna + " секунда: " + sekunda);
                }
            }
        }
    }

    static void whileLoop() {
        int godyna = 0;
        OUTER:
        while (godyna < 6) {
            int khvylyna = 0;
            MIDDLE:
            do {
                if (godyna > 1 && khvylyna % 10 == 0) {
                    break OUTER;
                }
                int sekunda = 0;
                INNER:
                while (sekunda < 60) {
                    if (sekunda * godyna > khvylyna) {
                        continue MIDDLE;
                    }
                    System.out.println("Година: " + godyna + " Хвилина: " + khvylyna + " Секунда: " + sekunda);
                    sekunda++;
                }
                khvylyna++;
            }
            while (khvylyna < 60);
            godyna++;
        }
    }


    public static void main(String[] args) {
        forLoop();

        //whileLoop();

    }
}
