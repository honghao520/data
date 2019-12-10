package structure.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 为各种类创建方法
 */
public class CreateMethod {
    public static void create(Object obj,String methodName,Object value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> aClass = obj.getClass();
        Method method = null;

        if (value==null){
            method = aClass.getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(obj);
        }else {
            method = aClass.getDeclaredMethod(methodName,value.getClass());
            method.setAccessible(true);
            method.invoke(obj,value);
        }



    }

    /**
     *
     * @param obj 对象
     * @param proName 修改属性
     * @param value 修改的内容
     */
    public static void  pro(Object obj,String proName,Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = obj.getClass();
        Field field = aClass.getDeclaredField(proName);
        field.setAccessible(true);
        field.set(obj,value);
    }
}
