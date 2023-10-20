package Lesson9ScopeofVariable;

import Lesson8FinalStatic.*;
import java.lang.*;

public class Some {
    int a = 1;

    //static int a =2;
    public static void main(String[] args) {
        Task.lengthCircle(1000);


        Task task = new Task();
        task.showRadiusAreaLengthCircle(10);

    }
}
