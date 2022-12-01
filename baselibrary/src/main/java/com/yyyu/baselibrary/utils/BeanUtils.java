package com.yyyu.baselibrary.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-11-30
 */
public class BeanUtils {

    /**
     * 对象转Map
     *
     * @param object
     * @param ignoreNull 是否忽略空
     * @return
     */
    public static Map beanToMap(Object object , boolean ignoreNull) {
        Map<String, Object> map = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object val = field.get(object);
                if (!ignoreNull || val !=null){
                    map.put(field.getName(), field.get(object));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
     * map转对象
     * @param map
     * @param beanClass
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T mapToBean(Map map, Class<T> beanClass) throws Exception {
        T object = beanClass.newInstance();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                continue;
            }
            field.setAccessible(true);
            if (map.containsKey(field.getName())) {
                field.set(object, map.get(field.getName()));
            }
        }
        return object;
    }
}
