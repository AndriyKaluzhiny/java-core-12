package maximum;

import java.util.ArrayList;
import java.util.*;

public class ArrayListApp {
    public static void main(String[] args) {
        List arrayList = new ArrayList();

        Person p = new Person(32, "Karl");
        Person p1 = new Person(47, "Steve");
        Person p3 = new Person(27, "George");

        arrayList.add(p);
        System.out.println(arrayList + " " + "Karl has been added");
        arrayList.add(p1);
        System.out.println(arrayList + " " + "Steve has been added");
        arrayList.add(p3);
        System.out.println(arrayList + " " + "George has been added");

        arrayList.remove(0);

        System.out.println("Karl has been removed: " + arrayList);

        arrayList.remove(1);

        System.out.println("George has been removed: " + arrayList);

        arrayList.remove(0);

        System.out.println("Steve has been removed: " + arrayList);
    }
}
