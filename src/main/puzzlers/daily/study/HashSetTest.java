package puzzlers.daily.study;

import puzzlers.puzzle8.ChildClass;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<ChildClass> hashSet = new HashSet<>();
        ChildClass childClass = new ChildClass();
        childClass.count = 1;
        ChildClass childClass2 = new ChildClass();
        childClass2.count = 1;
        hashSet.add(childClass);

        if(hashSet.contains(childClass2)){
            System.out.println("hello");
        }

        hashSet.add(childClass2);
        System.out.println(hashSet.size());
    }
}
