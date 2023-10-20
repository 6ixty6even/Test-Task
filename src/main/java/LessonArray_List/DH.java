package LessonArray_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DH {// Не дає повторюватися стрінгам і сортирує стрінги
    public ArrayList abc(String... s) {
        ArrayList<String> Al = new ArrayList<>();
        for (String s1: s){
            if(!Al.contains(s1)){
                Al.add(s1);
            }
        }
        Collections.sort(Al);
        System.out.println(Al);
        return Al;
    }

}
