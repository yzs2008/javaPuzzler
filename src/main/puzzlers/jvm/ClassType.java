package puzzlers.jvm;

/**
 * Created by kaidi on 2016/6/22.
 * 验证class type
 */
public class ClassType {

    public static void main(String[] args) {
        ClassType type = new ClassType();

        if(type instanceof  ClassType){
            System.out.println(" type is instance of ClassType");
        }
        if(type.getClass() == ClassType.class){
            System.out.println(" type.getClass == ClassType.class");
            System.out.println(type.getClass());
            System.out.println(ClassType.class);
        }
        if(type.getClass() == new ClassType().getClass()){
            System.out.println(" type.getClass == new ClassType.getClass");
        }
    }
}

