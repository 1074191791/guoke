package fun.guoke.common;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fun.guoke.common.entity.A;
import fun.guoke.common.entity.B;
import fun.guoke.common.utils.BeanCopierUtils;

public class BeanCopierUtilsTest {

    public static void main(String[] args) {
        A a = new A();
        a.setId(111L);
        a.setName("zhous");
        a.setAge(new Date());
        List list = new ArrayList();
        A sub = new A();
        sub.setName("suo");
        list.add(sub);
        a.setList(list);

        B b = BeanCopierUtils.convert(a, B.class);

        System.out.println(b);



    }
}
