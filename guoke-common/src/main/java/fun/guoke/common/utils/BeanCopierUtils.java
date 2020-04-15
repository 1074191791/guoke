package fun.guoke.common.utils;

import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanCopierUtils {
    private static Map<String, BeanCopier> beanCopierMap = new ConcurrentHashMap();

    public BeanCopierUtils() {
    }

    public static <T> T convert(Object source, Class<T> targetClass) {
        try {
            T t = targetClass.newInstance();
            String beanKey = generateKey(source.getClass(), targetClass);
            BeanCopier copier = null;
            if (!beanCopierMap.containsKey(beanKey)) {
                copier = BeanCopier.create(source.getClass(), targetClass, false);
                beanCopierMap.put(beanKey, copier);
            } else {
                copier = (BeanCopier)beanCopierMap.get(beanKey);
            }

            copier.copy(source, t, (Converter)null);
            return t;
        } catch (Exception var5) {
            throw new RuntimeException("bean copy error:{}", var5);
        }
    }

    public static <T, S> List<T> convertList(List<S> sourceList, Class<T> targetClass) {
        List<T> targetList = new ArrayList();
        Iterator<S> var3 = sourceList.iterator();

        while(var3.hasNext()) {
            S source = var3.next();
            targetList.add(convert(source, targetClass));
        }

        return targetList;
    }

    private static String generateKey(Class<?> class1, Class<?> class2) {
        return class1.toString() + class2.toString();
    }
}
