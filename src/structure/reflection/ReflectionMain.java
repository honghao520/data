package structure.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        Class<?> person =null;
        //需要Class的一个入口 3种方法 我们得到的person只是一个Class的一个入口,需要使用入口的方法得到你想要获得类的东西；
        //第1种
        Reflection reflection = new Reflection();
        try {
            person = Class.forName("structure.reflection.Reflection");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Reflection pre = (Reflection) person.newInstance();
        CreateMethod.pro(pre,"id",1);
        CreateMethod.create(pre,"reflectionMethod",2);

        System.out.println(pre.getId());




//        Reflection pre = (Reflection)person.newInstance();
//        Method preMethod = person.getMethod("reflectionMethod");
//        preMethod.invoke(person.newInstance(),1);
//        //preMethod.invoke(pre,null);
//        pre.reflectionMethod(1);


        //第二种 获得入口
//        Class<?> reflectionClass = Reflection.class;
////        Method reflectionMethod = reflectionClass.getMethod("reflectionMethod");
//        Field field = reflectionClass.getDeclaredField("id");
//        field.setAccessible(true);
//        field.set(reflectionClass.newInstance(),10);


        //第三种
        Reflection rf = new Reflection();
        Class<?> aClass = rf.getClass();


//        CreateMethod createMethod = new CreateMethod();
//        createMethod.create(new Reflection(),"reflectionMethod");


    }
}
