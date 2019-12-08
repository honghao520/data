package structure.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> person =null;
        //需要Class的一个入口 3种方法 我们得到的person只是一个Class的一个入口,需要使用入口的方法得到你想要获得类的东西；
        //第1种
        try {
            person = Class.forName("structure.reflection.Reflection");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第二种
        //第三种
        Reflection pre = (Reflection)person.newInstance();
        Method preMethod = person.getMethod("reflectionMethod",Integer.class);
        //preMethod.invoke(pre,null);
        pre.reflectionMethod(1);
    }
}
