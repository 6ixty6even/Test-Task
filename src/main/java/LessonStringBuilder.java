public class LessonStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Good Day!!!");

        System.out.println(sb1.subSequence(5,8));// тойже substring тільки для стрінг білдера

//                     може буть любий ти данних
        System.out.println(sb1.append("Sun day"));// Добавля до вкінець якесь здачення, і міняє обєкт, не робить новий як стрінг

        System.out.println(sb1.insert(12,"Dog"));// вставляє на вказаний індекс либий тип данних "стрін інт обєкт "

        System.out.println(sb1.delete(0,12));// удаляє з індекса по індекс
        System.out.println(sb1.deleteCharAt(4));// удаляє символ символ на якомусь індексі

        System.out.println(sb1.reverse());//переверта стрін метод тільки для класа стрінг білдер

        StringBuilder sb2 = new StringBuilder("Всім привіт");

        System.out.println(sb2.replace(5,11,"пока"));// міняє стрін з якогось по якийсь індекс на що буде вказано

        sb2.capacity();// вертає кількість елементів масива нашого обєкта


        char [] array = {'p','r','i','v','e','t'};

        StringBuilder stringBuilder = new StringBuilder("Hello World");

        //stringBuilder.append(array,0,5);// 1 параметр що ми добавляєм 2 парам з якого індексу 1 параметру
        // 3 парам скільки елементів буде додано в кінець

        stringBuilder.insert(2,array,1,3);// 1 парам: на якій індекс 2 парам: що вставлять 3 парам:
        System.out.println(stringBuilder);

    }
}
