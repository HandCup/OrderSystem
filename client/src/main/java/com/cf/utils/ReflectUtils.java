package com.cf.utils;

import org.apache.commons.lang.reflect.FieldUtils;

import java.lang.reflect.Field;

/**
 * @ClassName ReflectUtils
 * @Description TODO
 * @Author Caofei
 * @Date {2019/11/9} 15:48
 */
public class ReflectUtils {
    public static Object getFieldValue(Object obj, String fieldName){
        if(obj == null){
            return null ;
        }
        Field targetField = getTargetField(obj.getClass(), fieldName);

        try {
            return FieldUtils.readField(targetField, obj, true ) ;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null ;
    }

    public static Field getTargetField(Class<?> targetClass, String fieldName) {
        Field field = null;

        try {
            if (targetClass == null) {
                return field;
            }

            if (Object.class.equals(targetClass)) {
                return field;
            }

            field = FieldUtils.getDeclaredField(targetClass, fieldName, true);
            if (field == null) {
                field = getTargetField(targetClass.getSuperclass(), fieldName);
            }
        } catch (Exception e) {
        }

        return field;
    }
}
