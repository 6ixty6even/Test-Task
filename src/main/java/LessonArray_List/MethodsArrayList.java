package LessonArray_List;

import p1.A;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");// додає в арейліст елемент
        System.out.println(list.toString());

        System.out.println(list);


        ArrayList <String>  list1 = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        for (String a:list1){
            System.out.println(a +"довжина стрінга"+ a.length());
        }

    }
}
