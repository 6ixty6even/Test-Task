package ParametrsTypeVarargLoopforea;

public class MethodVarargs {
    static void summa(int ...a){//в метод можна писати цифри він їх буде плюсувати
        int summa = 0;
        for (int i = 0; i < a.length; i++){
            summa += a[i];
        }
        System.out.println(summa);
    }


    static String [] student = {"Jake","Garry","Matt"};
    static String [] Lessons = {"Math","History","Geograf"};
    static void studentLessons(){// метод виводить кожному студенту кожен урок
        for (String s1:student){
            for (String s2: Lessons){
                System.out.println(s1 +" "+ s2);
            }
        }
    }

    void showDoubleArray(){//виводи двумірний масив
    int [][] array = {{3,7,8},{4,5},{9,4,4,6,8,3}};
        for (int a = 0; a < array.length; a++){
            for (int b = 0; b < array[a].length; b++){
                System.out.print(array[a][b] +" ");
            }
        }
    }

    void foreaShowDoublearray(){ // такий же як 1 тільки forea
        int [][] array = {{3,7,8},{4,5},{9,4,4,6,8,3}};
        for (int []arra2 : array){
            for (int a : arra2){
                System.out.print(a + " ");
            }
        }
    }
    int []ma = {1,2,3,4,5,6,7,8,9,10};


    public static void main(String[] args) {
        summa(100,100);

        studentLessons();

        MethodVarargs m = new MethodVarargs();

        m.showDoubleArray();

    }
}
